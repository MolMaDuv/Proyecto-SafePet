package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.Afiliado;
import mundo.Prestacion;
import mundo.SafePet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaRegistrarAtencion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField capturaFecha;
	private JTextField capturaMotivo;
	private JTextField capturaDiagnostivo;
	private JTextField capturaTratamiento;

	private JButton btnAgregar;
	private SafePet miSafePet;
	private Prestacion miPrestacion;
	private JTextField capturaAfiliado;
	private JLabel lblCodigoAfiliado;

	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String BTNAGREGAR = "./img/BtnAgregar.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";

	private VentanaFuncionario miVentanaFuncionario;
	private SafePet misaSafePet;
	private Afiliado miAfiliado;
	private JButton btnAtras;
	private JLabel lblCodigoBeneficiario;
	private final JTextField capturaBeneficiario = new JTextField();

	public VentanaRegistrarAtencion(VentanaFuncionario miVentanaFuncionario, SafePet miSafePet, Afiliado miAfiliado) {
		
		setTitle("SafePet UQ");
		
		this.miVentanaFuncionario = miVentanaFuncionario;
		this.miSafePet = miSafePet;
		this.miAfiliado = miAfiliado;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("INGRESE LOS SIGUIENTES DATOS");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 584, 20);
		contentPane.add(lblTitulo);

		JLabel lblTextoSuperior = new JLabel("PARA REGISTRAR LA PRESTACION");
		lblTextoSuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoSuperior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTextoSuperior.setForeground(Color.WHITE);
		lblTextoSuperior.setBounds(10, 31, 584, 20);
		contentPane.add(lblTextoSuperior);

		JLabel lblFechaConsulta = new JLabel("Fecha de consulta");
		lblFechaConsulta.setForeground(Color.WHITE);
		lblFechaConsulta.setBounds(135, 131, 130, 14);
		contentPane.add(lblFechaConsulta);

		capturaFecha = new JTextField();
		lblTitulo.setForeground(Color.WHITE);
		capturaFecha.setBounds(275, 128, 190, 20);
		contentPane.add(capturaFecha);
		capturaFecha.setColumns(10);

		JLabel lblMotivoConsulta = new JLabel("Motivo de la consulta");
		lblMotivoConsulta.setForeground(Color.WHITE);
		lblMotivoConsulta.setBounds(135, 172, 130, 14);
		contentPane.add(lblMotivoConsulta);

		capturaMotivo = new JTextField();
		capturaMotivo.setBounds(275, 159, 190, 40);
		contentPane.add(capturaMotivo);
		capturaMotivo.setColumns(10);

		JLabel lblDiagnostico = new JLabel("Diagnostico");
		lblDiagnostico.setForeground(Color.WHITE);
		lblDiagnostico.setBounds(135, 221, 130, 14);
		contentPane.add(lblDiagnostico);

		capturaDiagnostivo = new JTextField();
		capturaDiagnostivo.setBounds(275, 208, 190, 40);
		contentPane.add(capturaDiagnostivo);
		capturaDiagnostivo.setColumns(10);

		JLabel lblTratamiento = new JLabel("Tratamiento");
		lblTratamiento.setForeground(Color.WHITE);
		lblTratamiento.setBounds(135, 272, 130, 14);
		contentPane.add(lblTratamiento);

		capturaTratamiento = new JTextField();
		capturaTratamiento.setBounds(275, 259, 190, 40);
		contentPane.add(capturaTratamiento);
		capturaTratamiento.setColumns(10);

		JLabel lblLogoEsquina1 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina1.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina1);

		JLabel lblLogoEsquina2 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina2.setBounds(495, 11, 80, 80);
		contentPane.add(lblLogoEsquina2);

		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 319, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);

		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(40, 98, 50, 210);
		contentPane.add(lblLateralIzquierdo);

		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(515, 98, 50, 210);
		contentPane.add(lblLateralDerecho);

		btnAgregar = new JButton(new ImageIcon(BTNAGREGAR));
		btnAgregar.setBounds(484, 319, 110, 30);
		btnAgregar.addActionListener(this);
		contentPane.add(btnAgregar);

		capturaAfiliado = new JTextField();
		capturaAfiliado.setBounds(275, 64, 190, 20);
		contentPane.add(capturaAfiliado);
		capturaAfiliado.setColumns(10);
		capturaAfiliado.setText(miAfiliado.getNombre());

		lblCodigoAfiliado = new JLabel("Afiliado");
		lblCodigoAfiliado.setForeground(Color.WHITE);
		lblCodigoAfiliado.setBounds(135, 67, 130, 14);
		contentPane.add(lblCodigoAfiliado);

		lblCodigoBeneficiario = new JLabel("Codigo del beneficiario");
		lblCodigoBeneficiario.setForeground(Color.WHITE);
		lblCodigoBeneficiario.setBounds(135, 100, 130, 14);
		contentPane.add(lblCodigoBeneficiario);

		capturaBeneficiario.setText("");
		capturaBeneficiario.setBounds(275, 97, 190, 20);
		contentPane.add(capturaBeneficiario);
		capturaBeneficiario.setColumns(10);

		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);

		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		capturaFecha.setText(timeStamp);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAgregar) {

			boolean validacionB = miSafePet.isInteger(capturaBeneficiario.getText());

			if (validacionB) {

				int codigoA = miAfiliado.getId();
				int codigoB = Integer.parseInt(capturaBeneficiario.getText());

				boolean validarCodigoMascota = miSafePet.validarCodigoMascota(codigoA, codigoB);

				if (validarCodigoMascota) {
					String fecha = capturaFecha.getText();
					String motivoString = capturaMotivo.getText();
					String diagnotico = capturaDiagnostivo.getText();
					String tratamiento = capturaTratamiento.getText();

					Prestacion miPrestacion = new Prestacion(0, codigoA, codigoB, fecha, motivoString, diagnotico,
							tratamiento);

					miSafePet.agregarRegistroAtencion(miPrestacion);

					limpiarInterfaz();
				} else {
					JOptionPane.showMessageDialog(null,
							"No hay mascotas registradas en su plan con el codigo ingresado", "Error",
							JOptionPane.WARNING_MESSAGE);
				}

			} else {

				JOptionPane.showMessageDialog(null,
						"Por favor ingresar un dato numerico en los campos codigo afiliado y codigo beneficiario",
						"Error", JOptionPane.WARNING_MESSAGE);
			}

		}

		if (e.getSource() == btnAtras) {
			miVentanaFuncionario.setVisible(true);
			miVentanaFuncionario.setLocationRelativeTo(null);
			setVisible(false);
		}
	}

	public void limpiarInterfaz() {
		capturaAfiliado.setText("");

		capturaBeneficiario.setText("");

		capturaFecha.setText("");

		capturaMotivo.setText("");

		capturaDiagnostivo.setText("");

		capturaTratamiento.setText("");
	}
}
