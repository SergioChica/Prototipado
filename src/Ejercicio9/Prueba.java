package Ejercicio9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class Prueba extends JFrame {

	private JPanel contentPane;
	private JTextField txtDasdasd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setBounds(194, 10, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtDasdasd = new JTextField();
		txtDasdasd.setForeground(Color.RED);
		txtDasdasd.setText("dasdasd");
		txtDasdasd.setBackground(Color.GREEN);
		txtDasdasd.setBounds(148, 127, 86, 20);
		contentPane.add(txtDasdasd);
		txtDasdasd.setColumns(10);
	}
}
