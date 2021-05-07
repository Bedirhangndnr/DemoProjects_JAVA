package eTicaretBackendDemo.Core.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eTicaretBackendDemo.Core.abstracts.IValidation;
import eTicaretBackendDemo.DataAccess.abstracts.IUserDao;
import eTicaretBackendDemo.DataAccess.concretes.UserDao;
import eTicaretBackendDemo.Entities.contretes.User;

public class Validation implements IValidation {
	IUserDao userdao;
	public Validation(IUserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola gecersiz. Parola minimum 6 karakterden olusmalidir! Kayit Yapilamadi!!!!!!!!!!!!!");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean isNamesBiggerThanTwo(User user) {
		if(user.getFirstName().length()>2 && user.getLastName().length()>2) {
			return true;
		}
		else {
			System.out.println("Name and Last Name must contain more than 2 characters! Kayit Yapilamadi!!!!!!!!!!!!!");
			return false;
		}
	}
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	@Override
	public boolean isEmailValid(User user, List<User> users_ ) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(user.geteMail()).find()) {
			for (User user_ : users_) {
				if(user_.geteMail().equals(user.geteMail())) {
					System.out.println("Mail Is Already Exist! Kayit Yapilamadi!!!!!!!!!!!!!");
					return false;
				}
			}
			return true;
		}
		System.out.println("Mail Doesn't Right Format! Kayit Yapilamadi!!!!!!!!!!!!!");
		return false;
	}

	String confirmCode="0";
	@Override
	public boolean codeIsEqual(String code) {
		if(confirmCode.equals(code)) {
			System.out.println("Succesful... Onay kodu eslestirildi...");
			return true;
		}else {			
			System.out.println("Wrong code... Onay kodu eslestirilemedi! Kayit Yapilamadi!!!!!!!!!!!!!");
			return false;
		}
	}


}
