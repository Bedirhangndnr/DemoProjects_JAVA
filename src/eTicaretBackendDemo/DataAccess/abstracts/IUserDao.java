package eTicaretBackendDemo.DataAccess.abstracts;

import java.util.List;

import eTicaretBackendDemo.Entities.contretes.User;

public interface IUserDao {
	void save(User user);
	void update(User user);
	void delete(User user);
	User get(User user);
	List<User>getAll();// Products array'i dondur.
}
