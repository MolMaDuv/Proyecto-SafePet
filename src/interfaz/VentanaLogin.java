package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.Afiliado;
import mundo.Empleado;
import mundo.SafePet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class VentanaLogin extends JFrame implements ActionListener {

	private VentanaInicio miVentanaInicio;

	private SafePet miSafePet;

	private JPanel contentPane;
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNINGRESAR = "./img/BtnIngresar.png";
	
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGIN = "./img/Login.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";

	private JComboBox comboBoxRol;
	private JTextField JTextContrase?a;

	private JButton btnIngresar;
	private JButton btnAtras;
	private JLabel lblIcono;

	/**
	 * Create the frame.
	 * 
	 * @param miSafePet
	 * @param miVentanaInicio
	 */
	public VentanaLogin(VentanaInicio miVentanaInicio, SafePet miSafePet) {

		setTitle("SafePet UQ");

		this.miVentanaInicio = miVentanaInicio;
		this.miSafePet = miSafePet;

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

		btnIngresar = new JButton(new ImageIcon(BTNINGRESAR));
		btnIngresar.setBounds(253, 263, 110, 30);
		btnIngresar.addActionListener(this);
		contentPane.add(btnIngresar);

		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 320, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);

		JLabel lblIcono = new JLabel(new ImageIcon(LOGIN));
		lblIcono.setBounds(249, 31, 130, 130);
		contentPane.add(lblIcono);

		JLabel lblUsuario = new JLabel("Rol");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(230, 184, 30, 20);
		contentPane.add(lblUsuario);

		comboBoxRol = new JComboBox();
		comboBoxRol.setModel(new DefaultComboBoxModel(new String[] { "", "Afiliado", "Funcionario"}));
		comboBoxRol.setBounds(270, 184, 110, 20);
		contentPane.add(comboBoxRol);

		JLabel lblContrase?a = new JLabel("Id");
		lblContrase?a.setForeground(Color.WHITE);
		lblContrase?a.setBounds(230, 215, 30, 20);
		contentPane.add(lblContrase?a);

		JTextContrase?a = new JTextField();
		JTextContrase?a.setColumns(10);
		JTextContrase?a.setBounds(270, 215, 110, 20);
		contentPane.add(JTextContrase?a);

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

		if (e.getSource() == btnIngresar) {
			
			String tipoPersona = (String) comboBoxRol.getSelectedItem();
			boolean validacionInteger =miSafePet.isInteger(JTextContrase?a.getText());
			
			if(!(tipoPersona.equalsIgnoreCase("")) ) {
				if (validacionInteger) {
				
					int id = Integer.parseInt(JTextContrase?a.getText());
					boolean validacion;
										
					if(tipoPersona == "Funcionario") {
						validacion = miSafePet.validarPersona(tipoPersona, id);
						
						if(validacion == true) {
							
							Empleado miEmpleado = miSafePet.buscarFuncionario(id);
							
							VentanaFuncionario miVentanaFuncionario = new VentanaFuncionario(this, miSafePet, miEmpleado);
							miVentanaFuncionario.setVisible(true);
							miVentanaFuncionario.setLocationRelativeTo(null);
							setVisible(false);
							
						} else {
							JOptionPane.showMessageDialog(null, "No existe ningun funcionario con los datos ingresados", "Error en login",
									JOptionPane.WARNING_MESSAGE);
						}
					}
					
					if(tipoPersona == "Afiliado") {
						validacion = miSafePet.validarPersona(tipoPersona, id);
						Afiliado miAfiliado = miSafePet.buscarUsuario(id);
						
						if(validacion == true) {
							
							VentanaAfiliado miVentanaAfiliado = new VentanaAfiliado(this, miSafePet,miAfiliado);
							miVentanaAfiliado.setVisible(true);
							miVentanaAfiliado.setLocationRelativeTo(null);
							setVisible(false);
							
						} else {
							JOptionPane.showMessageDialog(null, "No existe ningun afiliado con los datos ingresados", "Error en login",
									JOptionPane.WARNING_MESSAGE);
						}
					}
				}else {
					JOptionPane.showMessageDialog(null, "En el campo de Id, solamente ingresar valores numericos", "Error en login",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Por favor seleccionar una opcion [Afiliado] o [Funcionario]", "Error en login",
						JOptionPane.WARNING_MESSAGE);
				
			}
			
		}

		if (e.getSource() == btnAtras) {

			miVentanaInicio.setVisible(true);
			miVentanaInicio.setLocationRelativeTo(null);
			setVisible(false);
		}

	

	}
	
}
