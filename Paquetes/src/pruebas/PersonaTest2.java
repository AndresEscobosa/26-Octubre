package pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest2 {
	
	private static paquete1.Persona m;

	@BeforeClass
	public static void antesTodasPruebas() {
		System.out.println("ME EJECUTO ANTES QUE TODAS LAS PRUEBAS.");
		System.out.println("////////////////////////////////////////////////////");
		m=new paquete1.Persona("Maria", -28);
	}
	
	@Before
	public void antesPrueba() {
		System.out.println(" \t ME EJECUTO antes de cada prueba");
	}

	// ESTE TEST ESPERA UNA EXCEPTION DEL TIPO Exception.class, ESTO SE USA EN JUNIT 4.
	@Test(expected=Exception.class )
	public void test() throws Exception {
		System.out.println("\t\t PRUEBA 1");
		m.setEdad(-12);
		// CHECAR EXCEPCIONES CON JUNIT 5.
		//assertThrows(Exception.class,()->m.setEdad(-12), "Edad invalida");
	}

	@Test
	public void test2() {
		System.out.println("\t\t PRUEBA 2");
		fail("Prueba 2. No implementada");
	}
	
	@After
	public void despuesPrueba() {
		System.out.println(" \t ME EJECUTO Despues de cada prueba");
	}
	
	@AfterClass
	public static void despuesTodasPruebas() {
		System.out.println("ME EJECUTO DESPUES QUE TODAS LAS PRUEBAS.");
		System.out.println("////////////////////////////////////////////////////");
		m=null;
	}
}
