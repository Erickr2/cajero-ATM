package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class descripciondpago extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descripciondpago frame = new descripciondpago();
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
	public descripciondpago() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripsion de pago...");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 0, 358, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(23, 36, 170, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 87, 170, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(23, 150, 170, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Canccelar");
		btnNewButton.setBounds(116, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setBounds(228, 209, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Cuentabiente");
		lblNewLabel_1.setBounds(228, 41, 70, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Servicio");
		lblNewLabel_2.setBounds(228, 92, 70, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Monto a pagar");
		lblNewLabel_3.setBounds(228, 154, 70, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblfondoDpago = new JLabel("New label");
		lblfondoDpago.setIcon(new ImageIcon("C:\\Users\\Erick\\Pictures\\PPP.PNG"));
		lblfondoDpago.setBounds(0, 0, 415, 250);
		contentPane.add(lblfondoDpago);
	}

}
