package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import modelo.Genero;
import modelo.Persona;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AgendaVista extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Persona> modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaVista frame = new AgendaVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public AgendaVista() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnNuevo = new JButton("Nuevo");
		panelBotones.add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		panelBotones.add(btnAgregar);
		
		JButton btnEditar = new JButton("Editar");
		panelBotones.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panelBotones.add(btnEliminar);
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));
		
		PersonaPanel personaPanel = new PersonaPanel();
		panelPrincipal.add(personaPanel);
		
		JPanel panelResultados = new JPanel();
		panelResultados.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 5, true), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPrincipal.add(panelResultados);
		panelResultados.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelResultados.add(scrollPane, BorderLayout.CENTER);
		
		JList listaResultados = new JList();
		scrollPane.setViewportView(listaResultados);
		
		modelo=new DefaultListModel<Persona>();
		listaResultados.setModel(modelo);
		
		Persona p=new Persona("Juan", 23, "12123","12321",Genero.MASCULINO);
		Persona p2=new Persona("Maria", 23, "12123","12321",Genero.MASCULINO);
		Persona p3=new Persona("Pedro", 23, "12123","12321",Genero.MASCULINO);
		
		modelo.addElement(p);
		modelo.addElement(p2);
		modelo.addElement(p3);
	
		
	}

}
