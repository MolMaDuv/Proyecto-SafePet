package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import mundo.SafePet;

public class VentanaSimulacion extends JFrame implements ActionListener {

	private VentanaInicio miVentanaInicio;
	private SafePet miSafePet;

	private JTextField JTextId;
	private JTextField JTextNombre;
	private JTextField JTextTelefono;
	private JTextField JTextCorreo;

	private JPanel contentPane;
	private static final String FONDO = "./img/fondoGrande.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String BTNSIMULAR = "./img/BtnSimular.png";
	private static final String BTNAGREGAR = "./img/BtnAgregar.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerechoGrande.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdoGrande.png";

	private JButton btnAtras;
	private JButton btnAgregar;
	private JButton btnSimular;

	private JCheckBox jcbConsultasIlimitadas;
	private JCheckBox jcbAmbulancia;
	private JCheckBox jcbAsistenciaCasa;

	private ButtonGroup grupoTiempo;
	private JRadioButton jrbTresMeses;
	private JRadioButton jrbSeisMeses;
	private JRadioButton jrbDoceMeses;

	private JTextField JTextNombreMascota;
	private JTextField JTextRaza;
	private JTextField JTextPeso;
	private JTextField JTextColor;

	JScrollPane panelTabla = new JScrollPane();
	DefaultTableModel modelo;
	JTable tabla;

	private int contadorMascotas;
	boolean consultas = false;
	boolean ambulancia = false;
	boolean asistencia = false;
	boolean tres = false;
	boolean seis = false;
	boolean doce = false;

	/**
	 * Create the frame.
	 * 
	 * @param miSafePet
	 * @param miVentanaInicio
	 */
	public VentanaSimulacion(VentanaInicio miVentanaInicio, SafePet miSafePet) {

		this.miVentanaInicio = miVentanaInicio;
		this.miSafePet = miSafePet;

		setTitle("SafePet UQ");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("INGRESE LOS SIGUIENTES DATOS");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 26, 584, 20);
		contentPane.add(lblTitulo);

		JLabel lblTextoSuperior = new JLabel("PARA REALIZAR LA SIMULACION");
		lblTextoSuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoSuperior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTextoSuperior.setForeground(Color.WHITE);
		lblTextoSuperior.setBounds(10, 46, 584, 20);
		contentPane.add(lblTextoSuperior);

		JLabel lblDatosUsuario = new JLabel("DATOS USUARIO");
		lblDatosUsuario.setForeground(Color.WHITE);
		lblDatosUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosUsuario.setBounds(66, 77, 450, 20);
		contentPane.add(lblDatosUsuario);

		JLabel lblId = new JLabel("Id");
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(128, 108, 60, 20);
		contentPane.add(lblId);

		JTextId = new JTextField();
		JTextId.setBounds(198, 108, 86, 20);
		contentPane.add(JTextId);
		JTextId.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(294, 108, 60, 20);
		contentPane.add(lblNombre);

		JTextNombre = new JTextField();
		JTextNombre.setBounds(364, 108, 86, 20);
		contentPane.add(JTextNombre);
		JTextNombre.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(294, 139, 60, 20);
		contentPane.add(lblTelefono);

		JTextTelefono = new JTextField();
		JTextTelefono.setBounds(364, 139, 86, 20);
		contentPane.add(JTextTelefono);
		JTextTelefono.setColumns(10);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setBounds(128, 139, 60, 20);
		contentPane.add(lblCorreo);

		JTextCorreo = new JTextField();
		JTextCorreo.setBounds(198, 139, 86, 20);
		contentPane.add(JTextCorreo);
		JTextCorreo.setColumns(10);

