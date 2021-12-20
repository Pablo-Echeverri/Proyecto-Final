package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VentanaCompra(String nombre, String tipo, int codigoP, int numIngre, int precio, int cantidad) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 40, 86, 20);
		contentPane.add(lblNombre);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(15, 72, 86, 20);
		contentPane.add(lblTipo);
		
		JLabel nombreP = new JLabel(nombre);
		nombreP.setBounds(227, 40, 138, 20);
		contentPane.add(nombreP);
		
		JLabel tipoP = new JLabel(tipo);
		tipoP.setBounds(227, 72, 138, 20);
		contentPane.add(tipoP);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaCompra.this, "Gracias por la compra");
				VentanaTienda vT = new VentanaTienda();
				vT.setVisible(true);
				VentanaCompra.this.setVisible(false);
			}
		});
		btnComprar.setBounds(15, 131, 115, 29);
		contentPane.add(btnComprar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTienda vT = new VentanaTienda();
				vT.setVisible(true);
				VentanaCompra.this.setVisible(false);
			}
		});
		btnVolver.setBounds(250, 131, 115, 29);
		contentPane.add(btnVolver);
	
	
	}

}
