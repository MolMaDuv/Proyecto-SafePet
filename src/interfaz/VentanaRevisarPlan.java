package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.SafePet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRevisarPlan extends JFrame implements ActionListener {

	private JPanel contentPane;

	private VentanaAfiliado miVentanaAfiliado;
	private SafePet miSafePet;
	private int id;
	
	private JButton btnVerPlan;
	private JButton btnAtras;
	private JTextField textFieldCodigo;
	private JLabel lblCodigo;
	private JLabel lblCopago;
	private JTextField textFieldCopago;
	private JLabel lblCantMascotas;
	private JTextField textFieldCantMascotas;
	private JLabel lblValor;
	private JTextField textFieldValor;
	private JLabel lblAmbulancia;
	private JTextField textFieldAmbulancia;
	private JLabel lblAsistencia;
	private JTextField textFieldAsistencia;
	private JLabel lblConsultas;
	private JTextField textFieldConsulta;

	/**
	 * Create the frame.
	 * @param id 
	 */
	public VentanaRevisarPlan(VentanaAfiliado miVentanaAfiliado, SafePet miSafePet, int id) {
		
		this.miVentanaAfiliado =miVentanaAfiliado;
		this.miSafePet = miSafePet;
		this.id=id;
		setTitle("SafePet UQ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnVerPlan = new JButton("Ver plan");
		btnVerPlan.addActionListener(this);
		
		btnVerPlan.setBounds(505, 290, 89, 23);
		contentPane.add(btnVerPlan);
		
		btnAtras = new JButton("atras");
		btnAtras.addActionListener(this);
		btnAtras.setBounds(32, 290, 89, 23);
		contentPane.add(btnAtras);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(305, 44, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(219, 47, 60, 14);
		contentPane.add(lblCodigo);
		
		lblCopago = new JLabel("Copago:");
		lblCopago.setBounds(219, 89, 60, 14);
		contentPane.add(lblCopago);
		
		textFieldCopago = new JTextField();
		textFieldCopago.setColumns(10);
		textFieldCopago.setBounds(305, 86, 86, 20);
		contentPane.add(textFieldCopago);
		
		lblCantMascotas = new JLabel("Mascotas:");
		lblCantMascotas.setBounds(219, 133, 60, 14);
		contentPane.add(lblCantMascotas);
		
		textFieldCantMascotas = new JTextField();
		textFieldCantMascotas.setColumns(10);
		textFieldCantMascotas.setBounds(305, 130, 86, 20);
		contentPane.add(textFieldCantMascotas);
		
		lblValor = new JLabel("Valor:");
		lblValor.setBounds(219, 175, 60, 14);
		contentPane.add(lblValor);
		
		textFieldValor = new JTextField();
		textFieldValor.setColumns(10);
		textFieldValor.setBounds(305, 172, 86, 20);
		contentPane.add(textFieldValor);
		
		lblAmbulancia = new JLabel("Ambulancia:");
		lblAmbulancia.setBounds(219, 217, 60, 14);
		contentPane.add(lblAmbulancia);
		
		textFieldAmbulancia = new JTextField();
		textFieldAmbulancia.setColumns(10);
		textFieldAmbulancia.setBounds(305, 214, 86, 20);
		contentPane.add(textFieldAmbulancia);
		
		lblAsistencia = new JLabel("Asistencia:");
		lblAsistencia.setBounds(219, 256, 60, 14);
		contentPane.add(lblAsistencia);
		
		textFieldAsistencia = new JTextField();
		textFieldAsistencia.setColumns(10);
		textFieldAsistencia.setBounds(305, 253, 86, 20);
		contentPane.add(textFieldAsistencia);
		
		lblConsultas = new JLabel("Consultas:");
		lblConsultas.setBounds(219, 296, 60, 14);
		contentPane.add(lblConsultas);
		
		textFieldConsulta = new JTextField();
		textFieldConsulta.setColumns(10);
		textFieldConsulta.setBounds(305, 293, 86, 20);
		contentPane.add(textFieldConsulta);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource() == btnAtras) {

			miVentanaAfiliado.setVisible(true);
			miVentanaAfiliado.setLocationRelativeTo(null);
			setVisible(false);
			
		}
		
		if (e.getSource() == btnVerPlan) {
			String msj= miSafePet.revisarPlan(id);
			
				
				String[] datos = msj.split("\n");
							
				textFieldCodigo.setText(datos[0]);
				textFieldCopago.setText(datos[1]);
				textFieldCantMascotas.setText(datos[2]);
				textFieldValor.setText(datos[3]);
				textFieldAmbulancia.setText(datos[4]);
				textFieldAsistencia.setText(datos[5]);
				textFieldConsulta.setText(datos[6]);
			
		}
	}
}
