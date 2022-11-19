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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class ventanaEntrenamiento extends JFrame{
	private JTable table;
	public ventanaEntrenamiento() {
		
		setBounds(425, 150, 800, 408);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel labelSesion = new JLabel("Sesiones Actuales");
		labelSesion.setVerticalAlignment(SwingConstants.TOP);
		labelSesion.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(labelSesion, BorderLayout.NORTH);
		
		table = new JTable();
		panel_1.add(table, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JButton btnCrearSesion = new JButton("Creacion Sesion");
		btnCrearSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String regexIniFech = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
				String regexIniHora = "[0-9]{2}:[0-9]{2}";
				
				String titulo = JOptionPane.showInputDialog("Titulo de la sesion:");
				String deporte = JOptionPane.showInputDialog("Deporte a realizar (ciclismo/running): ");
				String distancia = JOptionPane.showInputDialog("Distancia por recorrer en metros: ");
				String fechIni = JOptionPane.showInputDialog("Fecha Inicial del reto: ");
				String horaIni = JOptionPane.showInputDialog("Hora de inicio de la sesion: ");
				String duracion = JOptionPane.showInputDialog("Duracion:  ");
				
				SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
				
				if(Pattern.matches(regexIniFech, fechIni) && Pattern.matches(regexIniHora, horaIni)){
					JOptionPane.showMessageDialog(null,"sesion creada con exito", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,  "debe introducir bien las fechas" , "error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_2.add(btnCrearSesion);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton btnSalir = new JButton("SALIR");
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
