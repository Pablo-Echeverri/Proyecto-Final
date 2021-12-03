package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Cliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField nombreRegistro;
	private JTextField apellidoRegistro;
	private JTextField edadRegistro;
	private JTextField numeroRegistro;
	private JTextField userRegistro;
	private JTextField passwordRegistro;

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreRegistro = new JTextField();
		nombreRegistro.setBounds(28, 69, 230, 26);
		contentPane.add(nombreRegistro);
		nombreRegistro.setColumns(10);
		
		apellidoRegistro = new JTextField();
		apellidoRegistro.setColumns(10);
		apellidoRegistro.setBounds(28, 135, 230, 26);
		contentPane.add(apellidoRegistro);
		
		edadRegistro = new JTextField();
		edadRegistro.setColumns(10);
		edadRegistro.setBounds(28, 199, 230, 26);
		contentPane.add(edadRegistro);
		
		numeroRegistro = new JTextField();
		numeroRegistro.setColumns(10);
		numeroRegistro.setBounds(28, 266, 230, 26);
		contentPane.add(numeroRegistro);
		
		JLabel lblIndiqueSuNombre = new JLabel("Indique su NOMBRE:");
		lblIndiqueSuNombre.setBounds(28, 43, 184, 20);
		contentPane.add(lblIndiqueSuNombre);
		
		JLabel lblIndiqueSuApellido = new JLabel("Indique su APELLIDO");
		lblIndiqueSuApellido.setBounds(28, 111, 184, 20);
		contentPane.add(lblIndiqueSuApellido);
		
		JLabel lblIndiqueSuEdad = new JLabel("Indique su EDAD:");
		lblIndiqueSuEdad.setBounds(28, 177, 184, 20);
		contentPane.add(lblIndiqueSuEdad);
		
		JLabel lblIndiqueUnNmero = new JLabel("Indique un N\u00DAMERO DE CONTACTO:");
		lblIndiqueUnNmero.setBounds(28, 241, 303, 20);
		contentPane.add(lblIndiqueUnNmero);
		
		JLabel lblIndiqueSuNombre_2 = new JLabel("Indique su NOMBRE DE USUARIO:");
		lblIndiqueSuNombre_2.setBounds(28, 321, 324, 20);
		contentPane.add(lblIndiqueSuNombre_2);
		
		userRegistro = new JTextField();
		userRegistro.setColumns(10);
		userRegistro.setBounds(28, 346, 230, 26);
		contentPane.add(userRegistro);
		
		passwordRegistro = new JTextField();
		passwordRegistro.setColumns(10);
		passwordRegistro.setBounds(28, 406, 230, 26);
		contentPane.add(passwordRegistro);
		
		JLabel lblIndiqueSuNombre_2_1 = new JLabel("Indique su CONTRASE\u00D1A:");
		lblIndiqueSuNombre_2_1.setBounds(28, 380, 324, 20);
		contentPane.add(lblIndiqueSuNombre_2_1);
		
		JButton btnTerminarRegistro = new JButton("Terminar Registro");
		btnTerminarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Cliente cx = new Cliente(nombreRegistro, apellidoRegistro, edadRegistro, numeroRegistro, 20, userRegistro, passwordRegistro, 0, false);
				
				VentanaDeInicio vI = new VentanaDeInicio();
				vI.setVisible(true);
				VentanaRegistro.this.setVisible(false);
			}
		});
		btnTerminarRegistro.setBounds(28, 448, 176, 29);
		contentPane.add(btnTerminarRegistro);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDeInicio vI = new VentanaDeInicio();
				vI.setVisible(true);
				VentanaRegistro.this.setVisible(false);
				JOptionPane.showMessageDialog(VentanaRegistro.this, "No se ha realizado nigún registro.");
			}
		});
		btnVolver.setBounds(222, 448, 88, 29);
		contentPane.add(btnVolver);
	}
}
