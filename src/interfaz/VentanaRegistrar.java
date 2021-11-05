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
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaRegistrar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField capturaNombre;
	private JTextField capturaId;
	private JTextField capturaTel;
	private JTextField capturaDir;
	private JTextField capturaCorreo;
	private JTextField capturaEdad;
	private JButton agregar;
	private SafePet miSafePet;



	/**
	 * Create the frame.
	 */
	public VentanaRegistrar()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(134, 90, 46, 14);
		contentPane.add(lblNewLabel);
		
		capturaNombre = new JTextField();
		capturaNombre.setBounds(190, 87, 86, 20);
		contentPane.add(capturaNombre);
		capturaNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(134, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		capturaId = new JTextField();
		capturaId.setBounds(190, 51, 86, 20);
		contentPane.add(capturaId);
		capturaId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(134, 133, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		capturaTel = new JTextField();
		capturaTel.setBounds(190, 130, 86, 20);
		contentPane.add(capturaTel);
		capturaTel.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setBounds(134, 172, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		capturaDir = new JTextField();
		capturaDir.setBounds(190, 169, 86, 20);
		contentPane.add(capturaDir);
		capturaDir.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setBounds(134, 210, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		capturaCorreo = new JTextField();
		capturaCorreo.setBounds(190, 207, 86, 20);
		contentPane.add(capturaCorreo);
		capturaCorreo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Edad");
		lblNewLabel_5.setBounds(134, 247, 58, 14);
		contentPane.add(lblNewLabel_5);
		
		capturaEdad = new JTextField();
		capturaEdad.setBounds(190, 244, 86, 20);
		contentPane.add(capturaEdad);
		capturaEdad.setColumns(10);
		
		agregar = new JButton("Agregar");
		agregar.setBounds(336, 277, 89, 23);
		contentPane.add(agregar);
		agregar.addActionListener(this);
		
		JLabel lblNewLabel_6 = new JLabel("Ingrese los siguientes datos");
		lblNewLabel_6.setBounds(116, 11, 265, 14);
		contentPane.add(lblNewLabel_6);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == agregar) {	
			
			int id= Integer.parseInt(capturaId.getText());
			String nombre = capturaNombre.getText();
			String telefono= capturaTel.getText();
			String direccion = capturaDir.getText();
			String correo = capturaCorreo.getText();
			int edad= Integer.parseInt(capturaEdad.getText());
			
			boolean validacioUsuario = miSafePet.validarExistenciaUsuario(id);
			
			if(validacioUsuario == false) {
				
				Afiliado miAfiliado = new Afiliado(id, nombre, telefono, direccion, correo, edad,0,null);
				miSafePet.agregarUsuario(miAfiliado);	
			}
			
		}
	}

}

