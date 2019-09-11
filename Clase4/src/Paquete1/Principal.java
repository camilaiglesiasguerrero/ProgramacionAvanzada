package Paquete1;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	/*public static void main(String[] args) {
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
		/*List<String> lista = new LinkedList<String>();
		lista.add("Hola");
		lista.add("Chau");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		lista.remove(0);		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		System.out.println(lista.contains("Chau"));
		*/
		
		/*HASHSET*/
		/*
		Set<String> lista = new HashSet<String>();
		lista.add("Hola");
		lista.add("Chau");
		lista.add("Chau");
		for (String string : lista) {
			System.out.println(string);
		}
		*/
		/*
		Set<String> lista = new TreeSet<String>();
		lista.add("Hola");
		lista.add("Chau");
		lista.add("Adios");
		for (String string : lista) {
			System.out.println(string);
		}*/
		
		/*Set<Persona> lista = new TreeSet<Persona>(); // con compare to sobreescrito
		Persona p1 = new Persona("Matías","Ramos",31);
		Persona p2 = new Persona("Matías","Ramos",31);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p1);
		
		System.out.println(lista.size());
		for (Persona persona : lista) {
			System.out.println(persona);
		}*/
		
		/*Ordenamiento con array List*/
		/*List <Persona> lista = new ArrayList<Persona>();
		Persona p1 = new Persona("Matías","Ranos",31);
		Persona p2 = new Persona("Matías","Ramos",31);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p1);

		Collections.sort(lista);
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}*/
		
		
		//NO ES COLLECTION
		/*Map<Integer,Persona> datos = new HashMap<Integer,Persona>();
		datos.put(10,new Persona("Matias","Ramos",31));
		Persona p = datos.get(10);
		System.out.println(p);
		System.out.println(datos.keySet());
		*/
		
		//TIPOS GENERICOS
		/*Caja c = new Caja();
		c.add("cualquier verdura");
		c.add(1);
		System.out.println(c.get());
		
		Caja<String> c1 = new Caja();
		c1.add("Solo string");
		//c1.add(123);rompe
		
		System.out.println(c1.get());*/
		
		/*Caja<Integer,Float,Persona> c = new Caja();
		c.add(Integer.valueOf(1), new Persona(), Integer.valueOf(2));
		System.out.println(c);
		*/
		
	//}
	
	//INICIO EJERCICIO
	public static void main(String[] args) {
		List<Persona> per = new ArrayList<Persona>();
		List<Deportista> dep = new ArrayList<Deportista>();
		
		mostrar(per);
		mostrar(dep);
		
	}
	
	//public static void mostrar(List<Persona> lista) { no existe herencia entre listas! 
	//public static void mostrar(List<?> lista) { //Lista de comodin - Lista de cualquier cosa
	public static void mostrar(List< ? extends Persona> lista) { //Lista de comodin - Lista de cualquier cosa mientras q sea obj heredado de Persona.
		for (Persona persona : lista) {
			System.out.println(persona.getNombre());
		}
	}
}
