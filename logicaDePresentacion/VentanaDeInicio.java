package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Cliente;
import logicaDeDatos.Empleado;
import logicaDeDatos.Persona;
import java.awt.Font;



public class VentanaDeInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblBienvenido;
	private JButton btnRegistrarse;
	private JButton btnSalir;
	

	/**
	 * Create the frame.
	 */
	
	public VentanaDeInicio() {
		
		Cliente c1 = new Cliente("Javier", "Magallón", 43, 659235735, 1, "JavierMag", 12345692, 150, false);
		Cliente c2 = new Cliente("Begoña", "Irizar", 21, 846274958, 2, "BegoñaIri", 73823, 150, true);
		Cliente c3 = new Cliente("Maialen", "Jimenez", 56, 917366421, 3, "MaialenJim", 111111111, 100, true);
		Cliente c4 = new Cliente("David", "Magallón", 25, 904728473, 4, "DavidMag", 828391, 240, false);
		Cliente c5 = new Cliente("Pablo", "Díez", 18, 999183741, 5, "PabloDiz", 982020, 75, true);
		Cliente c6 = new Cliente("Iñaki", "Santacana", 15, 123836284, 6, "IñakiSant", 949237, 40, false);
		Cliente c7 = new Cliente("Cristina", "Ocina", 16, 248271522, 7, "CristinaOc", 1123, 300, false);
		Cliente c8 = new Cliente("Nora", "Sanchez", 34, 892738438, 8, "NoraSanc", 90283, 111, true);
		Cliente c9 = new Cliente("Maria Jose", "Farias", 39, 22397483, 9, "MariJoseFar", 2348439, 134, false);
		Cliente c10 = new Cliente("Rafael", "Múgica", 40, 908009128, 10, "RafaelMug", 3467221, 96, true);


		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(91, 138, 69, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(91, 227, 150, 20);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(91, 174, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(91, 263, 146, 26);
		contentPane.add(passwordField);
		
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoUsuario = textField.getText();
				String passwordTexto= passwordField.getText();
				
				if(textoUsuario.equals("JavierMag")&&passwordTexto.equals("12345692")){
					VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
					vT.setVisible(true);
					VentanaDeInicio.this.setVisible(false);
				}else{
					if(textoUsuario.equals("BegoñaIri")&&passwordTexto.equals("73823")){
						VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
						vT.setVisible(true);
						VentanaDeInicio.this.setVisible(false);
					}else{
						if(textoUsuario.equals("MaialenJim")&&passwordTexto.equals("111111111")){
							VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
							vT.setVisible(true);
							VentanaDeInicio.this.setVisible(false);
						}else{	
							if(textoUsuario.equals("DavidMag")&&passwordTexto.equals("828391")){
								VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
								vT.setVisible(true);
								VentanaDeInicio.this.setVisible(false);
							}else{	
								if(textoUsuario.equals("PabloDiz")&&passwordTexto.equals("982020")){
									VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
									vT.setVisible(true);
									VentanaDeInicio.this.setVisible(false);
								}else{	
									if(textoUsuario.equals("IñakiSant")&&passwordTexto.equals("949237")){
										VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
										vT.setVisible(true);
										VentanaDeInicio.this.setVisible(false);
									}else{
										if(textoUsuario.equals("CristinaOc")&&passwordTexto.equals("1123")){
											VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
											vT.setVisible(true);
											VentanaDeInicio.this.setVisible(false);
										}else{
											if(textoUsuario.equals("NoraSanc")&&passwordTexto.equals("90283")){
												VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
												vT.setVisible(true);
												VentanaDeInicio.this.setVisible(false);
											}else{
												if(textoUsuario.equals("MariJoseFar")&&passwordTexto.equals("2348439")){
													VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
													vT.setVisible(true);
													VentanaDeInicio.this.setVisible(false);
												}else{
													if(textoUsuario.equals("RafaelMug")&&passwordTexto.equals("3467221")){
														VentanaTienda vT = new VentanaTienda(textoUsuario, passwordTexto, VentanaDeInicio.this);
														vT.setVisible(true);
														VentanaDeInicio.this.setVisible(false);
													}else{	
														JOptionPane.showMessageDialog(VentanaDeInicio.this, "Nombre de Usuario o Contraseña erroneos.");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		});
		btnAcceder.setBounds(235, 334, 102, 29);
		contentPane.add(btnAcceder);
		
		lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido.setBounds(80, 39, 192, 60);
		contentPane.add(lblBienvenido);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro vR = new VentanaRegistro();
				vR.setVisible(true);
				VentanaDeInicio.this.setVisible(false);
				JOptionPane.showMessageDialog(VentanaDeInicio.this, "Mediante esta opción puede realizar un registro de usuario.");
			}
		});
		btnRegistrarse.setBounds(0, 334, 115, 29);
		contentPane.add(btnRegistrarse);
		
		btnSalir = new JButton("Volver");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaDeInicio.this, "Está volviendo atrás");
				VentanaPrincipal vP = new VentanaPrincipal();
				vP.setVisible(true);
				VentanaDeInicio.this.setVisible(false);
			}
		});
		btnSalir.setBounds(130, 334, 96, 29);
		contentPane.add(btnSalir);
		}
	
		public void limpiarTextField() {
			this.textField.setText("");
			this.passwordField.setText("");
	}

}