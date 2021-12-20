package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Mensajeria;
import logicaDeDatos.Empleado;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaAdministracion extends JFrame {

	private JPanel contentPane;
	private JFrame ventanaAnterior;
	private JList listMemoria;
	private JButton btnAcceder;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public VentanaAdministracion(String usuario, String pass, JFrame ventanaAnterior) {
		this.ventanaAnterior=ventanaAnterior;
		
		Mensajeria m1 = new Mensajeria("15/07/2022", true);
		Mensajeria m2 = new Mensajeria("23/09/2022", false);
		Mensajeria m3 = new Mensajeria("2/11/2022", false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Terminar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEntrada vE = new VentanaEntrada();
				vE.setVisible(true);
				VentanaAdministracion.this.setVisible(false);
			}
		});
		button.setBounds(468, 12, 115, 29);
		contentPane.add(button);
		
		listMemoria = new JList();
		listMemoria.setBounds(15, 97, 126, 172);
		contentPane.add(listMemoria);
		DefaultListModel<Mensajeria> correo = new DefaultListModel<Mensajeria>();
		correo.addElement(m1);
		correo.addElement(m2);
		correo.addElement(m3);
		listMemoria.setModel(correo);
		
		JLabel lblMemoriaDeGuardado = new JLabel("Correo del Administrador");
		lblMemoriaDeGuardado.setBounds(15, 75, 188, 20);
		contentPane.add(lblMemoriaDeGuardado);
		
		btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indiceSeleccionado = listMemoria.getSelectedIndex();
				if(indiceSeleccionado==0) {
					Mensajeria mSeleccionada = (Mensajeria)listMemoria.getSelectedValue();
					Mensaje1 mensaje1 = new Mensaje1(VentanaAdministracion.this, mSeleccionada);
					mensaje1.setVisible(true);
					//VentanaAdministraion.this.setVisible(false);
				}
				if(indiceSeleccionado==1){
					Mensajeria mSeleccionada2 = (Mensajeria)listMemoria.getSelectedValue();
					Mensaje2 mensaje2 = new Mensaje2(VentanaAdministracion.this, mSeleccionada2);
					mensaje2.setVisible(true);
					//VentanaAdministraion.this.setVisible(false);
				}
				if(indiceSeleccionado==2){
					Mensajeria mSeleccionada3 = (Mensajeria)listMemoria.getSelectedValue();
					Mensaje3 mensaje3 = new Mensaje3(VentanaAdministracion.this, mSeleccionada3);
					mensaje3.setVisible(true);
					//VentanaAdministraion.this.setVisible(false);
				}
			}
		});
		btnAcceder.setBounds(15, 273, 107, 29);
		contentPane.add(btnAcceder);
		
		JLabel lblDatoGuardado = new JLabel("mensaje");
		lblDatoGuardado.setBounds(15, 303, 72, 20);
		contentPane.add(lblDatoGuardado);
		
		JLabel label = new JLabel("----------------------------------------------------------------------------------------");
		label.setBounds(15, 39, 555, 20);
		contentPane.add(label);
		
		JLabel lblorden1_2_1_1 = new JLabel("SALA DEL ADMINISTRADOR:");
		lblorden1_2_1_1.setBounds(15, 16, 223, 20);
		contentPane.add(lblorden1_2_1_1);
		
		JLabel nombreAdministrador = new JLabel(usuario);
		nombreAdministrador.setBounds(253, 16, 107, 20);
		contentPane.add(nombreAdministrador);
		
		JButton btnAcceder_1 = new JButton("Validar");
		btnAcceder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indiceSeleccionado = listMemoria.getSelectedIndex();
				if(indiceSeleccionado==0){
					if(m1.getFechaCreacion().equals(false)){
						JOptionPane.showMessageDialog(VentanaAdministracion.this, "El mensaje ha sido validado.");
						m1.setVerificado(true);	
					}
				}
				if(indiceSeleccionado==1){
					if(m2.getFechaCreacion().equals(false)){
						JOptionPane.showMessageDialog(VentanaAdministracion.this, "El mensaje ha sido validado.");
						m2.setVerificado(true);	
					}
				}
				if(indiceSeleccionado==2){
					if(m3.getFechaCreacion().equals(false)){
						JOptionPane.showMessageDialog(VentanaAdministracion.this, "El mensaje ha sido validado.");
						m3.setVerificado(true);	
					}
				}
			}
		});
		btnAcceder_1.setBounds(15, 336, 107, 29);
		contentPane.add(btnAcceder_1);
		
		JButton btnProducto = new JButton("Producto");
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCrearProducto vC = new VentanaCrearProducto();
				vC.setVisible(true);
				VentanaAdministracion.this.setVisible(false);
			}
		});
		btnProducto.setBounds(468, 256, 115, 29);
		contentPane.add(btnProducto);
		
		JLabel lblAadirUnNuevo_2 = new JLabel("A\u00F1adir un nuevo producto a la tienda:");
		lblAadirUnNuevo_2.setBounds(156, 260, 350, 20);
		contentPane.add(lblAadirUnNuevo_2);
		
		textField = new JTextField();
		textField.setBounds(240, 123, 343, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAnotacionesDelAdministrador = new JLabel("Anotaciones del administrador:");
		lblAnotacionesDelAdministrador.setBounds(240, 98, 277, 20);
		contentPane.add(lblAnotacionesDelAdministrador);
	}

	public VentanaAdministracion() {
		// TODO Auto-generated constructor stub
	}
}

