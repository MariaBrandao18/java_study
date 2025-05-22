package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	
	private Integer num1;
	private Integer num2;
	private String operador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4));
		
		btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("7");
					num1 = 7;
				} else {
					textField.setText("7");
					num2 = 7;
				}
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("8");
					num1 = 8;
				} else {
					textField.setText("8");
					num2 = 8;
				}
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("9");
					num1 = 9;
				} else {
					textField.setText("9");
					num2 = 9;
				}
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("/");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "/";
			}
		});
		panel.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("4");
					num1 = 4;
				} else {
					textField.setText("4");
					num2 = 4;
				}
			}
		});
		panel.add(btnNewButton_6);
		
		btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("5");
					num1 = 5;
				} else {
					textField.setText("5");
					num2 = 5;
				}
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("6");
					num1 = 6;
				} else {
					textField.setText("6");
					num2 = 6;
				}
			}
		});
		panel.add(btnNewButton_5);
		
		btnNewButton_9 = new JButton("*");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "*";
			}
		});
		panel.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("1");
					num1 = 1;
				} else {
					textField.setText("1");
					num2 = 1;
				}
			}
		});
		panel.add(btnNewButton_8);
		
		btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("2");
					num1 = 2;
				} else {
					textField.setText("2");
					num2 = 2;
				}
			}
		});
		panel.add(btnNewButton_7);
		
		btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("3");
					num1 = 3;
				} else {
					textField.setText("3");
					num2 = 3;
				}
			}
		});
		panel.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "-";
			}
		});
		panel.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1 == null) {
					textField.setText("0");
					num1 = 0;
				} else {
					textField.setText("0");
					num2 = 0;
				}
			}
		});
		panel.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(operador) {
				case "+":
					textField.setText(num1+num2 + "");
					break;
				case "-":
					textField.setText(num1-num2 + "");
					break;
				case "*":
					textField.setText(num1*num2 + "");
					break;
				case "/":
					textField.setText(num1/num2 + "");
					break;
				}
			}
		});
		panel.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("C");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				num1 = null;
				num2 = null;
				operador = " ";
			}
		});
		panel.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "+";
			}
		});
		panel.add(btnNewButton_15);
	}

}
