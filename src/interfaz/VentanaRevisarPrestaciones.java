package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import mundo.Afiliado;
import mundo.Prestacion;
import mundo.SafePet;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VentanaRevisarPrestaciones extends JFrame implements ActionListener {

	
	
	private JPanel contentPane;
	JScrollPane panelTabla = new JScrollPane();
	DefaultTableModel modelo;
	JTable tabla;
	
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	
	private VentanaAfiliado miVentanaAfiliado;
	private SafePet miSafePet;
	private  Afiliado miAfiliado;
	private JButton btnAtras;
	
	public VentanaRevisarPrestaciones(VentanaAfiliado miVentanaAfiliado, SafePet miSafePet, Afiliado miAfiliado) {
		
		this.miVentanaAfiliado = miVentanaAfiliado;
		this.miSafePet= miSafePet;
		this.miAfiliado= miAfiliado;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTextoSuperior = new JLabel("PRESTACIONES REALIZADAS AL AFILIADO: "+miAfiliado.getNombre());
		lblTextoSuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoSuperior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTextoSuperior.setForeground(Color.WHITE);
		lblTextoSuperior.setBounds(10, 46, 584, 20);
		contentPane.add(lblTextoSuperior);

		modelo = new DefaultTableModel();

		modelo.addColumn("codigo");
		modelo.addColumn("fecha de consulta");
		modelo.addColumn("Motivo");
		modelo.addColumn("Diagnostico");
		modelo.addColumn("Tratamiento");

		tabla = new JTable(modelo);
		tabla.setBounds(132, 266, 340, 80);
		contentPane.add(tabla);

		panelTabla = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelTabla.setBounds(91, 98, 425, 211);
		contentPane.add(panelTabla);
		
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
		
		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);
		
		ArrayList<Prestacion> misPrestaciones= miSafePet.buscarPrestaciones(miAfiliado.getId());
		llenarTabla(misPrestaciones);

	}	
	
	public void llenarTabla(ArrayList<Prestacion> misPrestaciones) 
	
	{
		if(misPrestaciones.size()!=0) 
		{
			for (int i = 0; i < misPrestaciones.size(); i++) 
			
			{
					Prestacion miprestacion = misPrestaciones.get(i);
					
					String codigo = ""+miprestacion.getCodigoConsulta();
					String fecha = miprestacion.getFechaConsulta();
					String motivo= miprestacion.getMotivo();
					String diagnostico= miprestacion.getDiagnostico();
					String tratamiento= miprestacion.getTratamiento();
					
					
					
					String prestaciones[]= {codigo,fecha,motivo,diagnostico,tratamiento};
					modelo.addRow(prestaciones);
					
					
			}
		}
		
	}

	public void actionPerformed(ActionEvent e) 
	{
	
		
		miVentanaAfiliado.setVisible(true);
		miVentanaAfiliado.setLocationRelativeTo(null);
		setVisible(false);
		
	}
}
