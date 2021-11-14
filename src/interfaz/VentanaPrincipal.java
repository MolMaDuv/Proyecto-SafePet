package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.SafePet;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private SafePet miSafePet;
	private JPanel contentPane;
	private static final String LOGO = "./img/Logo.png";
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNINGRESAR = "./img/BtnIngresar.png";
	
	private JButton btnIngresar;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		setTitle("SafePet UQ");
		
		miSafePet = new SafePet();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel(new ImageIcon(LOGO));
		lblLogo.setBounds(193, 32, 220, 220);
		contentPane.add(lblLogo);
		
		btnIngresar = new JButton(new ImageIcon(BTNINGRESAR));
		btnIngresar.setBounds(249, 285, 110, 30);
		btnIngresar.addActionListener(this);
		contentPane.add(btnIngresar);
		
		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);
		
	}
	

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnIngresar) {	
			
			miSafePet.agregarFuncionario();
			miSafePet.agregarUsuario();
			
			VentanaInicio miVentanaInicio = new VentanaInicio(this, miSafePet);
			miVentanaInicio.setVisible(true);
			miVentanaInicio.setLocationRelativeTo(null);
			setVisible(false);
		}

		
	}
}
