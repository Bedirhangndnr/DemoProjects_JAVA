package eTicaretBackendDemo.Business.concretes;

import eTicaretBackendDemo.Business.abstracts.IAuthenticationServices;
import jGoogleAuthentication.jGoogleUserManager;

public class jGoogleAuthenticationAdaptor implements IAuthenticationServices {

	jGoogleUserManager googleManager=new jGoogleUserManager();
	@Override
	public void save(String mail, String password) {
		googleManager.save(mail, password);
	}

	@Override
	public void logIn(String mail, String password) {
		googleManager.save(mail, password);
	}

}
