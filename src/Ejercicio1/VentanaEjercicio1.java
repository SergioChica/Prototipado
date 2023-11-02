package Ejercicio1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaEjercicio1 extends JFrame implements ActionListener{

	private JPanel JPanel;
	private JLabel etiNombre,etiCiudad;
	private JButton btnOcultarNombre,btnVisualizarNombre,btnOcultarCiudad,btnVisualizarCiudad;

	public VentanaEjercicio1() {
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
		
		etiNombre = new JLabel("Sergio");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiNombre.setBounds(50, 31, 117, 50);
		JPanel.add(etiNombre);
		
		etiCiudad = new JLabel("Armenia");
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiCiudad.setBounds(258, 31, 117, 50);
		JPanel.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(50, 144, 117, 23);
		btnOcultarNombre.addActionListener(this);
		JPanel.add(btnOcultarNombre);
		
		btnVisualizarNombre = new JButton("Visualizar Nombre");
		btnVisualizarNombre.setBounds(50, 207, 117, 23);
		btnVisualizarNombre.addActionListener(this);
		JPanel.add(btnVisualizarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(258, 144, 117, 23);
		btnOcultarCiudad.addActionListener(this);
		JPanel.add(btnOcultarCiudad);
		
		btnVisualizarCiudad = new JButton("Visualizar Ciudad");
		btnVisualizarCiudad.setBounds(258, 207, 117, 23);
		btnVisualizarCiudad.addActionListener(this);
		JPanel.add(btnVisualizarCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Acciones para nombre
		if (e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);
		}else if (e.getSource()==btnVisualizarNombre) {
			etiNombre.setVisible(true);
		}
		
		//Acciones para ciudad
		if (e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}else if (e.getSource()==btnVisualizarCiudad) {
			etiCiudad.setVisible(true);
		}
	}
}
