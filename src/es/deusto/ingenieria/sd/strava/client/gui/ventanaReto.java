package es.deusto.ingenieria.sd.strava.client.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JTable;

public class ventanaReto extends JFrame{
	private JTable TablaRetos;
	private JTable TablaActivos;
	public ventanaReto() {
		setBounds(425, 150, 800, 408);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelTablaRetos = new JPanel();
		panel_1.add(panelTablaRetos);
		panelTablaRetos.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTablaRetos = new JLabel("Retos Totales");
		lblTablaRetos.setHorizontalAlignment(SwingConstants.CENTER);
		panelTablaRetos.add(lblTablaRetos, BorderLayout.NORTH);
		
		TablaRetos = new JTable();
		panelTablaRetos.add(TablaRetos, BorderLayout.CENTER);
		
		JPanel panelRetosActivos = new JPanel();
		panel_1.add(panelRetosActivos);
		panelRetosActivos.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRetosActivos = new JLabel("Retos Activos");
		lblRetosActivos.setHorizontalAlignment(SwingConstants.CENTER);
		panelRetosActivos.add(lblRetosActivos, BorderLayout.NORTH);
		
		TablaActivos = new JTable();
		panelRetosActivos.add(TablaActivos, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnUnirse = new JButton("Unirse Reto");
		panel.add(btnUnirse);
		
		JButton btnCrearReto = new JButton("Crear Reto");
		btnCrearReto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String er = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
				
				String nomRet = JOptionPane.showInputDialog("Nombre del reto:");
				String fechIni = JOptionPane.showInputDialog("Fecha Inicial del reto: ");
				String distancia = JOptionPane.showInputDialog("Distancia por recorrer en metros: ");
				String tiempoObj = JOptionPane.showInputDialog("Tiempo a alcanzar en minutos: ");
				String deporte = JOptionPane.showInputDialog("Deporte a realizar: ");

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				if(Pattern.matches(er, fechIni)){
					JOptionPane.showMessageDialog(null,"reto creado con exito", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,  "debe introducir bien las fechas" , "error",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		panel.add(btnCrearReto);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);
		
		JButton btnSalir = new JButton("Salir");
		panel_2.add(btnSalir);
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setVisible(true);
	}
}