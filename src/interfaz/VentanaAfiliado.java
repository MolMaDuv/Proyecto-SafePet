package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import mundo.Afiliado;
import mundo.SafePet;

public class VentanaAfiliado extends JFrame implements ActionListener {

	private JPanel contentPane;

	private VentanaLogin miVentanaLogin;
	private SafePet miSafePet;
	private Afiliado miAfiliado;
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	
	private JButton btnAtras;
	private JButton btnRevisarPrestaciones;
	private JButton btnRevisarPlan;

	public VentanaAfiliado(VentanaLogin miVentanaLogin, SafePet miSafePet, Afiliado miAfiliado) {

		this.miVentanaLogin = miVentanaLogin;
		this.miSafePet = miSafePet;
		this.miAfiliado= miAfiliado;
		setTitle("SafePet UQ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogoEsquina1 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina1.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina1);

		JLabel lblLogoEsquina2 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina2.setBounds(495, 11, 80, 80);
		contentPane.add(lblLogoEsquina2);

		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 320, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);

		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(40, 98, 50, 210);
		contentPane.add(lblLateralIzquierdo);

		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(515, 98, 50, 210);
		contentPane.add(lblLateralDerecho);
		
		btnRevisarPlan = new JButton("Plan");
		btnRevisarPlan.setBounds(244, 98, 110, 30);
		btnRevisarPlan.addActionListener(this);
		contentPane.add(btnRevisarPlan);
		
		 btnRevisarPrestaciones = new JButton("Prestaciones");
		btnRevisarPrestaciones.setBounds(244, 150, 110, 30);
		btnRevisarPrestaciones.addActionListener(this);
		contentPane.add(btnRevisarPrestaciones);
		
		JButton btnEvaluarServicio = new JButton("Evaluar servicio");
		btnEvaluarServicio.setBounds(244, 208, 110, 30);
		contentPane.add(btnEvaluarServicio);
		
		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAtras) {
		miVentanaLogin.setVisible(true);
		miVentanaLogin.setLocationRelativeTo(null);
		setVisible(false);
		}
		
		
		if(e.getSource()==btnRevisarPrestaciones) 
		{
			VentanaRevisarPrestaciones miVentanaRevisarPrestaciones = new VentanaRevisarPrestaciones(this,miSafePet,miAfiliado);
			miVentanaRevisarPrestaciones.setVisible(true);
			miVentanaRevisarPrestaciones.setLocationRelativeTo(null);
			setVisible(false);
			
		}
		
		if (e.getSource() == btnRevisarPlan) {
			int id=miAfiliado.getId();
			VentanaRevisarPlan miVentanaRevisarPlan= new VentanaRevisarPlan(this, miSafePet,id);
			miVentanaRevisarPlan.setVisible(true);
			miVentanaRevisarPlan.setLocationRelativeTo(null);
			setVisible(false);
		}
	}
}
