package es.deusto.ingenieria.sd.strava.client.gui;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
import es.deusto.ingenieria.sd.strava.client.controller.RetoController;
import es.deusto.ingenieria.sd.strava.client.controller.SesionController;
import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;


public class VentanaPrincipal extends JFrame {
	//DECLARACION DE LOS ATRIBUTOS
	
	private JPanel contentPane;
	private JPanel panelCentral, panelArriba, panelNorte, panelArribaDrc, panelArribaIzq, panelNorteIzq, panelNorteMedio, panelNorteDrc;
	private JPanel panelP1, panelP2, panelArribaIzq1, panelArribaIzq12, panelArribaIzq2;
	private JFrame ventanaActual;
	
	private JLabel lblTitulo;
	public static JLabel lblNombre;
	private JLabel lblHora, lblFrase;
	public static JProgressBar pb = new JProgressBar();
	public static SpinnerModel modelosp;
	public static ArrayList<String> listaHistorialBusqueda = new ArrayList<String>();
	
	
	static Logger log = Logger.getLogger("Log de Usuarios");
	private JButton btnReto;
	private JButton btnEntrenamiento;
	private JPanel panelArribaIzq13;
	private JButton btnInicioSesion_1;
	private JButton btnSalir_1;
	private JButton btnCerrarSesion_1;
	private JButton btnRegistrarme_1;
	private JPanel panel_2;
	
	private SesionController sesionController;
	private LoginController loginController;
	private RetoController retoController;
	private JPanel panel;

	public VentanaPrincipal(ServiceLocator service) {
		
		//CREACION DEL LOGGER
		
		
		sesionController = new SesionController(service);
		loginController = new LoginController(service);
		retoController = new RetoController(service);
		
		//PROPIEDADES DE LA VENTANA
		ventanaActual = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(325, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		//CREAMOS LOS PANELES
		panelCentral = new JPanel();
		panelCentral.setBackground(new Color(192, 192, 192));
		panelCentral.setLayout(new GridLayout(0,1,0,0));
		
		panelArriba = new JPanel();
		panelArriba.setBackground(new Color(192, 192, 192));
		panelArriba.setLayout(new GridLayout(2,0,0,0));
		panelCentral.add(panelArriba);
		
		panelArribaIzq = new JPanel();
		panelArribaIzq.setLayout(new GridLayout(2, 1));
		panelArriba.add(panelArribaIzq);
		panelArribaIzq.setBackground(new Color(255, 102, 0));
		
		panelArribaIzq1 = new JPanel();
		panelArribaIzq.add(panelArribaIzq1);
		panelArribaIzq1.setLayout(new GridLayout(0,3,0,0));
		panelArribaIzq1.setBackground(new Color(255, 102, 0));
		
		panelArribaIzq12 = new JPanel();
		panelArribaIzq1.add(panelArribaIzq12);
		panelArribaIzq12.setBackground(new Color(255, 102, 0));
		
		panelArribaIzq2 = new JPanel();
		panelArribaIzq.add(panelArribaIzq2);
		panelArribaIzq2.setBackground(new Color(255, 102, 0));
		
	   
		panelArribaDrc = new JPanel();
		panelArriba.add(panelArribaDrc);
		panelArribaDrc.setLayout(new GridLayout(2, 3));
		panelArribaDrc.setBackground(new Color(192, 192, 192));
		
		panelNorte = new JPanel();
		panelNorte.setBackground(Color.WHITE);
		panelNorte.setLayout(new GridLayout(0,3,0,0));
		
		panelNorteIzq = new JPanel();
		panelNorteIzq.setBackground(new Color(255, 102, 0));
		panelNorte.add(panelNorteIzq);
		
		
		panelNorteMedio = new JPanel();
		panelNorteMedio.setBackground(new Color(255, 102, 0));
		panelNorte.add(panelNorteMedio);
		
		panelNorteDrc = new JPanel();
		panelNorteDrc.setBackground(new Color(255, 102, 0));
		panelNorte.add(panelNorteDrc);
	
		panelP1 = new JPanel();
		panelArribaDrc.add(panelP1);
		panelP1.setBackground(new Color(192, 192, 192));
		panelP1.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 102, 0));
		panelP1.add(panel);
		
		btnReto = new JButton("RETO");
		panel.add(btnReto);
		btnReto.setBackground(new Color(255,128,1));
		
