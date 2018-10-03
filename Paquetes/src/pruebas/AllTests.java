package pruebas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * Esto se llama TestSuite, es un conjunto de TestCase agrupados.
 * Generalmente los test automatizados se encuentran separados lo cual es bastante 
 * dificil probar uno por uno.
 * Con TestSuite la idea es agruparlos y probarlos todos al mismo tiempo.
 * */

@RunWith(Suite.class)
@SuiteClasses({ PersonaTest.class, PersonaTest2.class})
public class AllTests {

}
