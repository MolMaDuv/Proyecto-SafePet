package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.SafePet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRevisarPlan extends JFrame implements ActionListener {

	private JPanel contentPane;

	private VentanaAfiliado miVentanaAfiliado;
	private SafePet miSafePet;
	private int id;

	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	private static final String PERGAMINOREVISARPLAN = "./img/PergaminoRevisarPlan.png";
	private JButton btnAtras;
	private JTextField textFieldCodigo;
	private JTextField textFieldCopago;
	private JTextField textFieldCantMascotas;
	private JTextField textFieldValor;
	private JTextField textFieldAmbulancia;
	private JTextField textFieldAsistencia;
	private JTextField textFieldConsulta;

	/**
	 * Create the frame.
	 * 
	 * @param id
	 */
	public VentanaRevisarPlan(VentanaAfiliado miVentanaAfiliado, SafePet miSafePet, int id) {

		this.miVentanaAfiliado = miVentanaAfiliado;
		this.miSafePet = miSafePet;
		this.id = id;
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

		textFieldCodigo = new JTextField();
		textFieldCodigo.setEditable(false);
		textFieldCodigo.setBounds(305, 88, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);

		textFieldCopago = new JTextField();
		textFieldCopago.setEditable(false);
		textFieldCopago.setColumns(10);
		textFieldCopago.setBounds(305, 116, 86, 20);
		contentPane.add(textFieldCopago);

		textFieldCantMascotas = new JTextField();
		textFieldCantMascotas.setEditable(false);
		textFieldCantMascotas.setColumns(10);
		textFieldCantMascotas.setBounds(305, 144, 86, 20);
		contentPane.add(textFieldCantMascotas);

		textFieldValor = new JTextField();
		textFieldValor.setEditable(false);
		textFieldValor.setColumns(10);
		textFieldValor.setBounds(305, 172, 86, 20);
		contentPane.add(textFieldValor);

		textFieldAmbulancia = new JTextField();
		textFieldAmbulancia.setEditable(false);
		textFieldAmbulancia.setColumns(10);
		textFieldAmbulancia.setBounds(305, 200, 86, 20);
		contentPane.add(textFieldAmbulancia);

		textFieldAsistencia = new JTextField();
		textFieldAsistencia.setEditable(false);
		textFieldAsistencia.setColumns(10);
		textFieldAsistencia.setBounds(305, 228, 86, 20);
		contentPane.add(textFieldAsistencia);

		textFieldConsulta = new JTextField();
		textFieldConsulta.setEditable(false);
		textFieldConsulta.setColumns(10);
		textFieldConsulta.setBounds(305, 256, 86, 20);
		contentPane.add(textFieldConsulta);

		JLabel lblPergamino = new JLabel(new ImageIcon(PERGAMINOREVISARPLAN));
		lblPergamino.setBounds(158, 6, 280, 350);
		contentPane.add(lblPergamino);

		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);

		mostrarPlan();
	}

	public void mostrarPlan() {
		// TODO Auto-generated method stub
		String msj = miSafePet.revisarPlan(id);

		String[] datos = msj.split("\n");
		String auxAmbulancia = datos[4];
		String auxAsistencia = datos[5];
		String auxConsulta = datos[6];

		textFieldCodigo.setText(datos[0]);
		textFieldCopago.setText(datos[1]);
		textFieldCantMascotas.setText(datos[2]);
		textFieldValor.setText(datos[3]);
		if (auxAmbulancia.equalsIgnoreCase("true")) {
			textFieldAmbulancia.setText("Incluido");
		} else {
			textFieldAmbulancia.setText("No incluido");
		}

		if (auxAsistencia.equalsIgnoreCase("true")) {
			textFieldAsistencia.setText("Incluido");
		} else {
			textFieldAsistencia.setText("No incluido");
		}

		if (auxConsulta.equalsIgnoreCase("true")) {
			textFieldConsulta.setText("Incluido");
		} else {
			textFieldConsulta.setText("No incluido");
		}
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAtras) {

			miVentanaAfiliado.setVisible(true);
			miVentanaAfiliado.setLocationRelativeTo(null);
			setVisible(false);

		}

	}
}
