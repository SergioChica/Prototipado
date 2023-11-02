package Ejercicio3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaEjercicio3 extends JFrame implements KeyListener,ActionListener{

	private JPanel JPanel;
	private JTextField txtTexto;
	private JLabel etiTexto;
	private JButton btnVaciar;

	public VentanaEjercicio3() {
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
		txtTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTexto.setBounds(94, 176, 206, 32);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		JPanel.add(txtTexto);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiTexto.setBounds(94, 79, 206, 39);
		JPanel.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVaciar.setBounds(94, 291, 214, 39);
		btnVaciar.addActionListener(this);
		JPanel.add(btnVaciar);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()== btnVaciar) {
			etiTexto.setText("");
			txtTexto.setText("");
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==txtTexto) {
			etiTexto.setText(txtTexto.getText());
		} 
	}
}
