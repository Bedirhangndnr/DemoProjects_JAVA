package eTicaretBackendDemo.DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretBackendDemo.DataAccess.abstracts.IUserDao;
import eTicaretBackendDemo.Entities.contretes.User;

public class UserDao implements IUserDao {
	private List<User> users= new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public void save(User user) {
		users.add(user);
		System.out.println("************KAYIT ALINDI*************");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User deleteUser) {
		System.out.println(deleteUser.geteMail()+ "Mail adresine sahip kullanici sistemimizi terketti.");
		this.users.remove(this.users.indexOf(deleteUser));
	}

	@Override
	public User get(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
