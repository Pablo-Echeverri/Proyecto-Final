package logicaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 69, 230, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(28, 135, 230, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(28, 199, 230, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(28, 266, 230, 26);
		contentPane.add(textField_3);
		
		JLabel lblIndiqueSuNombre = new JLabel("Indique su NOMBRE:");
		lblIndiqueSuNombre.setBounds(28, 43, 184, 20);
		contentPane.add(lblIndiqueSuNombre);
		
		JLabel lblIndiqueSuApellido = new JLabel("Indique su APELLIDO");
		lblIndiqueSuApellido.setBounds(28, 111, 184, 20);
		contentPane.add(lblIndiqueSuApellido);
		
		JLabel lblIndiqueSuEdad = new JLabel("Indique su EDAD:");
		lblIndiqueSuEdad.setBounds(28, 177, 184, 20);
		contentPane.add(lblIndiqueSuEdad);
		
		JLabel lblIndiqueUnNmero = new JLabel("Indique un N\u00DAMERO DE CONTACTO:");
		lblIndiqueUnNmero.setBounds(28, 241, 303, 20);
		contentPane.add(lblIndiqueUnNmero);
		
		JLabel lblIndiqueSuNombre_2 = new JLabel("Indique su NOMBRE DE USUARIO:");
		lblIndiqueSuNombre_2.setBounds(28, 321, 324, 20);
		contentPane.add(lblIndiqueSuNombre_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(28, 346, 230, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(28, 406, 230, 26);
		contentPane.add(textField_5);
		
		JLabel lblIndiqueSuNombre_2_1 = new JLabel("Indique su CONTRASE\u00D1A:");
		lblIndiqueSuNombre_2_1.setBounds(28, 380, 324, 20);
		contentPane.add(lblIndiqueSuNombre_2_1);
		
		JButton btnTerminarRegistro = new JButton("Terminar Registro");
		btnTerminarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaDeInicio vT = new VentanaDeInicio();
				vT.setVisible(true);
				VentanaRegistro.this.setVisible(false);	
			}
		});
		btnTerminarRegistro.setBounds(66, 448, 176, 29);
		contentPane.add(btnTerminarRegistro);
	}

}
