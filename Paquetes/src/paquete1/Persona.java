package paquete1;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws Exception {
		if(edad<0) throw new Exception("Edad fuera de rango");
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona_Paquete1 [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
