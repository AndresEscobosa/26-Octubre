package vista;

import modelo.Genero;

public interface FormularioInterface {
	
	public String getNombre() throws Exception;
	public String getPassword();
	public Genero getGenero();

}