				btnReto.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						VentanaReto v1 = new VentanaReto(retoController);
					}
				});
		
		panelP2 = new JPanel();
		panelArribaDrc.add(panelP2);
		panelP2.setBackground(new Color(255, 102, 0));
		panelP2.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 102, 0));
		panelP2.add(panel_2);
		
		btnEntrenamiento = new JButton("ENTRENAMIENTO");
		panel_2.add(btnEntrenamiento);
		btnEntrenamiento.setBackground(new Color(255,128,1));
		btnEntrenamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEntrenamiento vE = new VentanaEntrenamiento(sesionController);
			}
		});
		
		
		
		
		
		//INSERTAMOS LOS PANELES AL PANEL PRINCIPAL DE LA VENTANA
		contentPane.add(panelCentral, BorderLayout.CENTER);
		contentPane.add(panelNorte, BorderLayout.NORTH);
		
		lblNombre = new JLabel("");
		
		lblTitulo = new JLabel("");

		lblTitulo.setForeground(Color.BLACK);

        lblFrase = new JLabel("");

        ImageIcon im1 = new ImageIcon("imagenes//text.gif");
        ImageIcon imagenConDimensiones1 = new ImageIcon(im1.getImage().getScaledInstance(400,75,Image.SCALE_DEFAULT));
        lblFrase.setIcon(imagenConDimensiones1);
		
		FlowLayout flowLayout = (FlowLayout) panelNorteIzq.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		FlowLayout flowLayout2 = (FlowLayout) panelNorteDrc.getLayout();
		flowLayout2.setAlignment(FlowLayout.RIGHT);
		
		panelNorteMedio.add(lblTitulo);
		
		lblHora = new JLabel("");
		
		modelosp = new SpinnerNumberModel(50, 0, 100, 1);
		
		panelNorteDrc.add(lblHora);
		
		panelArribaIzq13 = new JPanel();
		panelArribaIzq13.setBackground(new Color(255, 102, 0));
		panelArribaIzq1.add(panelArribaIzq13);
		
		btnInicioSesion_1 = new JButton();
		btnInicioSesion_1.setBackground(new Color(255, 128, 64));
		panelArribaIzq13.add(btnInicioSesion_1);
		
		btnSalir_1 = new JButton();
		btnSalir_1.setBackground(new Color(255, 0, 128));
		panelArribaIzq13.add(btnSalir_1);
		
		btnCerrarSesion_1 = new JButton();
		btnCerrarSesion_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCerrarSesion_1.setBackground(new Color(255, 0, 128));
		panelArribaIzq13.add(btnCerrarSesion_1);
		
		btnRegistrarme_1 = new JButton();
		
		btnRegistrarme_1.setBackground(new Color(255, 0, 128));
		panelArribaIzq13.add(btnRegistrarme_1);
		
		
		panelNorteIzq.add(lblNombre);
		
		panelArribaIzq2.add(lblFrase);
		
		setLocationRelativeTo( null );
		
		ponerFotoABoton(btnInicioSesion_1, "imagenes//iconoIniciarSesion.png", 30, 30, 30, 30);
		
		ponerFotoABoton(btnSalir_1, "imagenes//iconoSalirPagina.png", 30, 30, 30, 30);
		
		ponerFotoABoton(btnRegistrarme_1, "imagenes//iconoRegistrarUsuario.png", 30, 30, 30, 30);
		
		ponerFotoABoton(btnCerrarSesion_1, "imagenes//iconoCerrarSesion.png", 30, 30, 30, 30);
		

		
		
		btnRegistrarme_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegis vReg = new VentanaRegis(loginController);
			}
		});
		
		btnSalir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		
		btnInicioSesion_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLog v = new VentanaLog(loginController, service);
			}
		});
		
		setVisible(true);
	}
		
		 	
	
	public static void ponerFotoABoton (JButton btn, String rutaFoto, int x, int y, int width, int height) {
		btn.setBounds(x, y, width, height);
		int ancho = btn.getWidth();
		int alto = btn.getHeight();
		ImageIcon icon = new ImageIcon(rutaFoto);
		Icon i = new ImageIcon(icon.getImage().getScaledInstance(alto, ancho, Image.SCALE_DEFAULT));
		btn.setIcon(i);
		btn.setBackground(new Color(255,128,0));
	}
	
    
	
}





