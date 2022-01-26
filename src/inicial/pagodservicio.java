package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class pagodservicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagodservicio frame = new pagodservicio();
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
	public pagodservicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPservicio = new JLabel("Ingrese una opcion a continuacion....");
		lblPservicio.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPservicio.setForeground(Color.BLACK);
		lblPservicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPservicio.setBounds(28, 11, 379, 33);
		contentPane.add(lblPservicio);
		
		JButton btnPluz = new JButton("Pago de luz ");
		btnPluz.setBounds(72, 55, 124, 69);
		contentPane.add(btnPluz);
		
		JButton btnPagua = new JButton("Pago de agua ");
		btnPagua.setBounds(233, 55, 124, 69);
		contentPane.add(btnPagua);
		
		JButton btnPpredio = new JButton("Pago de predio");
		btnPpredio.setBounds(72, 138, 124, 69);
		contentPane.add(btnPpredio);
		
		JButton btnPtelefone = new JButton("Pago de telefono");
		btnPtelefone.setBounds(233, 138, 124, 69);
		contentPane.add(btnPtelefone);
		
		JLabel lblfondo = new JLabel("New label");
		lblfondo.setIcon(new ImageIcon("C:\\Users\\Erick\\Pictures\\PPP.PNG"));
		lblfondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblfondo);
	}

}
