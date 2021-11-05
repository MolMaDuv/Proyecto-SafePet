package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.SafePet;

public class VentanaInicio extends JFrame implements ActionListener {

	private VentanaPrincipal miVentanaPrincipal;
	private SafePet miSafePet;
	
	private JPanel contentPane;
	private static final String LOGO = "./img/Logo.png";
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNINGRESAR = "./img/BtnIngresar.png";
	private static final String BTNSIMULAR = "./img/BtnSimular.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String PERGAMINO = "./img/Pergamino.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	
	private JButton btnIngresar;
	private JButton btnSimular;
	private JButton btnAtras;

	public VentanaInicio(VentanaPrincipal miVentanaPrincipal, SafePet miSafePet) {
		
		this.miVentanaPrincipal = miVentanaPrincipal;
		this.miSafePet = miSafePet;
		
		setTitle("SafePet UQ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIngresar = new JButton(new ImageIcon(BTNINGRESAR));
		btnIngresar.setBounds(484, 32, 110, 30);
		btnIngresar.addActionListener(this);
		contentPane.add(btnIngresar);
		
		btnSimular = new JButton(new ImageIcon(BTNSIMULAR));
		btnSimular.setBounds(484, 320, 110, 30);
		btnSimular.addActionListener(this);
		contentPane.add(btnSimular);
		
		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 320, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);
		
		JLabel lblLogoEsquina = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina);
		
		JLabel lblPergamino = new JLabel(new ImageIcon(PERGAMINO));
		lblPergamino.setBounds(158, 6, 280, 350);
		contentPane.add(lblPergamino);
		
		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(40, 98, 50, 210);
		contentPane.add(lblLateralIzquierdo);
		
		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(514, 93, 50, 210);
		contentPane.add(lblLateralDerecho);
		
		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);
		

		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnIngresar) {	
			
			VentanaLogin miVentanaLogin = new VentanaLogin(this, miSafePet);
			miVentanaLogin.setVisible(true);
			miVentanaLogin.setLocationRelativeTo(null);
			setVisible(false);
		}
		
		if(e.getSource() == btnAtras) {	
			
			miVentanaPrincipal.setVisible(true);
			miVentanaPrincipal.setLocationRelativeTo(null);
			setVisible(false);
		}
		
		
	}
}
