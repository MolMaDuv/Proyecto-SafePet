package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.Afiliado;
import mundo.SafePet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class VentanaRegistrar extends JFrame implements ActionListener {

	private JPanel contentPane;

	private SafePet miSafePet;
	private VentanaFuncionario miVentanaFuncionario;

	private JTextField JTextId;
	private JTextField JTextNombre;
	private JTextField JTextTelefono;
	private JTextField JTextDireccion;
	private JTextField JTextCorreo;
	private JTextField JTextEdad;

	private JButton btnAgregar;
	private JButton btnAtras;

	private static final String FONDO = "./img/Fondo.png";
	private static final String ICONO = "./img/Icono.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String BTNAGREGAR = "./img/BtnAgregar.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";

	/**
	 * Create the frame.
	 * 
	 * @param miSafePet2
	 * @param ventanaLogin
	 */
	public VentanaRegistrar(VentanaFuncionario miVentanaFuncionario, SafePet miSafePet) {

		setTitle("SafePet UQ");

		this.miVentanaFuncionario = miVentanaFuncionario;
		this.miSafePet = miSafePet;

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
		lblTitulo.setBounds(10, 31, 584, 30);
		contentPane.add(lblTitulo);

		JLabel lblId = new JLabel("Id");
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(160, 98, 60, 20);
		contentPane.add(lblId);

		JTextId = new JTextField();
		JTextId.setBounds(230, 98, 86, 20);
		contentPane.add(JTextId);
		JTextId.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(160, 129, 60, 20);
		contentPane.add(lblNombre);

		JTextNombre = new JTextField();
		JTextNombre.setBounds(230, 129, 86, 20);
		contentPane.add(JTextNombre);
		JTextNombre.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(160, 160, 60, 20);
		contentPane.add(lblTelefono);

		JTextTelefono = new JTextField();
		JTextTelefono.setBounds(230, 160, 86, 20);
		contentPane.add(JTextTelefono);
		JTextTelefono.setColumns(10);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(160, 191, 60, 20);
		contentPane.add(lblDireccion);

		JTextDireccion = new JTextField();
		JTextDireccion.setBounds(230, 191, 86, 20);
		contentPane.add(JTextDireccion);
		JTextDireccion.setColumns(10);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setBounds(160, 222, 60, 20);
		contentPane.add(lblCorreo);

		JTextCorreo = new JTextField();
		JTextCorreo.setBounds(230, 222, 86, 20);
		contentPane.add(JTextCorreo);
		JTextCorreo.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setBounds(160, 253, 60, 20);
		contentPane.add(lblEdad);

		JTextEdad = new JTextField();
		JTextEdad.setBounds(230, 253, 86, 20);
		contentPane.add(JTextEdad);
		JTextEdad.setColumns(10);

		btnAgregar = new JButton(new ImageIcon(BTNAGREGAR));
		btnAgregar.setBounds(484, 320, 110, 30);
		contentPane.add(btnAgregar);
		btnAgregar.addActionListener(this);

		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 320, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);

		JLabel lblIcono = new JLabel(new ImageIcon(ICONO));
		lblIcono.setBounds(348, 129, 120, 120);
		contentPane.add(lblIcono);

		JLabel lblLogoEsquina1 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina1.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina1);

		JLabel lblLogoEsquina2 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina2.setBounds(495, 11, 80, 80);
		contentPane.add(lblLogoEsquina2);

		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(40, 98, 50, 210);
		contentPane.add(lblLateralIzquierdo);

		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(515, 98, 50, 210);
		contentPane.add(lblLateralDerecho);

		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);

	}

	public void actionPerformed(ActionEvent e) {

		

		if (e.getSource() == btnAgregar) {
			boolean validacionId = miSafePet.isInteger(JTextId.getText());
			boolean validacionEdad = miSafePet.isInteger(JTextEdad.getText());

			if (JTextId.getText().equals("") || JTextNombre.getText().equals("") || JTextTelefono.getText().equals("")
					|| JTextDireccion.getText().equals("") || JTextCorreo.getText().equals("")
					|| JTextEdad.getText().equals("")) {

				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos solicitados",
						"Datos incompletos", JOptionPane.WARNING_MESSAGE);

			} else {
				if (validacionId && validacionEdad) {
					int id = Integer.parseInt(JTextId.getText());
					String nombre = JTextNombre.getText();
					String telefono = JTextTelefono.getText();
					String direccion = JTextDireccion.getText();
					String correo = JTextCorreo.getText();
					int edad = Integer.parseInt(JTextEdad.getText());

					boolean validacioUsuario = miSafePet.validarExistenciaUsuario(id);

					if (validacioUsuario == false) {

						Afiliado miAfiliado = new Afiliado(id, nombre, telefono, direccion, correo, edad, 0);
						miSafePet.agregarUsuario(miAfiliado);
						JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registro exitoso",
								JOptionPane.INFORMATION_MESSAGE);
						limpiar();
					}else {
						JOptionPane.showMessageDialog(null, "El afiliado que intenta ingresar ya existe", "Error registro de afiliado",
								JOptionPane.WARNING_MESSAGE);
					}

				} else {
					JOptionPane.showMessageDialog(null,
							"En el campo de (Id) y (Edad), solamente ingresar valores numericos", "Error registro de afiliado",
							JOptionPane.WARNING_MESSAGE);
				}
			}

		}

		if (e.getSource() == btnAtras) {

			miVentanaFuncionario.setVisible(true);
			miVentanaFuncionario.setLocationRelativeTo(null);
			setVisible(false);
		}
	}

	private void limpiar() {
		JTextId.setText("");
		JTextNombre.setText("");
		JTextTelefono.setText("");
		JTextDireccion.setText("");
		JTextCorreo.setText("");
		JTextEdad.setText("");
	}
}
