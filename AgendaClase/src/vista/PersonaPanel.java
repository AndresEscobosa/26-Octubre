package vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

public class PersonaPanel extends JPanel{
	private JTextField txtNombre;
	private JFormattedTextField txtTelefono;
	
	public PersonaPanel() throws ParseException {
		setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 5, true), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre:");
		add(lblNombre);
		
		txtNombre = new JTextField();
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		add(lblEdad);
		
		
		NumberFormat formatoNumero=NumberFormat.getIntegerInstance();
		formatoNumero.setMinimumIntegerDigits(1);
		formatoNumero.setMaximumIntegerDigits(3);
		
		//MaskFormatter formatoNumero=new MaskFormatter("###");
		JFormattedTextField txtEdad = new JFormattedTextField(formatoNumero);
		add(txtEdad);
		
		JLabel lblGenero = new JLabel("Genero:");
		add(lblGenero);
		
		JPanel panelGenero = new JPanel();
		add(panelGenero);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		panelGenero.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		panelGenero.add(rdbtnFemenino);
		
		ButtonGroup grupoGenero=new ButtonGroup();
		grupoGenero.add(rdbtnFemenino);
		grupoGenero.add(rdbtnMasculino);
		
		
		JLabel lblTelefono = new JLabel("Telefono:");
		add(lblTelefono);
		
		MaskFormatter telefonoFormato=new MaskFormatter("(###)###-####");
		txtTelefono = new JFormattedTextField(telefonoFormato);
		add(txtTelefono);
		
		JLabel lblCorreo = new JLabel("Correo:");
		add(lblCorreo);
		
		JFormattedTextField txtCorreo = new JFormattedTextField();
		add(txtCorreo);
		
	}

}
