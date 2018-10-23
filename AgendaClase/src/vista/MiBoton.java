package vista;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

import javax.swing.ButtonModel;
import javax.swing.JButton;

// CLASE PARA CREAR UN BOTON MODIFICADO.
// NOTA: SI SE NECESITA DIBUJAR UN BOTON CON IMAGENES PODRIAN MODIFICAR
// EL METODO PAINTCOMPONENT DE ESTA CLASE. CON g.drawImage()
public class MiBoton extends JButton {
	
	private String texto; // TEXTO DEL BOTON
	
	//CONSTRUCTOR
	public MiBoton(String texto) {
		//METODO PARA INDICAR SI EL AREA DEL BOTON NECESITA SER PINTADO
		setContentAreaFilled(false);
		// SE PONE EN FALSE PARA QUE EL BOTON SEA TRANSPARENTE
		setOpaque(false);
		//METODO PARA INDICAR SI EL BORDE DEL BOTON NECESITA SER PINTADO
		setBorderPainted(false);
		//ACTIVAR LA ACCION ROLLOVER DEL BOTON(SABER SI EL MOUSE ESTA ENCIMA DE EL O NO)
		setRolloverEnabled(true);
		//INICIALIZAMOS EL TEXO DEL BOTON
		this.texto=texto;
	}
	
	/*
	 * TODOS LOS COMPONENTES SWING TIENEN UN METODO paintComponent.
	 * ESTE METODO SE USA PARA PINTAR EL COMPONENTE.
	 * LO SOBRE-ESCRIBIMOS PARA PINTAR NUESTRO PROPIO BOTON.
	 * NOTA: ESTE METODO LO MANDA LLAMAR JAVA CUANDO NECESITA REPINTAR LA VENTANA.
	 * ESTO OCURRE AL INICIO DEL PROGRAMA O AL MINIMIZAR, MAXIMIZAR, O CAMBIAR TAMANO DE PANTALLA.
	 * USTED PUEDE MANDARLO A LLAMAR CON EL METODO REPAINT() O DIRECTAMENTE.
	 * JAVA RECOMIENDA LLAMARLO ATRAVEZ DEL METODO REPAINT().
	 * */
	protected void paintComponent(Graphics g) {
		 // PRIMERO LE DECIMOS AL PAPA QUE DIBUJE SU PARTE.
		super.paintComponent(g);
		/*
		 * OBTENEMOS EL MODELO DEL BOTON.
		 * NOS PERMITE SABER SI EL BOTON HA SIDO PRESIONADO O NO.
		 * TAMBIEN PERMITE SABER SI EL MOUSE ESTA ENCIMA DEL BOTON.
		 * */
		ButtonModel model=getModel();
		/*
		 * OBTENEMOS EL OBJETO FONTMETRICS DEL OBJETO GRAPHICS.
		 * TIENE TODAS LAS METRICAS DE LA FUENTE DEL TEXTO. 
		 * FUENTE, TIPO DE LETRA, TAMANO (ANCHO,ALTO).
		 * */
		FontMetrics font=g.getFontMetrics();
		/*
		 * OBTENEMOS LAS MEDIDAS DEL TEXTO Y LO GUARDAMOS EN UNA
		 * INSTANCIA DE RECTANGLE2D.
		 * NOS SERVIRA PARA CALCULAR EL CENTRO DEL TEXTO.
		 * */
		Rectangle2D medidas=font.getStringBounds(texto,g);
		
		// CALCULOS PARA CENTRAR EL TEXTO.
		//LA MITAD DEL ANCHO DEL BOTON MENOS LA MITAD DEL ANCHO DEL TEXTO
		int x=(int)(getWidth()/2-medidas.getWidth()/2);
		//LA MITAD DEL ALTO DEL BOTON MENOS LA MITAD DEL ALTO DEL TEXTO.
		int y=(int)(getHeight()/2+medidas.getHeight()/2);
		
		// CALCULOS PARA PODER DIBUJAR NUESTRO RECTANGULO.
		int xd=x-5;
		int yd=(int)(getHeight()/2-medidas.getHeight()/2);
		int width=(int)(medidas.getWidth()+10);
		int height=(int)(medidas.getHeight()+5);
		
		/*DIBUJAMOS  UN RECTANGULO REDONDEADO
		 * g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
		 * x= coordenada x inicial del rectangulo.
		 * y=coordenada y inicial del rectangulo.
		 * width=ancho del rectangulo.
		 * height=alto del rectangulo.
		 * arcWidth=arco del ancho del rectangulo, que tan curveado quieres que se vea el ancho del rectangulo.
		 * arcHeight=arco del alto del rectangulo, que tan curveado quieres que se vea el alto del rectangulo.
		 */
		g.drawRoundRect(xd,yd ,width,height,10,10);
		
		//COMPROBAMOS SI EL BOTON ESTA PRESIONADO, Y BOTON ARMADO.
		/*
		 * ARMADO. SE REFIERE SI EL BOTON ESTA PRESIONADO Y ADEMAS EL MOUSE ESTA ENCIMA
		 * DEL BOTON. REGRESA TRUE SI OCURRE LO DESCRITO.
		 * PUEDE PASAR QUE PRESIONES EL BOTON Y SIN SOLTAR EL CLICK MUEVAS EL MOUSE.
		 * SI OCURRE ESTO RETORNA FALSO. 
		 * */
		if(model.isPressed() && model.isArmed() ) {
				//ESTABLECEMOS EL COLOR ROJO OBSCURO
				g.setColor(Color.red.darker());
				// DIBUJAMOS RECTANGULO REDONDEADO.
				g.fillRoundRect(xd,yd,width,height, 10,10);
				//ESTABLECEMOS COLOR A CYAN OBSCURO
				g.setColor(Color.CYAN.darker());
		}
		// COMPROBAMOS SI EL MOUSE ESTA SOBRE EL BOTON
		else if(model.isRollover()) {
			//ESTABLECEMOS EL COLOR A ROJO BRILLANTE.
			g.setColor(Color.RED.brighter());
			// DIBUJAMOS RECTANGULO REDONDEADO.
			g.fillRoundRect(xd,yd,width,height, 10,10);
			//ESTABLECEMOS COLOR A CYAN BRILLANTE.
			g.setColor(Color.CYAN.brighter());
		}
		
		//DIBUJAMOS EL TEXTO CON LAS COORDENADAS CALCULADAS.
		g.drawString(texto,x,y);
		
		
	}

}
