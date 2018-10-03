package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Calculadora;
import modelo.Operador;
import vistas.Interfaz;

public class ControlBoton implements ActionListener{

	private Interfaz gui;
	private modelo.Calculadora modelo;
	
	public ControlBoton(Interfaz gui) {
		this.gui=gui;
		this.modelo=new Calculadora();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando=e.getActionCommand();
		modelo.setOpe(Operador.valueOf(comando));
		gui.setResultado(modelo.operacion(gui.getOperador1(), gui.getOperador2()));
		
	}

}
