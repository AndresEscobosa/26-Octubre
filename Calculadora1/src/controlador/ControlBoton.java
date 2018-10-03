package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.Interfaz;

public class ControlBoton implements ActionListener{

	private Interfaz gui;
	
	public ControlBoton(Interfaz gui) {
		this.gui=gui;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando=e.getActionCommand();
		double res=0;
		switch(comando) {
			case "SUMAR":
				res=gui.getOperador1()+gui.getOperador2();
				break;
			case "RESTA":
				res=gui.getOperador1()-gui.getOperador2();
				break;
			case "MULTIPLICAR":
				res=gui.getOperador1()*gui.getOperador2();
				break;
			case "DIVIDIR":
				res=gui.getOperador1()/gui.getOperador2();
				break;
		}

		gui.setResultado(res);
		
	}

}
