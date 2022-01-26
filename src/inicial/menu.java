package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese una opcion a continuacion...");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setBounds(21, -2, 381, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnretiro = new JButton("Retiro de efectivo");
		btnretiro.setBounds(63, 44, 128, 78);
		contentPane.add(btnretiro);
		
		JButton btnCsaldo = new JButton("Consulta de saldo");
		btnCsaldo.setBounds(213, 44, 128, 78);
		contentPane.add(btnCsaldo);
		
		JButton btnPtarjeta = new JButton("Pago de tarjeta");
		btnPtarjeta.setBounds(63, 152, 128, 78);
		contentPane.add(btnPtarjeta);
		
		JButton btnPservicio = new JButton("Pago de servicio");
		btnPservicio.setBounds(213, 152, 128, 78);
		contentPane.add(btnPservicio);
		
		JLabel lblfondomenu = new JLabel("New label");
		lblfondomenu.setIcon(new ImageIcon("C:\\Users\\Erick\\Pictures\\PPP.PNG"));
		lblfondomenu.setBounds(0, -2, 434, 263);
		contentPane.add(lblfondomenu);
	}

}
