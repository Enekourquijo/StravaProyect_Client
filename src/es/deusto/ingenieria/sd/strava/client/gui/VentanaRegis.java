package es.deusto.ingenieria.sd.strava.client.gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
import es.deusto.ingenieria.sd.strava.server.data.dto.TipoProveedor;

import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;


public class VentanaRegis extends JFrame{
	private JTextField fieldNom;
	private JTextField fieldMail;
	private JTextField fieldPeso;
	private JTextField fieldAlt;
	private JPasswordField fieldContr;
	private JTextField fieldFrecMax;
	private JTextField fieldFrecRep;
	private LoginController controller;
	private JTextField fieldfnac;
	
	public VentanaRegis(LoginController logincontroller) {
		
		controller = logincontroller;
		setBounds(425, 150, 800, 408);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 64));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(8, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Introduzca su nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblNombre);
		
		fieldNom = new JTextField();
		panel_3.add(fieldNom);
		fieldNom.setColumns(10);
		
		JLabel lblContr = new JLabel("Introduzca su contraseña");
		lblContr.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblContr);
		
		fieldContr = new JPasswordField();
		panel_3.add(fieldContr);
		
		JLabel lblEmail = new JLabel("Introduzca su mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblEmail);
		
		fieldMail = new JTextField();
		panel_3.add(fieldMail);
		fieldMail.setColumns(10);
		
		JLabel lblFnac = new JLabel("Introduzca su FechaNacimiento");
		lblFnac.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblFnac);
		
		fieldfnac = new JTextField();
		panel_3.add(fieldfnac);
		fieldfnac.setColumns(10);
		
		JLabel lblPeso = new JLabel("*opcional* Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblPeso);
		
		fieldPeso = new JTextField();
		panel_3.add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JLabel lblAlt = new JLabel("Altura:");
		lblAlt.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblAlt);
		
		fieldAlt = new JTextField();
		panel_3.add(fieldAlt);
		fieldAlt.setColumns(10);
		
		JLabel lblFrecMax = new JLabel("FrecuenciaMaxima:");
		lblFrecMax.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblFrecMax);
		
		fieldFrecMax = new JTextField();
		panel_3.add(fieldFrecMax);
		fieldFrecMax.setColumns(10);
		
		JLabel lblFrecRep = new JLabel("FrecuenciaReposo:");
		lblFrecRep.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(lblFrecRep);
		
		fieldFrecRep = new JTextField();
		panel_3.add(fieldFrecRep);
		fieldFrecRep.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 64));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Elige el modo de registro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_4.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(128, 128, 128));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"GOOGLE", "FACEBOOK", "STRAVA"}));
		panel_4.add(comboBox);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblRegis = new JLabel("REGISTRAR");
		lblRegis.setForeground(Color.WHITE);
		panel_1.add(lblRegis);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 128));
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_2.add(btnRegistrar);
		
		btnRegistrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				controller.signup(fieldNom.getText(), fieldContr.getText(), fieldMail.getText(), fieldfnac.getText(), Double.parseDouble(fieldPeso.getText()), 
								Integer.parseInt(fieldAlt.getText()), Double.parseDouble(fieldFrecMax.getText()), Double.parseDouble(fieldFrecRep.getText()), 
								"",TipoProveedor.values()[comboBox.getSelectedIndex()]);
				dispose();
			}
		});
		
		
		
		setVisible(true);

		
	}
	

}
