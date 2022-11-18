package ClienteVentana;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ventanaInicioSesion extends JFrame{
		
		public ventanaInicioSesion() {
			
			setBounds(425, 150, 800, 408);
			setTitle("Log In");
			setResizable(false);
			getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
			
			JPanel pCentro = new JPanel();
			getContentPane().add(pCentro);
			pCentro.setLayout(new GridLayout(4, 1, 0, 0));
			
			JPanel p1 = new JPanel();
			pCentro.add(p1);
			
			JLabel lblLog = new JLabel("LOG IN");
			p1.add(lblLog);
			
			JPanel p2 = new JPanel();
			pCentro.add(p2);
			
			JButton btnLog = new JButton("LOG IN STRAVA");
			btnLog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ventanaLog vLog = new ventanaLog();
				}
			});
			p2.add(btnLog);
			
			JPanel p3 = new JPanel();
			pCentro.add(p3);
			
			JButton btnLog2 = new JButton("LOG IN GOOGLE");
			p3.add(btnLog2);
			
			JPanel p4 = new JPanel();
			pCentro.add(p4);
			
			JButton btnLog3 = new JButton("LOG IN FACEBOOK");
			p4.add(btnLog3);
			
			
			setVisible(true);
		}

}
