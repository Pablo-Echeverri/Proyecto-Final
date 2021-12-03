package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Mensajeria;

public class Mensaje1 extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Mensaje1(JFrame ventanaAnterior, Mensajeria correo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmisorDirectorGeneral = new JLabel("EMISOR:");
		lblEmisorDirectorGeneral.setBounds(15, 16, 78, 20);
		contentPane.add(lblEmisorDirectorGeneral);
		
		JLabel lblAsunto = new JLabel("ASUNTO:");
		lblAsunto.setBounds(15, 50, 78, 20);
		contentPane.add(lblAsunto);
		
		JLabel lblNewLabel = new JLabel("Director General");
		lblNewLabel.setBounds(184, 16, 147, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblAadirProducto = new JLabel("A\u00F1adir Producto");
		lblAadirProducto.setBounds(184, 50, 147, 20);
		contentPane.add(lblAadirProducto);
		
		JLabel lblMensaje = new JLabel("MENSAJE:");
		lblMensaje.setBounds(15, 87, 103, 20);
		contentPane.add(lblMensaje);
		
		JLabel lblSeDebeAadir = new JLabel("Se debe a\u00F1adir el producto LUNETA.");
		lblSeDebeAadir.setBounds(15, 123, 269, 20);
		contentPane.add(lblSeDebeAadir);
		
		JLabel lblEsUnProducto = new JLabel("Es un producto de tipo \"dulce\".");
		lblEsUnProducto.setBounds(15, 144, 269, 20);
		contentPane.add(lblEsUnProducto);
		
		JLabel lblPoseemosUnidades = new JLabel("Poseemos 50 unidades iniciales.");
		lblPoseemosUnidades.setBounds(15, 166, 269, 20);
		contentPane.add(lblPoseemosUnidades);
		
		JLabel lblRealizarOperacinAntes = new JLabel("Realizar operaci\u00F3n antes de finalizar el mes.");
		lblRealizarOperacinAntes.setBounds(15, 202, 316, 20);
		contentPane.add(lblRealizarOperacinAntes);
	
	
	
	}

}
