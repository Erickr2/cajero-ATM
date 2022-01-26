package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class retirodefe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					retirodefe frame = new retirodefe();
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
	public retirodefe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltxtefe = new JLabel("Eliga la opcion deseada...");
		lbltxtefe.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lbltxtefe.setHorizontalAlignment(SwingConstants.CENTER);
		lbltxtefe.setBounds(53, 11, 296, 23);
		contentPane.add(lbltxtefe);
		
		JCheckBox checkBox = new JCheckBox("$100");
		checkBox.setBounds(24, 53, 97, 23);
		contentPane.add(checkBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("$500");
		chckbxNewCheckBox.setBounds(24, 105, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("$1500");
		chckbxNewCheckBox_1.setBounds(24, 159, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("$200");
		chckbxNewCheckBox_2.setBounds(284, 53, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("$1000");
		chckbxNewCheckBox_3.setBounds(284, 105, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Otra cantidad");
		chckbxNewCheckBox_4.setBounds(284, 159, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(101, 216, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setBounds(231, 216, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblRetiroEfe = new JLabel("New label");
		lblRetiroEfe.setIcon(new ImageIcon("C:\\Users\\Erick\\Pictures\\PPP.PNG"));
		lblRetiroEfe.setBounds(0, 0, 416, 261);
		contentPane.add(lblRetiroEfe);
	}
}
