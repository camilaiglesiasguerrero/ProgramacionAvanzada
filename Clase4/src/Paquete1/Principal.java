package Paquete1;

import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Array List
		List<String> lista = new ArrayList<String>();
		 
		lista.add("Hola");
		lista.add("Chau");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		//for (String s : lista) {
		//	System.out.println(lista.get(i));
		//}
		//Sólo si lo definí con tipo de dato
		//List<String> lista = new ArrayList<String>();
		//List lista = new ArrayList();
		
		
		lista.remove(0);		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		System.out.println(lista.contains("Chau"));
		*/
		
		/*LinkedList*/
		List<String> lista = new LinkedList<String>();
		lista.add("Hola");
		lista.add("Chau");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		lista.remove(0);		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		System.out.println(lista.contains("Chau"));
		
	}

}
