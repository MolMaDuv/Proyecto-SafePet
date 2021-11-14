package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import mundo.Afiliado;
import mundo.Prestacion;
import mundo.SafePet;
import javax.swing.JButton;

public class VentanaRevisarPrestaciones extends JFrame implements ActionListener {

	
	
	private JPanel contentPane;
	JScrollPane panelTabla = new JScrollPane();
	DefaultTableModel modelo;
	JTable tabla;
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
		panelTabla.setBounds(70, 67, 462, 230);
		contentPane.add(panelTabla);
		
		 btnAtras = new JButton("Atras");
		btnAtras.addActionListener(this);
		btnAtras.setBounds(10, 327, 89, 23);
		contentPane.add(btnAtras);
		
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
