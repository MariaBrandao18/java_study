package teste;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkbox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valorDocumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox frame = new checkbox();
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
	public checkbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel documento = new JLabel("");
		
		JCheckBox estrangeiro = new JCheckBox("Estrangeiro");
		
		JCheckBox nacional = new JCheckBox("Nacional");
		nacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nacional.isSelected() == true) {
					estrangeiro.setSelected(false);
					documento.setText("CPF");
				}
			}
		});
		nacional.setBounds(30, 7, 97, 23);
		contentPane.add(nacional);

		estrangeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (estrangeiro.isSelected() == true) {
					nacional.setSelected(false);
					documento.setText("Passaporte");
				}
			}
		});
		estrangeiro.setBounds(280, 7, 97, 23);
		contentPane.add(estrangeiro);

		documento.setBounds(179, 63, 46, 14);
		contentPane.add(documento);
		
		valorDocumento = new JTextField();
		valorDocumento.setBounds(235, 60, 86, 20);
		contentPane.add(valorDocumento);
		valorDocumento.setColumns(10);
		
		ImageIcon iconReduzido = new ImageIcon("C:\\Users\\maria.r.brandao\\Downloads\\image-removebg-preview.png");
		Image imagemReduzida = iconReduzido.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		JButton enviar = new JButton("Enviar", imagemReduzida);
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = documento.getText();
				String valor = valorDocumento.getText();
				JOptionPane.showMessageDialog(null, label + " : " + valor);
			}
		});
		enviar.setBounds(136, 88, 89, 23);
		contentPane.add(enviar);
	}
}
