package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

import mundo.Afiliado;
import mundo.Beneficiario;
import mundo.Empleado;
import mundo.Plan;
import mundo.SafePet;

public class VentanaModificarPlan extends JFrame implements ActionListener {

	private VentanaFuncionario miVentanaFuncionario;
	private SafePet miSafePet;
	private Empleado miEmpleado;
	private ArrayList<Beneficiario> listaMascotasDeAfiliado = new ArrayList<Beneficiario>();
	private JPanel contentPane;
	private static final String FONDO = "./img/fondoGrande.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String BTNAGREGAR = "./img/BtnAgregar.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerechoGrande.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdoGrande.png";

	private JButton btnAtras;
	private JButton btnAgregar;

	private JCheckBox jcbConsultasIlimitadas;
	private JCheckBox jcbAmbulancia;
	private JCheckBox jcbAsistenciaCasa;

	private ButtonGroup grupoTiempo;
	private JRadioButton jrbTresMeses;
	private JRadioButton jrbSeisMeses;
	private JRadioButton jrbDoceMeses;

	private JTextField JTextNombreMascota;
	private JTextField JTextRaza;
	private JTextField JTextCodigo;
	private JTextField JTextAltura;

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
	private JTextField JTextEdad;
	private JTextField JTextColor;
	private String idAfiliadoP;

