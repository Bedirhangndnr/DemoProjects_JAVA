package eTicaretBackendDemo.Core;
/**baska sistemlerine direkt baðimli olmamak adina nu interface i kullanacagiz*/
public interface IAuthenticationServices {
	void save(String mail, String password);
	void logIn(String mail, String password);
}
