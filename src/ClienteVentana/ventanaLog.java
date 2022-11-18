package ClienteVentana;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaLog extends JFrame{
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField txtContrasenia;
	
	public ventanaLog() {
		
		setBounds(425, 150, 800, 408);
		setTitle("Log In");
		setResizable(true);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pCentro = new JPanel();
		getContentPane().add(pCentro);
		pCentro.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel p1 = new JPanel();
		pCentro.add(p1);
		
		JLabel lblLog = new JLabel("LOG IN");
		p1.add(lblLog);
		
		JPanel p2 = new JPanel();
		pCentro.add(p2);
		
		JLabel lblEmail = new JLabel("Email");
		p2.add(lblEmail);
		
		txtEmail = new JTextField();
		p2.add(txtEmail);
		txtEmail.setColumns(10);
		
		JPanel p3 = new JPanel();
		pCentro.add(p3);
		
		JLabel lblContrasenia = new JLabel("Contraseña");
		p3.add(lblContrasenia);
		
		txtContrasenia = new JPasswordField();
		p3.add(txtContrasenia);
		txtContrasenia.setColumns(10);
		
		JPanel p4 = new JPanel();
		pCentro.add(p4);
		
		JButton btnLog = new JButton("Iniciar Sesion");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal vPrin = new VentanaPrincipal();
			}
		});
		p4.add(btnLog);
		
		
		
		
		btnLog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		setVisible(true);
	}

}
