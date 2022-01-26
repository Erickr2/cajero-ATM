package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

public class pagodtarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDeTajeta;
	private JTextField txtMontoA;
	private JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagodtarjeta frame = new pagodtarjeta();
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
	public pagodtarjeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 36, 235, 31);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrse los datos a continuacion...");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 11, 338, 14);
		contentPane.add(lblNewLabel);
		
		txtDeTajeta = new JTextField();
		txtDeTajeta.setBounds(10, 78, 235, 31);
		contentPane.add(txtDeTajeta);
		txtDeTajeta.setColumns(10);
		
		txtMontoA = new JTextField();
		txtMontoA.setBounds(10, 120, 235, 28);
		contentPane.add(txtMontoA);
		txtMontoA.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setBounds(10, 159, 294, 31);
		contentPane.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(116, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setBounds(215, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de tarjeta ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(278, 82, 109, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(278, 40, 58, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Monto a pagar ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(278, 123, 96, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contrase\u00F1a");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(328, 163, 72, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblfondoPtarjeta = new JLabel("New label");
		lblfondoPtarjeta.setIcon(new ImageIcon("C:\\Users\\Erick\\Pictures\\PPP.PNG"));
		lblfondoPtarjeta.setBounds(0, 0, 434, 261);
		contentPane.add(lblfondoPtarjeta);
	}
}
