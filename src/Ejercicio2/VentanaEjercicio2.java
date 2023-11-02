package Ejercicio2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaEjercicio2 extends JFrame implements ActionListener{

	private JPanel JPanel;
	private JTextField txtTexto;
	private JLabel etiTexto1,etiTexto2;
	private JButton btnTraspasa1,btnTraspasa2;

	public VentanaEjercicio2() {
		setBackground(SystemColor.desktop);
		setTitle("VENTANA OPERACIONES");
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		JPanel = new JPanel();
		JPanel.setBackground(new Color(147, 112, 219));
		JPanel.setForeground(new Color(147, 112, 219));
		JPanel.setBorder(null);

		setContentPane(JPanel);
		setLocationRelativeTo(null);
		JPanel.setLayout(null);
		
		iniciar();
	}

	private void iniciar() {
		// TODO Auto-generated method stub

		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTexto.setBounds(50, 31, 323, 37);
		txtTexto.setColumns(10);
		JPanel.add(txtTexto);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTraspasa1.setBounds(50, 113, 122, 23);
		btnTraspasa1.addActionListener(this);
		JPanel.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTraspasa2.setBounds(243, 115, 130, 23);
		btnTraspasa2.addActionListener(this);
		JPanel.add(btnTraspasa2);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiTexto1.setBounds(50, 260, 300, 37);
		JPanel.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiTexto2.setBounds(50, 332, 300, 37);
		JPanel.add(etiTexto2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnTraspasa1) {
			etiTexto1.setText("");
			etiTexto1.setText(txtTexto.getText());
		}else if (e.getSource()==btnTraspasa2) {
			etiTexto2.setText("");
			etiTexto2.setText(txtTexto.getText());
		}
	}
}
