package es.deusto.ingenieria.sd.strava.client.controller;

import java.rmi.RemoteException;

import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//This class implements Controller pattern.
public class LoginController {	
	
	//Reference to the Service Locator
	private ServiceLocator serviceLocator;
	//This attibute stores the token when login success
	private long token = -1; //-1 = login has not been done or fails

	public LoginController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String mail, String contr) {
		try {
			this.token = this.serviceLocator.getService().login(mail, contr);			
			return true;
		} catch (RemoteException e) {
			System.out.println("# Error during login: " + e);
			this.token = -1;
			return false;
		}
	}
	
	public void logout() {
		try {
			this.serviceLocator.getService().logout(this.token);
			this.token = -1;
		} catch (RemoteException e) {
			System.out.println("# Error during logout: " + e);
		}
	}

	public void signup(String nombre, String contr, String mail, String fNac, 
            double peso, int altura, double fCardiacaMaxima, double fCardiacaReposo, String log) {
		this.serviceLocator.getService().signup(nombre, contr, mail, fNac, peso, altura, fCardiacaMaxima, fCardiacaReposo, log);
	
	}
	
	
	public long getToken() {
		return token;
	}
	
	public Servicelocator getServiceLocator() {
		return serviceLocator;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}