package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Cliente;
import logicaDePresentacion.VentanaTienda;


import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaDeInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDeInicio frame = new VentanaDeInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public VentanaDeInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(63, 178, 238, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				VentanaTienda vT = new VentanaTienda();
				vT.setVisible(true);
				VentanaDeInicio.this.setVisible(false);	
				
				}
			
		});
		btnEntrar.setBounds(229, 398, 115, 29);
		contentPane.add(btnEntrar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaRegistro vR = new VentanaRegistro();
				vR.setVisible(true);
				VentanaDeInicio.this.setVisible(false);	
			}
		});
		btnRegistrarse.setBounds(15, 398, 115, 29);
		contentPane.add(btnRegistrarse);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(63, 274, 238, 26);
		contentPane.add(passwordField);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario:");
		lblNombreUsuario.setBounds(63, 142, 181, 20);
		contentPane.add(lblNombreUsuario);
		
		JLabel lblNombreContrasea = new JLabel("Contrase\u00F1a:");
		lblNombreContrasea.setBounds(63, 238, 181, 20);
		contentPane.add(lblNombreContrasea);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(103, 35, 152, 56);
		contentPane.add(lblNewLabel);
	}
}
