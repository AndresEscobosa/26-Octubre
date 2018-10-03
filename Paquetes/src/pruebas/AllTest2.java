package pruebas;

import junit.framework.Test;
import junit.framework.TestSuite;

/*
 * OTRA FORMA DE CREAR TestSuite.
 * Esta forma era más usada en JUnit 3.
 * 
 * */
public class AllTest2 {
	
	public static Test suite() {
	      TestSuite suite = new TestSuite("Conjunto de Test-Persona");
	      suite.addTestSuite(PersonaTest.class);
	      /*
	       * NOTA: Si descomentas la línea de abajo marca error. 
	       * Ya que al hacer un TestSuite de esta forma todos las clases 
	       * que conforman la prueba deben heredar de TestCase.
	       * */
	      //suite.addTestSuite(PersonaTest2.class); 
	      return suite;
	}

}
