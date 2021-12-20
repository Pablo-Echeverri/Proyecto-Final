package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import logicaDeDatos.Cliente;
import logicaDeDatos.Producto;

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
					
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 421);
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
		button.setBounds(554, 16, 115, 29);
		contentPane.add(button);
		
		JLabel label = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(0, 61, 717, 20);
		contentPane.add(label);
		
		JLabel lblorden1_2_1_1 = new JLabel("BIENVENIDO:");
		lblorden1_2_1_1.setBounds(15, 20, 115, 20);
		contentPane.add(lblorden1_2_1_1);
		
		JLabel nombreCliente = new JLabel(usuario);
		nombreCliente.setBounds(127, 20, 107, 20);
		contentPane.add(nombreCliente);
		
		JButton btnNewButton = new JButton("Luneta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p1 = new Producto("Luneta", "dulce", 1, 5, 4, 50);
				VentanaCompra vC = new VentanaCompra("Luneta", "dulce", 1, 5, 4, 50);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(15, 119, 203, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Dulce");
		lblNewLabel.setBounds(96, 91, 69, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnPiruletaDeBubulubu = new JButton("Piruleta de Bubulubu");
		btnPiruletaDeBubulubu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p2 = new Producto("Piruleta de Bubulubu", "dulce", 2, 7, 5, 150);
				VentanaCompra vC = new VentanaCompra("Piruleta de Bubulubu", "dulce", 2, 7, 5, 150);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnPiruletaDeBubulubu.setBounds(15, 151, 203, 29);
		contentPane.add(btnPiruletaDeBubulubu);
		
		JButton btnBombonesDeChocolate = new JButton("Bombones de Chocolate");
		btnBombonesDeChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p3 = new Producto("Bombones de Chocolate", "dulce", 3, 5, 8, 23);
				VentanaCompra vC = new VentanaCompra("Bombones de Chocolate", "dulce", 3, 5, 8, 23);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnBombonesDeChocolate.setBounds(15, 185, 203, 29);
		contentPane.add(btnBombonesDeChocolate);
		
		JButton btnChicleBola = new JButton("Chicle Bola");
		btnChicleBola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p4 = new Producto("Chicle Bola", "dulce", 4, 6, 3, 56);
				VentanaCompra vC = new VentanaCompra("Chicle Bola", "dulce", 4, 6, 3, 56);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnChicleBola.setBounds(15, 215, 203, 29);
		contentPane.add(btnChicleBola);
		
		JButton btnPiruletaDeCaramelo = new JButton("Piruleta de Caramelo");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p5 = new Producto("Piruleta de Caramelo", "dulce", 5, 3, 5, 87);
				VentanaCompra vC = new VentanaCompra("Piruleta de Caramelo", "dulce", 5, 3, 5, 87);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnPiruletaDeCaramelo.setBounds(15, 246, 203, 29);
		contentPane.add(btnPiruletaDeCaramelo);
		
		JButton btnHuevoDeChocolate = new JButton("Huevo de Chocolate");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p6 = new Producto("Huevo de Chocolate", "dulce", 6, 2, 9, 35);
				VentanaCompra vC = new VentanaCompra("Huevo de Chocolate", "dulce", 6, 2, 9, 35);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnHuevoDeChocolate.setBounds(15, 280, 203, 29);
		contentPane.add(btnHuevoDeChocolate);
		
		JLabel lblChile = new JLabel("Chile");
		lblChile.setBounds(316, 91, 69, 20);
		contentPane.add(lblChile);
		
		JButton btnPelon = new JButton("Pelon");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p7 = new Producto("Pelon", "Chile", 7, 6, 10, 12);
				VentanaCompra vC = new VentanaCompra("Pelon", "Chile", 7, 6, 10, 12);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnPelon.setBounds(235, 119, 203, 29);
		contentPane.add(btnPelon);
		
		JButton btnNewButton_1_1 = new JButton("Fritos");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p8 = new Producto("Fritos", "Salado", 12, 5, 5, 11);
				VentanaCompra vC = new VentanaCompra("Fritos", "Salado", 12, 5, 5, 11);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnNewButton_1_1.setBounds(453, 119, 203, 29);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Salado");
		lblNewLabel_1_1.setBounds(528, 91, 69, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnMiguelito = new JButton("Miguelito");
		btnMiguelito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p9 = new Producto("Miguelito", "Chile", 8, 7, 12, 10);
				VentanaCompra vC = new VentanaCompra("Miguelito", "Chile", 8, 7, 12, 10);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnMiguelito.setBounds(233, 151, 203, 29);
		contentPane.add(btnMiguelito);
		
		JButton btnTotisEnchilado = new JButton("Totis Enchilado");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p10 = new Producto("Totis Enchilado", "Chile", 9, 7, 7, 50);
				VentanaCompra vC = new VentanaCompra("Totis Enchilado", "Chile", 9, 7, 7, 50);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnTotisEnchilado.setBounds(235, 185, 203, 29);
		contentPane.add(btnTotisEnchilado);
		
		JButton btnMiguelitoEnPolvo = new JButton("Miguelito En Polvo");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p11 = new Producto("Miguelito En Polvo", "Chile", 10, 3, 15, 65);
				VentanaCompra vC = new VentanaCompra("Miguelito En Polvo", "Chile", 10, 3, 15, 65);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnMiguelitoEnPolvo.setBounds(233, 215, 203, 29);
		contentPane.add(btnMiguelitoEnPolvo);
		
		JButton btnTarugos = new JButton("Tarugos");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p12 = new Producto("Tarugos", "Chile", 11, 4, 8, 23);
				VentanaCompra vC = new VentanaCompra("Tarugos", "Chile", 11, 4, 8, 23);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnTarugos.setBounds(233, 246, 203, 29);
		contentPane.add(btnTarugos);
		
		JButton btnNewButton_1_1_1 = new JButton("Palomitas");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p13 = new Producto("Palomitas", "Salado", 13, 6, 5, 24);
				VentanaCompra vC = new VentanaCompra("Palomitas", "Salado", 13, 6, 5, 24);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnNewButton_1_1_1.setBounds(453, 151, 203, 29);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Nachos");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p14 = new Producto("Nachos", "Salado", 14, 3, 7, 65);
				VentanaCompra vC = new VentanaCompra("Nachos", "Salado", 14, 3, 7, 65);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnNewButton_1_1_2.setBounds(453, 185, 203, 29);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("Chetos");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p15 = new Producto("Chetos", "Salado", 15, 3, 8, 200);
				VentanaCompra vC = new VentanaCompra("Chetos", "Salado", 15, 3, 8, 200);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnNewButton_1_1_3.setBounds(453, 215, 203, 29);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("Cacahuate Salado");
		btnPiruletaDeCaramelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p16 = new Producto("Cacahuate Salado", "Salado", 16, 5, 15, 200);
				VentanaCompra vC = new VentanaCompra("Cacahuate Salado", "Salado", 16, 5, 15, 200);
				vC.setVisible(true);
				VentanaTienda.this.setVisible(false);
			}
		});
		btnNewButton_1_1_4.setBounds(453, 246, 203, 29);
		contentPane.add(btnNewButton_1_1_4);
	}

	public VentanaTienda() {
		// TODO Auto-generated constructor stub
	}
}
