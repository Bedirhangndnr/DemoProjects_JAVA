package eTicaretBackendDemo.Business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import eTicaretBackendDemo.Core.abstracts.IValidation;
import eTicaretBackendDemo.Business.abstracts.IUserManager;
import eTicaretBackendDemo.Entities.contretes.User;
import eTicaretBackendDemo.DataAccess.abstracts.IUserDao;
import eTicaretBackendDemo.DataAccess.concretes.UserDao;
public class UserManager implements IUserManager{
	/** Dependency Injection | Bununla birlikt ebaska bir projede bizden, 
	 * "Su tipte userlarýn sifresi 10 hafr olsun" gibi bir talimat gelirse, bunu gayet 
	 * dinamik bir sekilde halledebiliriz.*/
	private List<String> mailList;
	// = new ArrayList<String>()

	IUserDao userDao;
	IValidation validation;
	
	public UserManager(IUserDao userDao, IValidation validation) {
		super();
		this.userDao = userDao;
		this.validation = validation;
	}

	public void saveUser(User user) {
		boolean parolaIsValid=validation.checkPassword(user);
		boolean mailIsValid=validation.isEmailValid(user,this.getAllUser());
		boolean nameLastIsValid=validation.isNamesBiggerThanTwo(user);
		if(parolaIsValid && mailIsValid && nameLastIsValid) {
			System.out.println("Giris bilgileriniz uygun, lutfen mail adresinize gonderilen kodu giriniz, demo code: 000");
			@SuppressWarnings("resource")
			Scanner confirmMail_ = new Scanner(System.in);
			String cm = confirmMail_.next();
			if(validation.codeIsEqual(cm)) {
				userDao.save(user);
				return;
			}else {
				System.out.println("Onay kodunu yanlis girdiniz, tekrar kayit olmadi deneyin ya da sistemi dehal terk edin.");
				return;
			}
		}
	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);
		
	}

	@Override
	public void getUser(User user) {
		userDao.get(user);
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public void logIn(String mail, String password) {
		for (User user_: this.getAllUser()) {
			if(user_.geteMail().equals(mail)&& user_.getPassword().equals(password)) {
				System.out.println(user_.geteMail()+" Hesabina Giris Yapildi.");
				return;
			}
		}
		System.out.println("Email veya sifre hatali. Giris yapilamadi.");
		
	}






}
