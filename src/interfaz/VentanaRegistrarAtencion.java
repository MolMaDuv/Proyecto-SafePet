package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import java.time.LocalDateTime;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.Afiliado;
import mundo.Prestacion;
import mundo.SafePet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaRegistrarAtencion extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField capturaFecha;
	private JTextField capturaMotivo;
	private JTextField capturaDiagnostivo;
	private JTextField capturaTratamiento;
	
	private JButton botonAgregar;
	private SafePet miSafePet;
	private Prestacion miPrestacion;
	private JTextField capturaAfiliado;
	private JLabel lblNewLabel_4;
	
	private SafePet misaSafePet;
	private VentanaFuncionario miVentanaFuncionario;
	private JButton botonAtras;
	private JLabel lblNewLabel_5;
	private final JTextField capturaBeneficiario = new JTextField();
	
	
	

	public VentanaRegistrarAtencion(VentanaFuncionario miVentanaFuncionario, SafePet miSafePet) 
	
	{
		this.miVentanaFuncionario= miVentanaFuncionario;
		this.miSafePet = miSafePet;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha de consulta");
		lblNewLabel.setBounds(87, 78, 87, 14);
		contentPane.add(lblNewLabel);
		
		capturaFecha = new JTextField();
		capturaFecha.setBounds(201, 75, 194, 20);
		contentPane.add(capturaFecha);
		capturaFecha.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Motivo de la consulta");
		lblNewLabel_1.setBounds(87, 115, 157, 14);
		contentPane.add(lblNewLabel_1);
		
		capturaMotivo = new JTextField();
		capturaMotivo.setBounds(201, 112, 194, 48);
		contentPane.add(capturaMotivo);
		capturaMotivo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Diagnostico");
		lblNewLabel_2.setBounds(87, 185, 123, 14);
		contentPane.add(lblNewLabel_2);
		
		capturaDiagnostivo = new JTextField();
		capturaDiagnostivo.setBounds(201, 182, 194, 42);
		contentPane.add(capturaDiagnostivo);
		capturaDiagnostivo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tratamiento");
		lblNewLabel_3.setBounds(87, 260, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		capturaTratamiento = new JTextField();
		capturaTratamiento.setBounds(201, 257, 194, 48);
		contentPane.add(capturaTratamiento);
		capturaTratamiento.setColumns(10);
		
		 botonAgregar = new JButton("Agregar");
		botonAgregar.setBounds(424, 302, 89, 23);
		contentPane.add(botonAgregar);
		botonAgregar.addActionListener(this);
		
		capturaAfiliado = new JTextField();
		capturaAfiliado.setBounds(200, 11, 86, 20);
		contentPane.add(capturaAfiliado);
		capturaAfiliado.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Codigo del afiliado");
		lblNewLabel_4.setBounds(73, 14, 100, 14);
		contentPane.add(lblNewLabel_4);
		
		botonAtras = new JButton("Atras");
		botonAtras.setBounds(24, 327, 89, 23);
		contentPane.add(botonAtras);
		
		lblNewLabel_5 = new JLabel("codigo del beneficiario");
		lblNewLabel_5.setBounds(73, 39, 46, 14);
		contentPane.add(lblNewLabel_5);
		capturaBeneficiario.setText("");
		capturaBeneficiario.setBounds(186, 42, 141, 20);
		contentPane.add(capturaBeneficiario);
		capturaBeneficiario.setColumns(10);
		botonAtras.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==botonAgregar) 
		{
			 int codigoA= Integer.parseInt(capturaAfiliado.getText());
			 int codigoB= Integer.parseInt(capturaBeneficiario.getText());
			 
			 String fecha= capturaFecha.getText();
			 String motivoString= capturaMotivo.getText();
			 String diagnotico= capturaDiagnostivo.getText();
			 String tratamiento = capturaTratamiento.getText();
			 
			 Afiliado miAfiliado= miSafePet.buscarUsuario(codigoA);
			 if(miAfiliado!=null) 
			 {
			 
			Prestacion miPrestacion = new Prestacion(0, codigoA,codigoB,fecha, motivoString, diagnotico, tratamiento);
			 
			 miSafePet.agregarRegistroAtencion(miPrestacion);
			 }
			 
			 else 
			 {
				 JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			 }
			 
			 
		}
		if(e.getSource()==botonAtras) 
		{
			miVentanaFuncionario.setVisible(true);
			miVentanaFuncionario.setLocationRelativeTo(null);
			setVisible(false);
		}
	}
}
