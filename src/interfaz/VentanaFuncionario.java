package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.Afiliado;
import mundo.Empleado;
import mundo.Prestacion;
import mundo.SafePet;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class VentanaFuncionario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1292691058876270656L;

	private JPanel contentPane;

	private VentanaLogin miVentanaLogin;

	private SafePet miSafePet;
	private Empleado miEmpleado;

	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	private static final String BTNCONSULTARCOPAGO = "./img/ConsultarCopago.png";
	private static final String BTNREGISTRARCOPAGO = "./img/RegistrarCopago.png";
	private static final String BTNAGREGARUSUARIO = "./img/AgregarUsuario.png";
	private static final String BTNCONFECCIONARPLAN = "./img/ConfeccionarPlan.png";
	private static final String BTNMODIFICARPLAN = "./img/ModificarPlan.png";
	private static final String BTNREGISTRARATENCION = "./img/RegistrarAtencion.png";

	private JButton btnAtras;
	private JButton btnConsultarCopago;
	private JButton btnRegistrarCopago;
	private JButton btnAgregarUsuario;
	private JButton btnConfeccionarPlan;
	private JButton btnModificarPlan;
	private JButton btnRegistrarAtencion;

	public VentanaFuncionario(VentanaLogin miVentanaLogin, SafePet miSafePet, Empleado miEmpleado) {

		this.miVentanaLogin = miVentanaLogin;
		this.miSafePet = miSafePet;
		this.miEmpleado = miEmpleado;

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

		JLabel lblFuncionario = new JLabel("FUNCIONARIO");
		lblFuncionario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionario.setBounds(10, 11, 584, 30);
		contentPane.add(lblFuncionario);

		JLabel lblDatosFuncionario = new JLabel(miEmpleado.getNombre() + " - " + miEmpleado.getId());
		lblDatosFuncionario.setForeground(Color.WHITE);
		lblDatosFuncionario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatosFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosFuncionario.setBounds(10, 51, 584, 30);
		contentPane.add(lblDatosFuncionario);

		btnConsultarCopago = new JButton(new ImageIcon(BTNCONSULTARCOPAGO));
		btnConsultarCopago.setBounds(141, 128, 150, 30);
		btnConsultarCopago.addActionListener(this);
		contentPane.add(btnConsultarCopago);

		btnRegistrarCopago = new JButton(new ImageIcon(BTNREGISTRARCOPAGO));
		btnRegistrarCopago.setBounds(319, 128, 150, 30);
		btnRegistrarCopago.addActionListener(this);
		contentPane.add(btnRegistrarCopago);

		btnAgregarUsuario = new JButton(new ImageIcon(BTNAGREGARUSUARIO));
		btnAgregarUsuario.setBounds(141, 188, 150, 30);
		btnAgregarUsuario.addActionListener(this);
		contentPane.add(btnAgregarUsuario);

		btnConfeccionarPlan = new JButton(new ImageIcon(BTNCONFECCIONARPLAN));
		btnConfeccionarPlan.setBounds(319, 188, 150, 30);
		btnConfeccionarPlan.addActionListener(this);
		contentPane.add(btnConfeccionarPlan);

		btnModificarPlan = new JButton(new ImageIcon(BTNMODIFICARPLAN));
		btnModificarPlan.setBounds(141, 252, 150, 30);
		btnModificarPlan.addActionListener(this);
		contentPane.add(btnModificarPlan);

		btnRegistrarAtencion = new JButton(new ImageIcon(BTNREGISTRARATENCION));
		btnRegistrarAtencion.setBounds(319, 252, 150, 30);
		btnRegistrarAtencion.addActionListener(this);
		contentPane.add(btnRegistrarAtencion);

		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnConsultarCopago) {
			
			String prestacion = JOptionPane.showInputDialog("Ingrese el codigo de prestacion");

			boolean validacionPrestacion = miSafePet.isInteger(prestacion);
			
			if(prestacion!=null){
				if(validacionPrestacion){
					Prestacion miPrestacion = miSafePet.buscarPrestacionD(Integer.parseInt(prestacion));
					if (miPrestacion != null) {
						int codPrestacion = Integer.parseInt(prestacion);
						boolean estadoCopago = miSafePet.validarPagoCopago(codPrestacion);

						if (estadoCopago == false) {
							String respuesta = miSafePet.mostrarCopago(Integer.parseInt(prestacion));
							JOptionPane.showMessageDialog(null, respuesta);
							
						} else {
							JOptionPane.showMessageDialog(null, "El copago del servicio ya fue cancelado", "Copago pagado",
									JOptionPane.WARNING_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "No tiene copagos pendientes por pagar", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
					
				} else {		
					JOptionPane.showMessageDialog(null, "Por favor ingresar un dato numerico", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}

		if (e.getSource() == btnRegistrarCopago) {

			String prestacion = JOptionPane.showInputDialog("Ingrese el codigo de prestacion");

			boolean validacionPrestacion = miSafePet.isInteger(prestacion);
			
			if(prestacion!=null){
				if(validacionPrestacion){
					Prestacion miPrestacion = miSafePet.buscarPrestacionD(Integer.parseInt(prestacion));
					if (miPrestacion != null) {
						int codPrestacion = Integer.parseInt(prestacion);
						boolean estadoCopago = miSafePet.validarPagoCopago(codPrestacion);

						if (estadoCopago == false) {
							String respuesta = miSafePet.mostrarCopago(Integer.parseInt(prestacion));
							int opcion= JOptionPane.showConfirmDialog(this, respuesta + "\n\n?Desea cancelar copago");
							if(opcion==0){
								miSafePet.registrarCopago(Integer.parseInt(prestacion));
								JOptionPane.showMessageDialog(null, "Copago Registrado");
							}
						} else {
							JOptionPane.showMessageDialog(null, "El copago del servicio ya fue cancelado", "Copago pagado",
									JOptionPane.WARNING_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "No tiene copagos pendientes por pagar", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
					
				} else {		
					JOptionPane.showMessageDialog(null, "Por favor ingresar un dato numerico", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
			

		}

		if (e.getSource() == btnAgregarUsuario) {
			VentanaRegistrar miVentanaRegistrar = new VentanaRegistrar(this, miSafePet);
			miVentanaRegistrar.setVisible(true);
			miVentanaRegistrar.setLocationRelativeTo(null);
			setVisible(false);

		}

		if (e.getSource() == btnConfeccionarPlan) {

			String idConfeccionar = JOptionPane
					.showInputDialog("Ingrese el Id del usuario al cual le desea confeccionar el nuevo plan");

			boolean validacionIdConfeccionar = miSafePet.isInteger(idConfeccionar);
			if(idConfeccionar!=null){
				if (validacionIdConfeccionar) {

					Afiliado miAfiliado = miSafePet.buscarUsuario(Integer.parseInt(idConfeccionar));

					if (miAfiliado != null) {

						boolean bandera = miSafePet.validarExistenciaUsuarioEnPlan(idConfeccionar);

						if (bandera == false) {
							VentanaConfeccionarPlan miVentanaConfeccionarPlan = new VentanaConfeccionarPlan(this, miSafePet,
									miAfiliado, miEmpleado);
							miVentanaConfeccionarPlan.setVisible(true);
							miVentanaConfeccionarPlan.setLocationRelativeTo(null);
							setVisible(false);
						} else {
							JOptionPane.showMessageDialog(null, "El usuario ingresado ya cuenta con un plan", "Error",
									JOptionPane.WARNING_MESSAGE);
						}

					} else {
						JOptionPane.showMessageDialog(null, "No existe ningun afiliado con los datos ingresados", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Por favor ingresar un dato numerico", "Error",
							JOptionPane.WARNING_MESSAGE);
				}	
			}
		}

		if (e.getSource() == btnModificarPlan) {
			String idModificar = JOptionPane.showInputDialog(null, "Ingrese el ID del afiliado");

			boolean validacionIdModificar = miSafePet.isInteger(idModificar);
			
			if(idModificar!=null){
				if (validacionIdModificar) {
					if (miSafePet.buscarUsuario(Integer.parseInt(idModificar)) != null) {
						boolean bandera = miSafePet.validarExistenciaUsuarioEnPlan(idModificar);
						if (bandera) {
							VentanaModificarPlan miVentanaModificarPlan = new VentanaModificarPlan(this, miEmpleado,
									miSafePet, idModificar);
							miVentanaModificarPlan.setVisible(true);
							miVentanaModificarPlan.setLocationRelativeTo(null);
							setVisible(false);
						} else {
							JOptionPane.showMessageDialog(null, "El afiliado " + idModificar + " no tiene un plan ",
									"Afiliado Sin Plan", JOptionPane.WARNING_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "No existe ningun afiliado con los datos ingresados", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Por favor ingresar un dato numerico", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		

		}

		if (e.getSource() == btnAtras) {
			miVentanaLogin.setVisible(true);
			miVentanaLogin.setLocationRelativeTo(null);
			setVisible(false);
		}

		if (e.getSource() == btnRegistrarAtencion) {

			String idAfiliado = JOptionPane.showInputDialog(null, "Ingrese el ID del afiliado");

			boolean validacionIdModificar = miSafePet.isInteger(idAfiliado);

			if (validacionIdModificar) {
				int id = Integer.parseInt(idAfiliado);
				Afiliado miAfiliado = miSafePet.buscarUsuario(id);

				if (miAfiliado != null) {
					VentanaRegistrarAtencion miVentanaRegistrarAtencion = new VentanaRegistrarAtencion(this, miSafePet,
							miAfiliado);
					miVentanaRegistrarAtencion.setVisible(true);
					miVentanaRegistrarAtencion.setLocationRelativeTo(null);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "No existe ningun afiliado con los datos ingresados", "Error",
							JOptionPane.WARNING_MESSAGE);
				}

			}

		}

	}
}