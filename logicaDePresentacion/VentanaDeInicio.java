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
		
		Cliente cx = new Cliente("Javier", "Magallón", 43, 659235735, 1, "JavierMag", 12345692, 150, false);
//		Cliente c? = new Cliente(nombreP, apellidoP, edadP, numContacto, codigoIdentP, usuarioC, contraseniaC, saldo, esVIP)
		
		Empleado ex = new Empleado("Gabriel", "Carro", 48, 259642492, 2, "GabrielCar", 601109, 1);
//		Empleado e? = new Empleado(nombreP, apellidoP, edadP, numContacto, codigoIdentP, usuarioE, contraseniaE, rangoE)

		
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
		
// Cambiar Acceder para que se pueda hacer con todos los usuarios 		
		
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
					if(textoUsuario.equals("GabrielCar")&&passwordTexto.equals("601109")){
						VentanaAdministracion vA = new VentanaAdministracion(textoUsuario, passwordTexto, VentanaDeInicio.this);
						vA.setVisible(true);
						VentanaDeInicio.this.setVisible(false);
					}else{	
						JOptionPane.showMessageDialog(VentanaDeInicio.this, "Nombre de Usuario o Contraseña erroneos.");
					}
				}
				
			}
		});
		btnAcceder.setBounds(224, 334, 102, 29);
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
		btnRegistrarse.setBounds(15, 334, 115, 29);
		contentPane.add(btnRegistrarse);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrar un mensaje en el que puedas elegir opciones
				JOptionPane.showInputDialog(VentanaDeInicio.this, "¿Desea cerrar la aplicación?", "SÍ");
				System.exit(0);
			}
		});
		btnSalir.setBounds(145, 334, 69, 29);
		contentPane.add(btnSalir);
		}
	
		public void limpiarTextField() {
			this.textField.setText("");
			this.passwordField.setText("");
	}

}