	/**
	 * Create the frame.
	 * 
	 * @param miEmpleado
	 * @param miVentanaLogin
	 * 
	 * @param miSafePet
	 * @param miAfiliado
	 * @param miVentanaInicio
	 */
	public VentanaModificarPlan(VentanaFuncionario miVentanaFuncionario, Empleado miEmpleado, SafePet miSafePet,
			String idAfiliado) {

		this.miSafePet = miSafePet;
		this.miVentanaFuncionario = miVentanaFuncionario;
		this.miEmpleado = miEmpleado;
		idAfiliadoP = idAfiliado;

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
		lblTitulo.setBounds(10, 78, 584, 20);
		contentPane.add(lblTitulo);

		JLabel lblTextoSuperior = new JLabel("PARA CONFECCIONAR EL PLAN");
		lblTextoSuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoSuperior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTextoSuperior.setForeground(Color.WHITE);
		lblTextoSuperior.setBounds(10, 98, 584, 20);
		contentPane.add(lblTextoSuperior);

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

		JLabel lblDatosMascota = new JLabel("DATOS MASCOTA(S)");
		lblDatosMascota.setForeground(Color.WHITE);
		lblDatosMascota.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosMascota.setBounds(69, 129, 450, 20);
		contentPane.add(lblDatosMascota);

		JLabel lblNombreMascota = new JLabel("Nombre");
		lblNombreMascota.setForeground(Color.WHITE);
		lblNombreMascota.setBounds(131, 160, 60, 20);
		contentPane.add(lblNombreMascota);

		JTextNombreMascota = new JTextField();
		JTextNombreMascota.setBounds(201, 160, 86, 20);
		contentPane.add(JTextNombreMascota);
		JTextNombreMascota.setColumns(10);

		JLabel lblRazaMascota = new JLabel("Raza");
		lblRazaMascota.setForeground(Color.WHITE);
		lblRazaMascota.setBounds(297, 160, 60, 20);
		contentPane.add(lblRazaMascota);

		JTextRaza = new JTextField();
		JTextRaza.setBounds(367, 160, 86, 20);
		contentPane.add(JTextRaza);
		JTextRaza.setColumns(10);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBounds(131, 191, 60, 20);
		contentPane.add(lblCodigo);

		JTextCodigo = new JTextField();
		JTextCodigo.setBounds(201, 191, 86, 20);
		contentPane.add(JTextCodigo);
		JTextCodigo.setColumns(10);

		JLabel lblAlturaMascota = new JLabel("Altura");
		lblAlturaMascota.setForeground(Color.WHITE);
		lblAlturaMascota.setBounds(297, 191, 60, 20);
		contentPane.add(lblAlturaMascota);

		JTextAltura = new JTextField();
		JTextAltura.setBounds(367, 191, 86, 20);
		contentPane.add(JTextAltura);
		JTextAltura.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setBounds(128, 222, 65, 20);
		contentPane.add(lblEdad);

		JTextEdad = new JTextField();
		JTextEdad.setBounds(201, 222, 86, 20);
		contentPane.add(JTextEdad);
		JTextEdad.setColumns(10);

		JLabel lblColor = new JLabel("Color");
		lblColor.setForeground(Color.WHITE);
		lblColor.setBounds(297, 222, 60, 20);
		contentPane.add(lblColor);

		JTextColor = new JTextField();
		JTextColor.setBounds(367, 222, 86, 20);
		contentPane.add(JTextColor);
		JTextColor.setColumns(10);

		btnAgregar = new JButton(new ImageIcon(BTNAGREGAR));
		btnAgregar.setBounds(257, 264, 110, 30);
		btnAgregar.addActionListener(this);
		contentPane.add(btnAgregar);

		modelo = new DefaultTableModel();

		modelo.addColumn("Nombre");
		modelo.addColumn("Raza");
		modelo.addColumn("Peso");
		modelo.addColumn("Altura");
		modelo.addColumn("Edad");
		modelo.addColumn("Color");

		tabla = new JTable(modelo);
		tabla.setBounds(132, 266, 340, 80);
		contentPane.add(tabla);

		panelTabla = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelTabla.setBounds(100, 316, 405, 150);
		contentPane.add(panelTabla);

		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 561);
		contentPane.add(lblFondo);
		// Aqui se llena la tabla
		llenarTabla(idAfiliado);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAtras) {

			miVentanaFuncionario.setVisible(true);
			miVentanaFuncionario.setLocationRelativeTo(null);
			setVisible(false);
		}

		if (e.getSource() == btnAgregar) {

			String nombre = JTextNombreMascota.getText();
			String raza = JTextRaza.getText();
			String codigo = JTextCodigo.getText();
			String altura = JTextAltura.getText();
			String edad = JTextEdad.getText();
			String color = JTextColor.getText();

			if (nombre == "" || raza == "" || codigo == "" || altura == "" || edad == "" || color == "") {
				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos solicitados",
						"Datos mascota incompletos", JOptionPane.WARNING_MESSAGE);
			} else {
				String beneficiario[] = { codigo, nombre, raza, altura, edad, color };
				modelo.addRow(beneficiario);

				Beneficiario miBeneficiario = new Beneficiario(Integer.parseInt(edad), nombre, raza,
						Integer.parseInt(codigo), Integer.parseInt(altura), color);
				listaMascotasDeAfiliado.add(miBeneficiario);
				añadirBeneficiarioAlplan(miBeneficiario);

				contadorMascotas++;
				limpiarInterfaz();
			}
		}

	}

	public void llenarTabla(String idAfiliado) {
		ArrayList<Beneficiario> listaMascotasDeAfiliado;
		listaMascotasDeAfiliado = miSafePet.traerBeneficiarios(idAfiliado);
		for (int i = 0; i < listaMascotasDeAfiliado.size(); i++) {
			String nombre = listaMascotasDeAfiliado.get(i).getNombre();
			String raza = listaMascotasDeAfiliado.get(i).getRaza();
			String codigo = String.valueOf(listaMascotasDeAfiliado.get(i).getCodigo());
			String altura = String.valueOf(listaMascotasDeAfiliado.get(i).getAltura());
			String edad = String.valueOf(listaMascotasDeAfiliado.get(i).getEdad());
			String color = String.valueOf(listaMascotasDeAfiliado.get(i).getEdad());

			String beneficiario[] = { codigo, nombre, raza, altura, edad, color };
			modelo.addRow(beneficiario);
		}

	}

	private void añadirBeneficiarioAlplan(Beneficiario miBeneficiario) {
		miSafePet.añadirBeneficiarioAlplan(idAfiliadoP, miBeneficiario);
	}

	public void limpiarInterfaz() {

		JTextNombreMascota.setText("");
		JTextRaza.setText("");
		JTextCodigo.setText("");
		JTextAltura.setText("");
		JTextEdad.setText("");
		JTextColor.setText("");
	}
}
