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

public class VentanaConfeccionarPlan extends JFrame implements ActionListener {

	private VentanaFuncionario miVentanaFuncionario;
	private SafePet miSafePet;
	private Afiliado miAfiliado;
	private Empleado miEmpleado;
	private ArrayList<Beneficiario> misBeneficiarios = new ArrayList<Beneficiario>();

	private JPanel contentPane;
	private static final String FONDO = "./img/fondoGrande.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String BTNAGREGAR = "./img/BtnAgregar.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerechoGrande.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdoGrande.png";

	private JButton btnAtras;
	private JButton btnAgregar;
	private JButton btnRegistrar;

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

	/**
	 * Create the frame.
	 * 
	 * @param miSafePet
	 * @param miAfiliado
	 * @param miVentanaInicio
	 */
	public VentanaConfeccionarPlan(VentanaFuncionario miVentanaFuncionario, SafePet miSafePet, Afiliado miAfiliado,
			Empleado miEmpleado) {

		this.miVentanaFuncionario = miVentanaFuncionario;
		this.miSafePet = miSafePet;
		this.miAfiliado = miAfiliado;
		this.miEmpleado = miEmpleado;

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

		JLabel lblFuncionario = new JLabel("Funcionario " + miEmpleado.getNombre() + " - " + miEmpleado.getId());
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setBounds(128, 11, 275, 20);
		contentPane.add(lblFuncionario);

		JLabel lblAfiliado = new JLabel("Afiliado " + miAfiliado.getNombre());
		lblAfiliado.setForeground(Color.WHITE);
		lblAfiliado.setBounds(128, 47, 170, 20);
		contentPane.add(lblAfiliado);

		JLabel lblId = new JLabel("Id " + miAfiliado.getId());
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(308, 47, 110, 20);
		contentPane.add(lblId);

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

		btnRegistrar = new JButton(new ImageIcon(BTNAGREGAR));
		btnRegistrar.setBounds(484, 520, 110, 30);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);

		btnAgregar = new JButton(new ImageIcon(BTNAGREGAR));
		btnAgregar.setBounds(252, 275, 110, 30);
		btnAgregar.addActionListener(this);
		contentPane.add(btnAgregar);

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

		JLabel lblPesoMascota = new JLabel("Peso");
		lblPesoMascota.setForeground(Color.WHITE);
		lblPesoMascota.setBounds(131, 191, 60, 20);
		contentPane.add(lblPesoMascota);

		JTextPeso = new JTextField();
		JTextPeso.setBounds(201, 191, 86, 20);
		contentPane.add(JTextPeso);
		JTextPeso.setColumns(10);

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
		panelTabla.setBounds(100, 316, 405, 80);
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

			miVentanaFuncionario.setVisible(true);
			miVentanaFuncionario.setLocationRelativeTo(null);
			setVisible(false);
		}

		if (e.getSource() == btnAgregar) {

			String nombre = JTextNombreMascota.getText();
			String raza = JTextRaza.getText();
			String peso = JTextPeso.getText();
			String altura = JTextAltura.getText();
			String edad = JTextEdad.getText();
			String color = JTextColor.getText();

			if (nombre == "" || raza == "" || peso == "" || altura == "" || edad == "" || color == "") {
				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos solicitados",
						"Datos mascota incompletos", JOptionPane.WARNING_MESSAGE);
			} else {
				boolean validacionEdad= miSafePet.isInteger(edad);
				boolean validacionAltura= miSafePet.isInteger(altura);
				//boolean validacionPeso =  miSafePet.isInteger(peso);
				
				if(validacionEdad && validacionAltura) {
					String beneficiario[] = { nombre, raza, peso, altura, edad, color };
					modelo.addRow(beneficiario);

					Beneficiario miBeneficiario = new Beneficiario(miAfiliado.getId(), Integer.parseInt(edad), nombre, raza,
							Double.parseDouble(peso), Integer.parseInt(altura), color);
					misBeneficiarios.add(miBeneficiario);

					contadorMascotas++;
					limpiarInterfaz();
				}else {
					JOptionPane.showMessageDialog(null, "Por favor ingresar en los campos [edad, peso,altura] un dato numerico", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}

		if (e.getSource() == btnRegistrar) {

			if ((jcbConsultasIlimitadas.isSelected() == false && jcbAmbulancia.isSelected() == false
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

				int i = JOptionPane.showConfirmDialog(this, respuestaSimulacion + "\n\n¿Desea continuar con el plan?");

				if (i == 0) {

					double valor = miSafePet.valorPlan(contadorMascotas, consultas, ambulancia, asistencia, tres, seis,
							doce);

					double copago = miSafePet.calcularCopago(valor);

					Plan miPlan = new Plan(0, consultas, ambulancia, asistencia, valor, copago, miAfiliado,
							misBeneficiarios);
					miSafePet.agregarPlan(miPlan);

					JOptionPane.showMessageDialog(null, "Plan creado exitosamente", "Plan creado",
							JOptionPane.WARNING_MESSAGE);

					miVentanaFuncionario.setVisible(true);
					miVentanaFuncionario.setLocationRelativeTo(null);
					setVisible(false);
				}

				if (i == 1) {

					JOptionPane.showMessageDialog(null, "Se procedera a cancelar la creacion del plan",
							"Plan cancelado", JOptionPane.WARNING_MESSAGE);

					miVentanaFuncionario.setVisible(true);
					miVentanaFuncionario.setLocationRelativeTo(null);
					setVisible(false);
				}

			}
		}
	}

	public void limpiarInterfaz() {

		JTextNombreMascota.setText("");
		JTextRaza.setText("");
		JTextPeso.setText("");
		JTextAltura.setText("");
		JTextEdad.setText("");
		JTextColor.setText("");
	}
}
