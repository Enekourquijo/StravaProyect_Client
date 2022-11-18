package ClienteVentana;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class ventanaRegis extends JFrame{
	private JTextField fieldNom;
	private JTextField fieldMail;
	private JTextField fieldPeso;
	private JTextField fieldAlt;
	private JPasswordField fieldContr;
	private JTextField fieldFrecMax;
	private JTextField fieldFrecRep;
	public ventanaRegis() {
		
		setBounds(425, 150, 800, 408);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(7, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Introduzca su nombre:");
		panel_3.add(lblNombre);
		
		fieldNom = new JTextField();
		panel_3.add(fieldNom);
		fieldNom.setColumns(10);
		
		JLabel lblContr = new JLabel("Introduzca su contraseña");
		panel_3.add(lblContr);
		
		fieldContr = new JPasswordField();
		panel_3.add(fieldContr);
		
		JLabel lblEmail = new JLabel("Introduzca su mail:");
		panel_3.add(lblEmail);
		
		fieldMail = new JTextField();
		panel_3.add(fieldMail);
		fieldMail.setColumns(10);
		
		JLabel lblPeso = new JLabel("*opcional* Peso:");
		panel_3.add(lblPeso);
		
		fieldPeso = new JTextField();
		panel_3.add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JLabel lblAlt = new JLabel("*opcional* altura:");
		panel_3.add(lblAlt);
		
		fieldAlt = new JTextField();
		panel_3.add(fieldAlt);
		fieldAlt.setColumns(10);
		
		JLabel lblFrecMax = new JLabel("*opcional* frecMax:");
		panel_3.add(lblFrecMax);
		
		fieldFrecMax = new JTextField();
		panel_3.add(fieldFrecMax);
		fieldFrecMax.setColumns(10);
		
		JLabel lblFrecRep = new JLabel("*opcional* frecRep");
		panel_3.add(lblFrecRep);
		
		fieldFrecRep = new JTextField();
		panel_3.add(fieldFrecRep);
		fieldFrecRep.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton btnRegGoogle = new JButton("Reg.Google");
		panel_4.add(btnRegGoogle);
		
		JButton btnRegFacebook = new JButton("Reg.Facebook");
		panel_4.add(btnRegFacebook);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JTextArea txtrRegistro = new JTextArea();
		txtrRegistro.setText("REGISTRO");
		panel_1.add(txtrRegistro);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnRegistrar = new JButton("Registrar");
		panel_2.add(btnRegistrar);
		
		btnRegistrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
		setVisible(true);

		
	}
	

}
