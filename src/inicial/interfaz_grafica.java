package inicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class interfaz_grafica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String memoria1;
	String memoria2;
	String signo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_grafica frame = new interfaz_grafica();
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
	public interfaz_grafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 119, 43, 35);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(75, 119, 43, 35);
		contentPane.add(btn2);
        btn2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent f) {
				textField.setText(textField.getText()+"2");
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(138, 119, 43, 35);
		contentPane.add(btn3);
        btn3.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent g) {
				textField.setText(textField.getText()+"3");
			}
		});
		
		JButton btnMas = new JButton("+");
		btnMas.setBounds(191, 119, 43, 35);
		contentPane.add(btnMas);
        btnMas.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent h) {
				if(!textField.getText().equals("")) {
					memoria1 = textField.getText();
					signo = "+";
					textField.setText("");
					
				}
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 169, 43, 35);
		contentPane.add(btn4);
        btn4.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent i) {
				textField.setText(textField.getText()+"4");
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 215, 43, 35);
		contentPane.add(btn7);
        btn7.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent j) {
				textField.setText(textField.getText()+"7");
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 265, 43, 35);
		contentPane.add(btn0);
        btn0.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent k) {
				textField.setText(textField.getText()+"0");
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(75, 169, 43, 35);
		contentPane.add(btn5);
        btn5.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent l) {
				textField.setText(textField.getText()+"5");
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(75, 215, 43, 35);
		contentPane.add(btn8);
        btn8.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent m) {
				textField.setText(textField.getText()+"8");
			}
		});
		
		JButton btnpunto = new JButton(".");
		btnpunto.setBounds(75, 265, 43, 35);
		contentPane.add(btnpunto);
        btnpunto.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent n) {
				textField.setText(textField.getText()+".");
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(138, 169, 43, 35);
		contentPane.add(btn6);
        btn6.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent o) {
				textField.setText(textField.getText()+"6");
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(138, 215, 43, 35);
		contentPane.add(btn9);
        btn1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent p) {
				textField.setText(textField.getText()+"9");
			}
		});
		
		JButton btnigual = new JButton("=");
		btnigual.setBounds(138, 265, 43, 35);
		contentPane.add(btnigual);
        btnigual.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent q) {
				String resultado;
				memoria2=textField.getText();
				if(!memoria2.equals("")) {
					resultado= calcu(memoria1,memoria2,signo);
					textField.setText(resultado);
				}
			}
		});
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBounds(191, 169, 43, 35);
		contentPane.add(btnMenos);
        btnMenos.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent r) {
				if(!textField.getText().equals("")) {
					memoria1 = textField.getText();
					signo = "-";
					
					
				}
			}
		});
		
		JButton btnPor = new JButton("x");
		btnPor.setBounds(191, 215, 43, 35);
		contentPane.add(btnPor);
        btnPor.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent s) {
				if(!textField.getText().equals("")) {
					memoria1 = textField.getText();
					signo = "x";
					textField.setText("");
					
				}
			}
		});
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(191, 265, 43, 35);
		contentPane.add(btnDiv);
        btnDiv.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent t) {
				if(!textField.getText().equals("")) {
					memoria1 = textField.getText();
					signo = "/";
					textField.setText("");
					
				}
			}
		});
        
        JButton btnCE = new JButton("CE");
		btnCE.setBounds(244, 119, 54, 181);
		contentPane.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent u) {
					if(!textField.getText().equals("")) {
						memoria1 = textField.getText();
						textField.setText("");
						
					}
				}
			});
		
		
		textField = new JTextField(200);
		textField.setBounds(10, 31, 306, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
	
	public static String calcu(String memoria1,String memoria2,String signo) {
		Double resultado =0.0;
		String iguala=null;
		
		if(signo.equals("+")) {
			resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
			
		}
		
		if(signo.equals("-")) {
			resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
			
		}
		
		if(signo.equals("x")) {
			resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
			
		}
		
		if(signo.equals("/")) {
			resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
			
		}
		
		
		
		iguala = resultado.toString();
		return iguala;
		
	}
}
