package Ejercicio4;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaEjercicio4 extends JFrame implements ActionListener{

	private JPanel JPanel;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnActivar,btnDesactivar,btnAceptar;
	private JLabel textFrase;

	public VentanaEjercicio4() {
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
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombre.setBounds(38, 54, 124, 35);
		JPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCiudad.setBounds(245, 54, 124, 35);
		JPanel.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(38, 249, 124, 35);
		btnActivar.addActionListener(this);
		JPanel.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(245, 249, 124, 35);
		btnDesactivar.addActionListener(this);
		JPanel.add(btnDesactivar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(138, 311, 124, 35);
		btnAceptar.addActionListener(this);
		JPanel.add(btnAceptar);
		
		textFrase = new JLabel("");
		textFrase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFrase.setBounds(38, 125, 331, 53);
		JPanel.add(textFrase);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnAceptar) {
			textFrase.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText());
		}
		
		if (e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}else if (e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
	}
}