		JLabel lblLogoEsquina1 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina1.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina1);

		JLabel lblLogoEsquina2 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina2.setBounds(495, 11, 80, 80);
		contentPane.add(lblLogoEsquina2);

		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(40, 98, 50, 411);
		contentPane.add(lblLateralIzquierdo);

		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(515, 98, 50, 411);
		contentPane.add(lblLateralDerecho);

		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 520, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);

		btnSimular = new JButton(new ImageIcon(BTNSIMULAR));
		btnSimular.setBounds(484, 520, 110, 30);
		btnSimular.addActionListener(this);
		contentPane.add(btnSimular);

		btnAgregar = new JButton(new ImageIcon(BTNAGREGAR));
		btnAgregar.setBounds(252, 275, 110, 30);
		btnAgregar.addActionListener(this);
		contentPane.add(btnAgregar);

		JLabel lblDatosMascota = new JLabel("DATOS MASCOTA(S)");
		lblDatosMascota.setForeground(Color.WHITE);
		lblDatosMascota.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosMascota.setBounds(66, 182, 450, 20);
		contentPane.add(lblDatosMascota);

		JLabel lblNombreMascota = new JLabel("Nombre");
		lblNombreMascota.setForeground(Color.WHITE);
		lblNombreMascota.setBounds(128, 213, 60, 20);
		contentPane.add(lblNombreMascota);

		JTextNombreMascota = new JTextField();
		JTextNombreMascota.setBounds(198, 213, 86, 20);
		contentPane.add(JTextNombreMascota);
		JTextNombreMascota.setColumns(10);

		JLabel lblRazaMascota = new JLabel("Raza");
		lblRazaMascota.setForeground(Color.WHITE);
		lblRazaMascota.setBounds(294, 213, 60, 20);
		contentPane.add(lblRazaMascota);

		JTextRaza = new JTextField();
		JTextRaza.setBounds(364, 213, 86, 20);
		contentPane.add(JTextRaza);
		JTextRaza.setColumns(10);

		JLabel lblPesoMascota = new JLabel("Peso");
		lblPesoMascota.setForeground(Color.WHITE);
		lblPesoMascota.setBounds(128, 244, 60, 20);
		contentPane.add(lblPesoMascota);

		JTextPeso = new JTextField();
		JTextPeso.setBounds(198, 244, 86, 20);
		contentPane.add(JTextPeso);
		JTextPeso.setColumns(10);

		JLabel lblColorMascota = new JLabel("Color");
		lblColorMascota.setForeground(Color.WHITE);
		lblColorMascota.setBounds(294, 244, 60, 20);
		contentPane.add(lblColorMascota);

		JTextColor = new JTextField();
		JTextColor.setBounds(364, 244, 86, 20);
		contentPane.add(JTextColor);
		JTextColor.setColumns(10);

		modelo = new DefaultTableModel();

		modelo.addColumn("Nombre");
		modelo.addColumn("Raza");
		modelo.addColumn("Peso");
		modelo.addColumn("Color");

		tabla = new JTable(modelo);
		tabla.setBounds(132, 266, 340, 80);
		contentPane.add(tabla);

		panelTabla = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelTabla.setBounds(128, 316, 340, 80);
		contentPane.add(panelTabla);

		JLabel lblServicios = new JLabel("SERVICIOS");
		lblServicios.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicios.setForeground(Color.WHITE);
		lblServicios.setBounds(124, 407, 160, 20);
		contentPane.add(lblServicios);

		jcbConsultasIlimitadas = new JCheckBox();
		jcbConsultasIlimitadas.setForeground(Color.WHITE);
		jcbConsultasIlimitadas.setText("Consultas ilimitadas");
		jcbConsultasIlimitadas.setBounds(134, 434, 150, 23);
		jcbConsultasIlimitadas.setOpaque(false);
		contentPane.add(jcbConsultasIlimitadas);

		jcbAmbulancia = new JCheckBox();
		jcbAmbulancia.setForeground(Color.WHITE);
		jcbAmbulancia.setText("Ambulancia");
		jcbAmbulancia.setBounds(134, 460, 150, 23);
		jcbAmbulancia.setOpaque(false);
		contentPane.add(jcbAmbulancia);

		jcbAsistenciaCasa = new JCheckBox();
		jcbAsistenciaCasa.setForeground(Color.WHITE);
		jcbAsistenciaCasa.setText("Asistencia en casa");
		jcbAsistenciaCasa.setBounds(134, 486, 150, 23);
		jcbAsistenciaCasa.setOpaque(false);
		contentPane.add(jcbAsistenciaCasa);

		JLabel lblTiempo = new JLabel("TIEMPO");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setBounds(308, 407, 160, 20);
		contentPane.add(lblTiempo);

		grupoTiempo = new ButtonGroup();

		jrbTresMeses = new JRadioButton();
		jrbTresMeses.setForeground(Color.WHITE);
		jrbTresMeses.setText("3 meses");
		jrbTresMeses.setBounds(354, 434, 90, 23);
		jrbTresMeses.setOpaque(false);
		contentPane.add(jrbTresMeses);

		jrbSeisMeses = new JRadioButton();
		jrbSeisMeses.setForeground(Color.WHITE);
		jrbSeisMeses.setText("6 meses");
		jrbSeisMeses.setBounds(354, 460, 90, 23);
		jrbSeisMeses.setOpaque(false);
		contentPane.add(jrbSeisMeses);

		jrbDoceMeses = new JRadioButton();
		jrbDoceMeses.setForeground(Color.WHITE);
		jrbDoceMeses.setText("12 meses");
		jrbDoceMeses.setBounds(354, 486, 90, 23);
		jrbDoceMeses.setOpaque(false);
		contentPane.add(jrbDoceMeses);

		grupoTiempo.add(jrbTresMeses);
		grupoTiempo.add(jrbSeisMeses);
		grupoTiempo.add(jrbDoceMeses);

		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 561);
		contentPane.add(lblFondo);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAtras) {

			miVentanaInicio.setVisible(true);
			miVentanaInicio.setLocationRelativeTo(null);
			setVisible(false);
		}

		if (e.getSource() == btnAgregar) {

			String nombre = JTextNombreMascota.getText();
			String raza = JTextRaza.getText();
			String peso = JTextPeso.getText();
			String color = JTextColor.getText();

			String beneficiario[] = { nombre, raza, peso, color };
			modelo.addRow(beneficiario);

			contadorMascotas++;
			limpiarInterfaz();
		}

		if (e.getSource() == btnSimular) {

			if (JTextId.getText() == "" || JTextNombre.getText() == "" || JTextCorreo.getText() == ""
					|| JTextTelefono.getText() == "" || jcbConsultasIlimitadas.isSelected() == false
					|| (jcbConsultasIlimitadas.isSelected() == false && jcbAmbulancia.isSelected() == false
							&& jcbAsistenciaCasa.isSelected() == false)
					|| (jrbTresMeses.isSelected() == false && jrbSeisMeses.isSelected() == false
							&& jrbDoceMeses.isSelected() == false)) {

				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos solicitados", "Campos vacios",
						JOptionPane.WARNING_MESSAGE);
			} else {
				if (jcbConsultasIlimitadas.isSelected()) {
					consultas = true;
				}

				if (jcbAmbulancia.isSelected()) {
					ambulancia = true;
				}

				if (jcbAsistenciaCasa.isSelected()) {
					asistencia = true;
				}

				if (jrbTresMeses.isSelected()) {
					tres = true;
				}

				if (jrbSeisMeses.isSelected()) {
					seis = true;
				}

				if (jrbDoceMeses.isSelected()) {
					doce = true;
				}

				String respuestaSimulacion = miSafePet.calcularPlanSimulacion(contadorMascotas, consultas, ambulancia,
						asistencia, tres, seis, doce);

				String nombre = JTextNombre.getText();
				JOptionPane.showMessageDialog(null, "Sr(a) " + nombre + "\n\n" + respuestaSimulacion,
						"Simulacion exitosa", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void limpiarInterfaz() {

		JTextNombreMascota.setText("");
		JTextRaza.setText("");
		JTextPeso.setText("");
		JTextColor.setText("");
	}
}
