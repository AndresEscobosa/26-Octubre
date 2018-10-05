package pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Persona;

public class TestSerializacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona("Pedro",30);
		Persona m=new Persona("Maria",30);
		ArrayList<Persona> lista=new ArrayList<Persona>();
		lista.add(p);
		lista.add(m);
		
		try {
			FileOutputStream archivo=new FileOutputStream("archivoPrueba.txt");
			ObjectOutputStream oos=new ObjectOutputStream(archivo);
			oos.writeObject(lista);
			oos.close();
			archivo.close();
			
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream archivoLectura=new FileInputStream("archivoPrueba.txt");
			ObjectInputStream ois=new ObjectInputStream(archivoLectura);
			ArrayList<Persona> listaRes=(ArrayList<Persona>) ois.readObject();

			for(Persona item:listaRes) {
				if(item instanceof Persona) {
					System.out.println(item.toString());
				}	
			}
			
			ois.close();
			archivoLectura.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
