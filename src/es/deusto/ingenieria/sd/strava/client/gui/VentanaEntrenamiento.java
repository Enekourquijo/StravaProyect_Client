package es.deusto.ingenieria.sd.strava.client.gui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import es.deusto.ingenieria.sd.strava.client.controller.SesionController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class VentanaEntrenamiento extends JFrame{
	private SesionController controller;
	
	public VentanaEntrenamiento(SesionController sesionController) {
		
		controller = sesionController;
		
		setBounds(425, 150, 800, 408);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel labelSesion = new JLabel("Sesiones Actuales");
		labelSesion.setForeground(new Color(255, 255, 255));
		labelSesion.setFont(new Font("Tahoma", Font.BOLD, 10));
		labelSesion.setVerticalAlignment(SwingConstants.TOP);
		labelSesion.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(labelSesion, BorderLayout.NORTH);
		
		JComboBox comboBoxSesion = new JComboBox();
        comboBoxSesion.setModel(new DefaultComboBoxModel(controller.getSesion().toArray()));
		panel_1.add(comboBoxSesion);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 64));
		panel.add(panel_2);
		
		JButton btnCrearSesion = new JButton("Creacion Sesion");
		btnCrearSesion.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCrearSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String regexIniFech = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
				String regexIniHora = "[0-9]{2}:[0-9]{2}";
				String[] tipos = {"CICLISMO","RUNNING"};
				
				String titulo = JOptionPane.showInputDialog("Titulo de la sesion:");
				String deporte = (String) JOptionPane.showInputDialog(null, "Deporte a realizar: ", "Tipo de deporte", JOptionPane.QUESTION_MESSAGE, null, tipos, "CICLISMO");
				String distancia = JOptionPane.showInputDialog("Distancia por recorrer en metros: ");
				String fechIni = JOptionPane.showInputDialog("Fecha Inicial del reto: ");
				String horaIni = JOptionPane.showInputDialog("Hora de inicio de la sesion: ");
				String duracion = JOptionPane.showInputDialog("Duracion:  ");
				
				
//				SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
//				SimpleDateFormat sdfHora = new SimpleDateFormat("");
				
				if(Pattern.matches(regexIniFech, fechIni) && Pattern.matches(regexIniHora, horaIni)){
					JOptionPane.showMessageDialog(null,"sesion creada con exito", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,  "debe introducir bien las fechas" , "error",JOptionPane.ERROR_MESSAGE);
				}
				
				controller.makeSesion(titulo, deporte, Double.parseDouble(distancia), fechIni, Integer.parseInt(horaIni), Double.parseDouble(duracion));
				repaint();
				
			}
		});
		panel_2.add(btnCrearSesion);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 64));
		panel.add(panel_3);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(btnSalir);
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		
		setVisible(true);
	}
	
}