package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControlBoton;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame  implements Interfaz{

	private JPanel contentPane;
	private JTextField txtOperador1;
	private JTextField txtOperador2;
	private JTextField txtResultado;
	private JButton btnSuma;
	private JButton btnResta; 
	private JButton btnMultiplicar; 
	private JButton btnDividir;

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
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		btnSuma = new JButton("Suma");
	
		/*
		btnSuma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double operador1=Double.parseDouble(txtOperador1.getText());
				double operador2=Double.parseDouble(txtOperador2.getText());
				double resultado=operador1+operador2;
				txtResultado.setText(String.valueOf(resultado));
				
			}
		});
		*/
		
		
		panelBotones.add(btnSuma);
		
		btnResta = new JButton("Resta");
		panelBotones.add(btnResta);
		
		btnMultiplicar = new JButton("Multiplicar");
		panelBotones.add(btnMultiplicar);
		
		btnDividir = new JButton("Dividir");
		panelBotones.add(btnDividir);
		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new BoxLayout(panelDatos, BoxLayout.Y_AXIS));
		
		JLabel lblOperador = new JLabel("Operador 1:");
		panelDatos.add(lblOperador);
		
		txtOperador1 = new JTextField();
		txtOperador1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperador1.setForeground(Color.BLUE);
		txtOperador1.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		panelDatos.add(txtOperador1);
		txtOperador1.setColumns(10);
		
		JLabel lblOperador_1 = new JLabel("Operador 2:");
		panelDatos.add(lblOperador_1);
		
		txtOperador2 = new JTextField();
		txtOperador2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperador2.setForeground(Color.BLUE);
		txtOperador2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		panelDatos.add(txtOperador2);
		txtOperador2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		panelDatos.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setForeground(Color.RED);
		txtResultado.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		panelDatos.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnSuma.setActionCommand("SUMAR");
		btnResta.setActionCommand("RESTA");
		btnMultiplicar.setActionCommand("MULTIPLICAR");
		btnDividir.setActionCommand("DIVIDIR");
		
		ControlBoton control=new ControlBoton(this);
		btnSuma.addActionListener(control);
		btnResta.addActionListener(control);
		btnMultiplicar.addActionListener(control);
		btnDividir.addActionListener(control);
		
	}

	@Override
	public double getOperador1() {
		// TODO Auto-generated method stub
		return Double.parseDouble(txtOperador1.getText());
	}

	@Override
	public double getOperador2() {
		// TODO Auto-generated method stub
		return Double.parseDouble(txtOperador2.getText());
	}

	@Override
	public void setResultado(double res) {
		// TODO Auto-generated method stub
		txtResultado.setText(String.valueOf(res));
		
	}


}
