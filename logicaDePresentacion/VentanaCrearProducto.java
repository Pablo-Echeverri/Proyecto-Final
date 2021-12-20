package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logicaDeDatos.Producto;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCrearProducto extends JFrame {

	private JPanel contentPane;
	private JTextField nombreP;
	private JTextField tipoP;
	private JTextField numeroP;
	private JTextField precioP;
	private JTextField cantidadP;

	/**
	 * Create the frame.
	 */
	public VentanaCrearProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDelProducto = new JLabel("Nombre del producto:");
		lblNombreDelProducto.setBounds(15, 27, 197, 20);
		contentPane.add(lblNombreDelProducto);
		
		nombreP = new JTextField();
		nombreP.setBounds(15, 51, 146, 26);
		contentPane.add(nombreP);
		nombreP.setColumns(10);
		
		JLabel lblTipoDelProducto = new JLabel("Tipo del producto:");
		lblTipoDelProducto.setBounds(15, 93, 197, 20);
		contentPane.add(lblTipoDelProducto);
		
		tipoP = new JTextField();
		tipoP.setColumns(10);
		tipoP.setBounds(15, 115, 146, 26);
		contentPane.add(tipoP);
		
		numeroP = new JTextField();
		numeroP.setBounds(15, 206, 146, 26);
		contentPane.add(numeroP);
		numeroP.setColumns(10);
		
		JLabel lblNmeroDeIngredientes = new JLabel("N\u00FAmero de ingredientes");
		lblNmeroDeIngredientes.setBounds(15, 157, 364, 20);
		contentPane.add(lblNmeroDeIngredientes);
		
		JLabel lblindicarSoloEl = new JLabel("(indicar solo el n\u00FAmero):");
		lblindicarSoloEl.setBounds(15, 180, 364, 20);
		contentPane.add(lblindicarSoloEl);
		
		precioP = new JTextField();
		precioP.setColumns(10);
		precioP.setBounds(15, 281, 146, 26);
		contentPane.add(precioP);
		
		JLabel lblPrecioIndicadoAl = new JLabel("Precio indicado al producto:");
		lblPrecioIndicadoAl.setBounds(15, 259, 237, 20);
		contentPane.add(lblPrecioIndicadoAl);
		
		cantidadP = new JTextField();
		cantidadP.setColumns(10);
		cantidadP.setBounds(15, 357, 146, 26);
		contentPane.add(cantidadP);
		
		JLabel lblCantidadDisponibleDel = new JLabel("Cantidad disponible del producto:");
		lblCantidadDisponibleDel.setBounds(15, 334, 268, 20);
		contentPane.add(lblCantidadDisponibleDel);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Producto px = new Producto(nombreP, tipoP, 0, numeroP, precioP, cantidadP);
//				TiendaDb.insertarDatosProducto(px);
				VentanaEntrada vE = new VentanaEntrada();
				vE.setVisible(true);
				VentanaCrearProducto.this.setVisible(false);
			}
		});
		btnCrear.setBounds(15, 430, 115, 29);
		contentPane.add(btnCrear);
		
	}
}
