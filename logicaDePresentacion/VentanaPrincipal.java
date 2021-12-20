package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(VentanaPrincipal.this, "Está saliendo de la aplicación");
				System.exit(0);
			}
		});
		btnSalir.setBounds(101, 224, 115, 29);
		contentPane.add(btnSalir);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBienvenido.setBounds(81, 45, 153, 55);
		contentPane.add(lblBienvenido);
		
		JLabel lblQueTipo = new JLabel("\u00BF Que tipo de usuario es usted ?");
		lblQueTipo.setBounds(40, 98, 237, 20);
		contentPane.add(lblQueTipo);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDeInicio vI = new VentanaDeInicio();
				vI.setVisible(true);
				VentanaPrincipal.this.setVisible(false);
			}
		});
		btnCliente.setBounds(81, 134, 153, 29);
		contentPane.add(btnCliente);
		
		JButton btnCliente_1 = new JButton("Administrador");
		btnCliente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEntrada vE = new VentanaEntrada();
				vE.setVisible(true);
				VentanaPrincipal.this.setVisible(false);
			}
		});
		btnCliente_1.setBounds(81, 179, 153, 29);
		contentPane.add(btnCliente_1);
	}
}
