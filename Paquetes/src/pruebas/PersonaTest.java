package pruebas;

import paquete1.Persona;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

import junit.framework.TestCase;

/*
 * Heredamos de TestCase, es una forma de crear una prueba unitaria.
 * Los metodos de esta clase que realicen una prueba tienen que iniciar con 
 * la palabra test.
 * */
public class PersonaTest extends TestCase{
	
	private paquete1.Persona m;
	private paquete2.Persona p;
	 /*
	  * Sobre escribimos este metodo. Es usado para inicializar datos.
	  * Se manda a llamar antes de cada prueba.
	  * */
	public void setUp() {
		System.out.println("Antes que cada prueba.");
		m=new paquete1.Persona("Juan",22);
		p=new paquete2.Persona("Maria",20);
	}
	
	
	/*
	 * assertAll. Se usa para probar un conjunto de condiciones, todas tienen 
	 * que cumplirse para que la prueba sea correcta.
	 * assertTrue. Prueba si una condicion es verdadera.
	 * assertFalse. Prueba si una condicion es falsa.
	 * assertEquals. Prueba si dos valores son iguales.
	 * assertNull. Prueba si un dato es nulo.
	 * assertNotNull. Prueba si un dato no es nulo.
	 * assertSame. Prueba si dos referencias a objetos apuntan al mismo objeto 
	 * assertNotSame. Prueba si dos referencias a objetos no apuntan al mismo objeto.
	 * assertArrayEquals. Compara si dos arreglos son iguales entre si.
	 * fail(mensaje). Se usa para decir que ocurrio un error. 
	 * */
	
	@Test
	public void testClases() {
		assertAll("Objetos instancias de Personas",
				()->assertTrue(m instanceof Persona),
				()->assertTrue(p instanceof paquete2.Persona)
		);
	}
	
	@Test
	public void testPersonaPaquete1() {
		assertAll("Valos correctos de Persona paquete 1",
				()->assertEquals("Juan",m.getNombre()),
				()->assertEquals(22,m.getEdad())

		);
	}
	
	@Test
	public void testPersonaPaquete2() {
		assertAll("Valos correctos de Persona paquete 2",
				()->assertEquals("Maria",p.getNombre()),
				()->assertEquals(20,p.getEdad())
		);
	}

}
