package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Empleado;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEntrada extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public VentanaEntrada() {
		
		Empleado e1 = new Empleado("Gabriel", "Carro", 48, 259642492, 1, "GabrielCar", 601109, 1);
		Empleado e2 = new Empleado("Belen", "Cañas", 21, 753777433, 2, "BelenCa", 771398, 3);
		Empleado e3 = new Empleado("Maialen", "Arias", 46, 864587542, 3, "MaialenAria", 648368, 1);
		Empleado e4 = new Empleado("Placido", "Marcos", 56, 468207517, 4, "PlacidoMar", 573209, 1);
		Empleado e5 = new Empleado("Teresa", "Hinojosa", 24, 691484683, 5, "TeresaHino", 386819, 3);
		Empleado e6 = new Empleado("Denis", "San-Martin", 56, 159127413, 6, "DenisSan", 17527, 2);
		Empleado e7 = new Empleado("Guillem", "Montilla", 54, 100271799, 7, "GuillemMon", 296362, 2);
		Empleado e8 = new Empleado("Constantin", "Redondo", 23, 315669709, 8, "ConstantinRedo", 23565, 1);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(83, 28, 69, 20);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 51, 146, 26);
		contentPane.add(textField);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(81, 93, 150, 20);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 118, 146, 26);
		contentPane.add(passwordField);
		
		JButton btnSalir = new JButton("Volver");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaEntrada.this, "Está volviendo atrás");
				VentanaPrincipal vP = new VentanaPrincipal();
				vP.setVisible(true);
				VentanaEntrada.this.setVisible(false);
			}
		});
		btnSalir.setBounds(43, 199, 96, 29);
		contentPane.add(btnSalir);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoUsuario = textField.getText();
				String passwordTexto= passwordField.getText();
				
				if(textoUsuario.equals("GabrielCar")&&passwordTexto.equals("601109")){
					VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
					vA.setVisible(true);
					VentanaEntrada.this.setVisible(false);
				}else{
					if(textoUsuario.equals("BelenCa")&&passwordTexto.equals("771398")){
						VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
						vA.setVisible(true);
						VentanaEntrada.this.setVisible(false);
					}else{
						if(textoUsuario.equals("MaialenAria")&&passwordTexto.equals("648368")){
							VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
							vA.setVisible(true);
							VentanaEntrada.this.setVisible(false);
						}else{	
							if(textoUsuario.equals("PlacidoMar")&&passwordTexto.equals("573209")){
								VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
								vA.setVisible(true);
								VentanaEntrada.this.setVisible(false);
							}else{	
								if(textoUsuario.equals("PabloDiz")&&passwordTexto.equals("982020")){
									VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
									vA.setVisible(true);
									VentanaEntrada.this.setVisible(false);
								}else{	
									if(textoUsuario.equals("TeresaHino")&&passwordTexto.equals("386819")){
										VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
										vA.setVisible(true);
										VentanaEntrada.this.setVisible(false);
									}else{
										if(textoUsuario.equals("DenisSan")&&passwordTexto.equals("17527")){
											VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
											vA.setVisible(true);
											VentanaEntrada.this.setVisible(false);
										}else{
											if(textoUsuario.equals("GuillemMon")&&passwordTexto.equals("296362")){
												VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
												vA.setVisible(true);
												VentanaEntrada.this.setVisible(false);
											}else{
												if(textoUsuario.equals("ConstantinRedo")&&passwordTexto.equals("23565")){
													VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaEntrada.this);
													vA.setVisible(true);
													VentanaEntrada.this.setVisible(false);
												}else{
													JOptionPane.showMessageDialog(VentanaEntrada.this, "Nombre de Usuario o Contraseña erroneos.");	
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
		btnAcceder.setBounds(164, 199, 102, 29);
		contentPane.add(btnAcceder);
	}
}
