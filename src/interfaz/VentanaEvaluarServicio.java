package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.SafePet;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class VentanaEvaluarServicio extends JFrame implements ActionListener {

	private JPanel contentPane;

	private VentanaAfiliado miVentanaAfiliado;
	private SafePet miSafePet;
	
	private static final String FONDO = "./img/Fondo.png";
	private static final String BTNATRAS = "./img/BtnAtras.png";
	private static final String LOGOESQUINA = "./img/LogoEsquina.png";
	private static final String LATERALDERECHO = "./img/LateralDerecho.png";
	private static final String LATERALIZQUIERDO = "./img/LateralIzquierdo.png";
	private static final String ESTRELLA = "./img/estrella.png";

	private JButton btnAtras;
	private JButton btnCalificar;

	private ButtonGroup grupoCalificacion;
	private JRadioButton jrb1estrella;
	private JRadioButton jrb2estrella;
	private JRadioButton jrb3estrella;
	private JRadioButton jrb4estrella;
	private JRadioButton jrb5estrella;
	private JTextField textObsevaciones;

	int numEstrellas=0;
	int idPerson=0;
	public VentanaEvaluarServicio(VentanaAfiliado miVentanaAfiliado, SafePet miSafePet, int idPersona) {

		this.miVentanaAfiliado = miVentanaAfiliado;
		this.miSafePet = miSafePet;
		idPerson=idPersona;
		setTitle("SafePet UQ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAtras = new JButton(new ImageIcon(BTNATRAS));
		btnAtras.setBounds(10, 320, 110, 30);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);
		
		JLabel lblLogoEsquina1 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina1.setBounds(25, 11, 80, 80);
		contentPane.add(lblLogoEsquina1);

		JLabel lblLogoEsquina2 = new JLabel(new ImageIcon(LOGOESQUINA));
		lblLogoEsquina2.setBounds(495, 11, 80, 80);
		contentPane.add(lblLogoEsquina2);

		//ESTRELLAS 5
		JLabel estrella5a = new JLabel(new ImageIcon(ESTRELLA));
		estrella5a.setBounds(100, 88, 24, 23);
		contentPane.add(estrella5a);
		
		JLabel estrella5b = new JLabel(new ImageIcon(ESTRELLA));
		estrella5b.setBounds(120, 88, 24, 23);
		contentPane.add(estrella5b);

		JLabel estrella5c = new JLabel(new ImageIcon(ESTRELLA));
		estrella5c.setBounds(140, 88, 24, 23);
		contentPane.add(estrella5c);
		
		JLabel estrella5d = new JLabel(new ImageIcon(ESTRELLA));
		estrella5d.setBounds(160, 88, 24, 23);
		contentPane.add(estrella5d);
		
		JLabel estrella5e = new JLabel(new ImageIcon(ESTRELLA));
		estrella5e.setBounds(180, 88, 24, 23);
		contentPane.add(estrella5e);
		
		
		//ESTRELLAS 4
		JLabel estrella4a = new JLabel(new ImageIcon(ESTRELLA));
		estrella4a.setBounds(230, 88, 24, 23);
		contentPane.add(estrella4a);

		JLabel estrella4b = new JLabel(new ImageIcon(ESTRELLA));
		estrella4b.setBounds(250, 88, 24, 23);
		contentPane.add(estrella4b);
		
		JLabel estrella4c = new JLabel(new ImageIcon(ESTRELLA));
		estrella4c.setBounds(270, 88, 24, 23);
		contentPane.add(estrella4c);
		
		JLabel estrella4d = new JLabel(new ImageIcon(ESTRELLA));
		estrella4d.setBounds(290, 88, 24, 23);
		contentPane.add(estrella4d);
		
		//ESTRELLAS 3
		JLabel estrella3a = new JLabel(new ImageIcon(ESTRELLA));
		estrella3a.setBounds(337, 88, 24, 23);
		contentPane.add(estrella3a);

		JLabel estrella3b = new JLabel(new ImageIcon(ESTRELLA));
		estrella3b.setBounds(357, 88, 24, 23);
		contentPane.add(estrella3b);
		
		JLabel estrella3c = new JLabel(new ImageIcon(ESTRELLA));
		estrella3c.setBounds(377, 88, 24, 23);
		contentPane.add(estrella3c);
	
		//ESTRELLAS 2
		JLabel estrella2a = new JLabel(new ImageIcon(ESTRELLA));
		estrella2a.setBounds(426, 88, 24, 23);
		contentPane.add(estrella2a);
		
		JLabel estrella2b = new JLabel(new ImageIcon(ESTRELLA));
		estrella2b.setBounds(446, 88, 24, 23);
		contentPane.add(estrella2b);
		
		//ESTRELLAS 1
		JLabel estrella1a = new JLabel(new ImageIcon(ESTRELLA));
		estrella1a.setBounds(496, 88, 24, 23);
		contentPane.add(estrella1a);	
		
	
		JLabel lblLateralIzquierdo = new JLabel(new ImageIcon(LATERALIZQUIERDO));
		lblLateralIzquierdo.setBounds(40, 98, 50, 210);
		contentPane.add(lblLateralIzquierdo);

		JLabel lblLateralDerecho = new JLabel(new ImageIcon(LATERALDERECHO));
		lblLateralDerecho.setBounds(515, 98, 50, 210);
		contentPane.add(lblLateralDerecho);
	
		
		grupoCalificacion = new ButtonGroup();

		jrb1estrella = new JRadioButton();
		jrb1estrella.setForeground(Color.WHITE);
		jrb1estrella.setBounds(80, 88, 24, 23);
		jrb1estrella.setOpaque(false);
		contentPane.add(jrb1estrella);
		
		jrb2estrella = new JRadioButton();
		jrb2estrella.setForeground(Color.WHITE);
		jrb2estrella.setBounds(210, 88, 24, 23);
		jrb2estrella.setOpaque(false);
		contentPane.add(jrb2estrella);
	
		jrb3estrella = new JRadioButton();
		jrb3estrella.setForeground(Color.WHITE);
		jrb3estrella.setBounds(320, 88, 24, 23);
		jrb3estrella.setOpaque(false);
		contentPane.add(jrb3estrella);
		
		jrb4estrella = new JRadioButton();
		jrb4estrella.setForeground(Color.WHITE);
		jrb4estrella.setBounds(406, 88, 24, 23);
		jrb4estrella.setOpaque(false);
		contentPane.add(jrb4estrella);
		
		jrb5estrella = new JRadioButton();
		jrb5estrella.setForeground(Color.WHITE);
		jrb5estrella.setBounds(476, 88, 24, 23);
		jrb5estrella.setOpaque(false);
		contentPane.add(jrb5estrella);
		
		grupoCalificacion.add(jrb1estrella);
		grupoCalificacion.add(jrb2estrella);
		grupoCalificacion.add(jrb3estrella);
		grupoCalificacion.add(jrb4estrella);
		grupoCalificacion.add(jrb5estrella);


		JLabel lblObservaciones = new JLabel("Observaciones ");
		lblObservaciones.setForeground(Color.WHITE);
		lblObservaciones.setBounds(131, 137, 129, 23);
		contentPane.add(lblObservaciones);

		textObsevaciones = new JTextField();
		textObsevaciones.setBounds(130, 175, 375, 80);
		contentPane.add(textObsevaciones);
		textObsevaciones.setColumns(10);
				
		btnCalificar = new JButton("ENVIAR CALIFICACION");
		btnCalificar.setBounds(256, 295, 145, 30);
		btnCalificar.addActionListener(this);
		contentPane.add(btnCalificar);
		
		JLabel lblFondo = new JLabel(new ImageIcon(FONDO));
		lblFondo.setBounds(0, 0, 604, 361);
		contentPane.add(lblFondo);
		
	
	
	}	
	
	public void limpiarInterfaz() {
		textObsevaciones.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnAtras) {

			miVentanaAfiliado.setVisible(true);
			miVentanaAfiliado.setLocationRelativeTo(null);
			setVisible(false);
		}
				
		if(e.getSource() == btnCalificar) {
			
			if(textObsevaciones.getText()=="" || (jrb1estrella.isSelected() == false && 
				jrb2estrella.isSelected() == false && jrb3estrella.isSelected() == false 
				&& jrb4estrella.isSelected() == false && jrb5estrella.isSelected() == false)){
				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos solicitados", "Campos vacios",JOptionPane.WARNING_MESSAGE);		
			}
			else{
				if(jrb1estrella.isSelected()){
					numEstrellas=5;
				}
				if(jrb2estrella.isSelected()){
					numEstrellas=4;
				}
				if(jrb3estrella.isSelected()){
					numEstrellas=3;
				}
				if(jrb4estrella.isSelected()){
					numEstrellas=2;
				}
				if(jrb5estrella.isSelected()){
					numEstrellas=1;
				}
				
				String respuesta= miSafePet.evaluarServicio(idPerson,numEstrellas, textObsevaciones.getText() );
				JOptionPane.showMessageDialog(null, respuesta, "", JOptionPane.INFORMATION_MESSAGE);
				textObsevaciones.setText("");

			}
			

		}
	}
}
