package es.deusto.ingenieria.sd.strava.client;

import java.awt.EventQueue;

//import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
import java.util.List;

import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
//import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//import es.deusto.ingenieria.sd.strava.client.controller.RetoController;
//import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
//import es.deusto.ingenieria.sd.strava.client.controller.SesionController;
//
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaEntrenamiento;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaInicioSesion;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaLog;
//import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaRegis;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaReto;
//
//import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//import es.deusto.ingenieria.sd.strava.server.data.dto.RetoDTO;
//import es.deusto.ingenieria.sd.strava.server.data.dto.SesionDTO;
//import es.deusto.ingenieria.sd.strava.server.data.dto.UsuarioDTO;


public class MainProgram {

//	public static void main(String[] args) {
//		ServiceLocator serviceLocator = new ServiceLocator();
//		
//		//args[0] = RMIRegistry IP
//		//args[1] = RMIRegistry Port
//		//args[2] = Service Name
//		serviceLocator.setService(args[0], args[1], args[2]);
//		
//		LoginController loginController = new LoginController(serviceLocator);
//		ventana ventanaEntrenamiento = new ventanaEntrenamiento(sesion);			
//		BidController bidController = new BidController(serviceLocator);			
//		BidWindow bidWindow = new BidWindow(bidController);
//		
//		//Login
//		loginDialog.login();		
//		//Get Categories
//		List<CategoryDTO> categories = bidWindow.getCategories();
//		//Get Articles of a category (first category is selected)
//		List<ArticleDTO> articles = bidWindow.getArticles(categories.get(0).getName());
//		//Convert currency to GBP
//		bidWindow.currencyToGBP(articles);
//		//Convert currency to USD
//		bidWindow.currencyToUSD(articles);
//		//Place a bid (first article of the category is selected; the token is stored in the BidController)
//		bidWindow.makeBid(loginController.getToken(), articles.get(0));
//		//Get Articles to check if the bid has been done
//		articles = bidWindow.getArticles(categories.get(0).getName());
//		//Logout
//		loginDialog.logout();
//	}
//	

	public static void main(String[] args) {
		
		ServiceLocator serviceLocator = new ServiceLocator();

        //args[0] = RMIRegistry IP
        //args[1] = RMIRegistry Port
        //args[2] = Service Name
        serviceLocator.setService(args[0], args[1], args[2]);

        /*
        LoginController loginController = new LoginController(serviceLocator);
        LoginDialog loginDialog = new LoginDialog(loginController);
        BidController bidController = new BidController(serviceLocator);
        BidWindow bidWindow = new BidWindow(bidController);

        //Login
        loginDialog.login();
        //Get Categories

        //Logout
        loginDialog.logout();
        */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal(serviceLocator);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
	}

}
