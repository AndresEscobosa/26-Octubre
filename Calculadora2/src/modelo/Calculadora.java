package modelo;


public class Calculadora{

	private Operador ope;
	
	public Calculadora() {
		
	}

	public Calculadora(Operador ope) {
		super();
		this.ope = ope;
	}

	public Operador getOpe() {
		return ope;
	}

	public void setOpe(Operador ope) {
		this.ope = ope;
	}
	
	public float operacion(float ope1,float ope2) {
		return ope.resultado(ope1, ope2);
		
	}
	
	
}
