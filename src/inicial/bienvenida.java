package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class bienvenida extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bienvenida frame = new bienvenida();
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
	public bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO.");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(45, 11, 293, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(259, 69, 95, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(26, 61, 223, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(26, 143, 223, 48);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Efectivo.");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(259, 151, 73, 27);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(98, 251, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnContinuar = new JButton("Aceptar");
		btnContinuar.setBounds(244, 251, 89, 23);
		contentPane.add(btnContinuar);
		
		JLabel lblfondobienvenida = new JLabel("New label");
		lblfondobienvenida.setIcon(new ImageIcon("C:\\Users\\Erick\\Pictures\\PPP.PNG"));
		lblfondobienvenida.setBounds(0, 0, 409, 285);
		contentPane.add(lblfondobienvenida);
	}
}
