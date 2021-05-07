package eTicaretBackendDemo.Business.abstracts;

import java.util.List;

import eTicaretBackendDemo.Entities.contretes.User;

public interface IValidation {
	boolean checkPassword(User user);
	boolean isNamesBiggerThanTwo(User user);
	public boolean isEmailValid(User user, List<User> users);
	boolean codeIsEqual(String cm);
}
