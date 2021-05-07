package eTicaretBackendDemo;
import java.util.Scanner;

import eTicaretBackendDemo.Business.abstracts.IAuthenticationServices;
import eTicaretBackendDemo.Business.abstracts.IUserManager;
import eTicaretBackendDemo.Business.concretes.UserManager;
import eTicaretBackendDemo.Business.concretes.Validation;
import eTicaretBackendDemo.Business.concretes.jGoogleAuthenticationAdaptor;
import eTicaretBackendDemo.DataAccess.abstracts.IUserDao;
import eTicaretBackendDemo.DataAccess.concretes.UserDao;
import eTicaretBackendDemo.Entities.contretes.User;



public class main {
	
	public static void main(String[] args) {
		UserDao userdao=new UserDao();
		IUserManager usermanager= new UserManager(new UserDao(), new Validation(userdao));
		System.out.println("---------Kayit1:---------");
		User user= new User("Bedirhan", "Gundoner", 21, "bedirhangndnr@gmail.com", "MoonlordDayturn");
		usermanager.saveUser(user);
		System.out.println("\n\n");
		
		System.out.println("---------Kayit2:---------");
		User user2= new User("Busquest", "Gun", 21, "xxthBusquest@gmail.com", "sifre123");
		usermanager.saveUser(user2);
		System.out.println("\n\n");

		System.out.println("---------Kayit3:--------- || Sifre 5 karakter");
		User user3= new User("Legolas", "Gun", 21, "Legolas@gmail.com", "sifre");
		usermanager.saveUser(user3);
		System.out.println("\n\n");
		
		System.out.println("---------Kayit4:---------");
		User user4= new User("Lionel Messi", "Gun", 21, "LionelMessi@gmail.com", "sifre3");
		usermanager.saveUser(user4);
		System.out.println("\n\n");
		
		System.out.println("---------Kayit5:--------- || Mail adresi bir onceki ile ayni");
		User user5= new User("Lionel Messi", "Gun", 21, "LionelMessi@gmail.com", "sifre3");
		usermanager.saveUser(user5);
		System.out.println("\n\n");
		
		System.out.println("---------Kayit6:--------- || isim 2 harf");
		User user6= new User("Li", "Gun", 21, "Williams@gmail.com", "sifre3");
		usermanager.saveUser(user6);
		System.out.println("\n\n");



		
		System.out.println("CHECK THE CURRENT USER LIST");
		for (User user_: usermanager.getAllUser()) {
			System.out.println(user_.getFirstName());
		}
		
		System.out.println("\n"+"Delete a User"+ user.geteMail());
		usermanager.deleteUser(user);
		
		System.out.println("\n"+"CHECK AGAIN:");
		for (User user_: usermanager.getAllUser()) {
			System.out.println(user_.getFirstName());
		}
		usermanager.logIn("bedirhangndnr@gmail.com", "MoonlordDayturn");
		IAuthenticationServices ýaAuthenticationServices=new jGoogleAuthenticationAdaptor();
		ýaAuthenticationServices.save("bedirhangndr@gmail.com", "15975369874123");
		
		
	}
}