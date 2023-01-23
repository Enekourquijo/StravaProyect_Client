package es.deusto.ingenieria.sd.strava.client.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import es.deusto.ingenieria.sd.strava.client.controller.RetoController;

import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

public class VentanaReto extends JFrame{
//	private JTable TablaActivos;
//	private DefaultTableModel modeloRetos, modeloActivos;
//	private JScrollPane scrollActivos;
	private RetoController controller;
	//private Object columnas[] = {"Nombre", "Fecha Inicio", "Fecha Fin"};
	
	public VentanaReto(RetoController retoController) {
		
		controller = retoController;
//		modeloRetos = new DefaultTableModel();
//		modeloActivos = new DefaultTableModel();
		
		setBounds(425, 150, 800, 408);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelTablaRetos = new JPanel();
		panelTablaRetos.setBackground(new Color(128, 128, 128));
		panel_1.add(panelTablaRetos);
		panelTablaRetos.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTablaRetos = new JLabel("Retos Totales");
		lblTablaRetos.setForeground(new Color(255, 255, 255));
		lblTablaRetos.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTablaRetos.setBackground(new Color(255, 255, 255));
		lblTablaRetos.setHorizontalAlignment(SwingConstants.CENTER);
		panelTablaRetos.add(lblTablaRetos, BorderLayout.NORTH);
		
//		modeloRetos.addColumn(columnas);
		
		JPanel panelRetosActivos = new JPanel();
		panelRetosActivos.setBackground(new Color(128, 128, 128));
		panel_1.add(panelRetosActivos);
		panelRetosActivos.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRetosActivos = new JLabel("Retos Activos");
		lblRetosActivos.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRetosActivos.setForeground(new Color(255, 255, 255));
		lblRetosActivos.setHorizontalAlignment(SwingConstants.CENTER);
		panelRetosActivos.add(lblRetosActivos, BorderLayout.NORTH);
		
//		TablaActivos = new JTable(modeloActivos);
//		panelRetosActivos.add(TablaActivos, BorderLayout.CENTER);
//		scrollActivos = new JScrollPane(TablaActivos);
//		getContentPane().add(scrollActivos);
		//ArrayList<String> retos = new ArrayList<>();
		
		JComboBox comboBoxRetosTotales = new JComboBox();
        comboBoxRetosTotales.setModel(new DefaultComboBoxModel(controller.getReto().toArray()));
		panelTablaRetos.add(comboBoxRetosTotales);
		
		
		JComboBox comboBoxRetosActivos = new JComboBox<>();
		comboBoxRetosActivos.setModel(new DefaultComboBoxModel(controller.getRetoAct().toArray()));
		panelRetosActivos.add(comboBoxRetosActivos);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 64));
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnUnirse = new JButton("Unirse Reto");
		btnUnirse.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(btnUnirse);
		btnUnirse.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {
				String er = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
				String[] tipos = {"CICLISMO","RUNNING"};
				
				String nomRet = JOptionPane.showInputDialog("Nombre del reto:");
				String fechIni = JOptionPane.showInputDialog("Fecha Inicial del reto: ");
				String fechFin = JOptionPane.showInputDialog("Fecha Final del reto: ");
				String distancia = JOptionPane.showInputDialog("Distancia por recorrer en metros: ");
				String tiempoObj = JOptionPane.showInputDialog("Tiempo a alcanzar en minutos: ");
				String deporte = (String) JOptionPane.showInputDialog(null, "Deporte a realizar: ", "Tipo de deporte", JOptionPane.QUESTION_MESSAGE, null, tipos, "CICLISMO");

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				if(Pattern.matches(er, fechIni) && Pattern.matches(er, fechFin)){
					JOptionPane.showMessageDialog(null,"reto creado con exito", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,  "debe introducir bien las fechas" , "error",JOptionPane.ERROR_MESSAGE);
				}
				controller.makeReto(nomRet, fechIni, fechFin, Double.parseDouble(distancia), Double.parseDouble(tiempoObj), deporte);
				
				repaint();
				
			}
			
		});
		
		JButton btnCrearReto = new JButton("Crear Reto");
		btnCrearReto.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCrearReto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String er = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
				String[] tipos = {"CICLISMO","RUNNING"};
				
				String nomRet = JOptionPane.showInputDialog("Nombre del reto:");
				String fechIni = JOptionPane.showInputDialog("Fecha Inicial del reto: ");
				String fechFin = JOptionPane.showInputDialog("Fecha Final del reto: ");
				String distancia = JOptionPane.showInputDialog("Distancia por recorrer en metros: ");
				String tiempoObj = JOptionPane.showInputDialog("Tiempo a alcanzar en minutos: ");
				String deporte = (String) JOptionPane.showInputDialog(null, "Deporte a realizar: ", "Tipo de deporte", JOptionPane.QUESTION_MESSAGE, null, tipos, "CICLISMO");

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				if(Pattern.matches(er, fechIni) && Pattern.matches(er, fechFin)){
					JOptionPane.showMessageDialog(null,"reto creado con exito", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,  "debe introducir bien las fechas" , "error",JOptionPane.ERROR_MESSAGE);
				}
				controller.makeReto(nomRet, fechIni, fechFin, Double.parseDouble(distancia), Double.parseDouble(tiempoObj), deporte);
				
				repaint();

			}
		});
		panel.add(btnCrearReto);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 64));
		getContentPane().add(panel_2);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
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