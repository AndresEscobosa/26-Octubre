package vista;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelPresentacion extends JPanel{
	public PanelPresentacion() {
		setBackground(new Color(135, 206, 250));
		setLayout(new BorderLayout(0, 0));
		
		String mensaje="<html><center><h2>Universidad Aut\u00F3noma <br> de Baja California";
		
		JLabel lblUABC = new JLabel(mensaje);
		lblUABC.setForeground(new Color(255, 215, 0));
		lblUABC.setIcon(new ImageIcon(PanelPresentacion.class.getResource("/img/uabc.png")));
		add(lblUABC, BorderLayout.CENTER);
		
		lblUABC.setHorizontalAlignment(SwingConstants.CENTER);
		lblUABC.setVerticalAlignment(SwingConstants.CENTER);
		
		lblUABC.setHorizontalTextPosition(SwingConstants.CENTER);
		lblUABC.setVerticalTextPosition(SwingConstants.BOTTOM);

	}
	
	

}
