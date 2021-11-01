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
import javax.swing.JTextField;
import java.awt.Color;

public class VentanaLogin extends JFrame implements ActionListener {

	private VentanaInicio miVentanaInicio;
	private SafePet miSafePet;
	
	private JPanel contentPane;
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNINGRESAR = "./img/BtnIngresar.png";
	private static final String BTNREGISTRAR = "./img/BtnRegistrar.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGIN = "./img/Login.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	
	private JButton btnIngresar;
	private JButton btnRegistrar;
	private JButton btnAtras;
	private JLabel lblIcono;


	/**
	 * Create the frame.
	 * @param miSafePet 
	 * @param miVentanaInicio 
	 */
	public VentanaLogin(VentanaInicio miVentanaInicio, SafePet miSafePet) {
		
		setTitle("Unishop UQ");
		
		this.miVentanaInicio = miVentanaInicio;
		this.miSafePet = miSafePet;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogoEsquina = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina);
		
		btnIngresar = new JButton(new ImageIcon(BTNINGRESAR));
		btnIngresar.setBounds(253, 263, 110, 30);
		btnIngresar.setBorder(null);
		btnIngresar.addActionListener(this);
		contentPane.add(btnIngresar);
		
		btnRegistrar = new JButton(new ImageIcon(BTNREGISTRAR));
		btnRegistrar.setBounds(484, 320, 110, 30);
		btnRegistrar.setBorder(null);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 320, 110, 30);
		btnAtras.setBorder(null);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);
		
		JLabel lblIcono = new JLabel(new ImageIcon(LOGIN));
		lblIcono.setBounds(249, 31, 130, 130);
		contentPane.add(lblIcono);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(229, 185, 70, 20);
		contentPane.add(lblUsuario);
		
		JTextField JTextUsuario = new JTextField();
		JTextUsuario.setBounds(309, 185, 86, 20);
		contentPane.add(JTextUsuario);
		JTextUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setBounds(229, 216, 70, 20);
		contentPane.add(lblContraseña);
		
		JTextField JTextContraseña = new JTextField();
		JTextContraseña.setColumns(10);
		JTextContraseña.setBounds(309, 216, 86, 20);
		contentPane.add(JTextContraseña);
		
		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(40, 98, 50, 210);
		contentPane.add(lblLateralDerecho);
		
		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(514, 31, 50, 272);
		contentPane.add(lblLateralIzquierdo);
		
		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);	
				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnIngresar) {	
			
			
		}
		
		if(e.getSource() == btnAtras) {	
			
			miVentanaInicio.setVisible(true);
			miVentanaInicio.setLocationRelativeTo(null);
			setVisible(false);
		}

		
	}
}
