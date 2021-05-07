package eTicaretBackendDemo.Business.abstracts;

import java.util.List;

import eTicaretBackendDemo.Entities.contretes.User;

public interface IUserManager {
	void saveUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	void getUser(User user);
	List<User>getAllUser();// Products array'i dondur.
}
