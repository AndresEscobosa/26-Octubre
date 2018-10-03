package paquete1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Operaciones.SUMA);
		System.out.println(Operaciones.RESTA.name());
		double a=2;
		double b=4;
		double res=Operaciones.SUMA.resultado(a,b);
		System.out.println(res);
		System.out.println("hola mundo!");
		
		for(Operaciones ope:Operaciones.values()) {
			System.out.println(ope.name());
			System.out.println(ope);
		}
				
	}

}
