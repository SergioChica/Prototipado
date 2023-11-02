package Ejercicio8;

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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaEjercicio8 extends JFrame implements ActionListener{
	private JPanel JPanel;
	private JTextField txtPrimerTrimestre;
	private JTextField textSegundoTrimestre;
	private JTextField textTercerTrimestre;
	private JButton btnCalcular;
	private JLabel etiResultado,etiNotaFinal;

	public VentanaEjercicio8() {
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

		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrimerTrimestre.setBounds(26, 27, 100, 41);
		JPanel.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		textSegundoTrimestre = new JTextField();
		textSegundoTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSegundoTrimestre.setColumns(10);
		textSegundoTrimestre.setBounds(156, 27, 100, 41);
		JPanel.add(textSegundoTrimestre);
		
		textTercerTrimestre = new JTextField();
		textTercerTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTercerTrimestre.setColumns(10);
		textTercerTrimestre.setBounds(287, 27, 100, 41);
		JPanel.add(textTercerTrimestre);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		etiNotaFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiNotaFinal.setBounds(92, 123, 244, 41);
		JPanel.add(etiNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiResultado.setBounds(92, 211, 244, 41);
		JPanel.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(167, 175, 89, 23);
		btnCalcular.addActionListener(this);
		JPanel.add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double n1 = Double.parseDouble(txtPrimerTrimestre.getText());
		double n2 = Double.parseDouble(textSegundoTrimestre.getText());
		double n3 = Double.parseDouble(textTercerTrimestre.getText());
		
		double div = (n1 + n2 + n3) / 3;
		
		if (e.getSource()==btnCalcular) {
			etiNotaFinal.setText("Su nota es de "+div);
		}
		
		if (e.getSource()==btnCalcular) {
			if (div >= 5) {
				etiResultado.setText("APROBADO");
			}else if (div < 5) {
				etiResultado.setText("REPOBADO");
				etiResultado.setForeground(Color.red);
				etiNotaFinal.setForeground(Color.red);
			}
		}
	}
}
