package es.deusto.ingenieria.sd.strava.client.controller;

import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

public class RetoController {
	private ServiceLocator serviceLocator;
	public RetoController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	public List<String> getDeporte() {
        try {
            return this.serviceLocator.getService().getDeporteRet();
        } catch (Exception e) {
            System.out.println(" # Error during getDepRet: " + e);
            return null;
        }
    }

    public void makeReto(String nombre, String fIni, String fFin, double dist, double obj, String deporte) {
        try {
            this.serviceLocator.getService().makeReto(nombre, fIni, fFin, dist, obj, deporte);
        } catch(Exception e) {
            System.out.println(" # Error during reto making: " + e);
        }
    }

    public List<String> getReto() {
        try {
            List<String> list = this.serviceLocator.getService().getReto();
            return list;
        } catch(Exception e) {
            System.out.println(" # Error during get Reto: " + e);
            return null;
        }
    }

    public List<String> getRetoAct() {
        try {
            return this.serviceLocator.getService().getRetoActivado();
        } catch(Exception e) {
            System.out.println(" # Error during get RetoAct: " + e);
            return null;
        }
    }

    public void makeRetoAct(String s) {
        try {
            this.serviceLocator.getService().activateReto(s);
        } catch(Exception e) {
            System.out.println(" # Error Activate Reto: " + e);
        }
    }

}
