package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import logicaDeDatos.Cliente;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaTienda extends JFrame {

	private JPanel contentPane;
	private JFrame ventanaAnterior;
	private JList listMemoria;
	private JButton btnAcceder;

	/**
	 * Create the frame.
	 */
	public VentanaTienda(String usuario, String pass, JFrame ventanaAnterior) {
		this.ventanaAnterior=ventanaAnterior;
		
		Cliente cx = new Cliente("Javier", "Magallón", 43, 659235735, 1, "JavierMag", 12345692, 150, false);

			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((VentanaDeInicio)ventanaAnterior).limpiarTextField();
				ventanaAnterior.setVisible(true);
				JOptionPane.showMessageDialog(VentanaTienda.this, "Cerrando sesión");
				VentanaTienda.this.setVisible(false);
			}
		});
		button.setBounds(468, 16, 115, 29);
		contentPane.add(button);
		
		JLabel label = new JLabel("----------------------------------------------------------------------------------------");
		label.setBounds(15, 55, 555, 20);
		contentPane.add(label);
		
		JLabel lblorden1_2_1_1 = new JLabel("BIENVENIDO:");
		lblorden1_2_1_1.setBounds(15, 20, 115, 20);
		contentPane.add(lblorden1_2_1_1);
		
		JLabel nombreCliente = new JLabel(cx.getNombreP());
		nombreCliente.setBounds(127, 20, 107, 20);
		contentPane.add(nombreCliente);
		
		JLabel apellidoCliente = new JLabel(cx.getApellidoP());
		apellidoCliente.setBounds(194, 20, 107, 20);
		contentPane.add(apellidoCliente);
	}
}
