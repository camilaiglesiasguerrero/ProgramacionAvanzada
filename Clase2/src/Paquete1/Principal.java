package Paquete1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//Ejercicio 3
		/*
		System.out.println("Ingrese cadena: ");
		Scanner sc = new Scanner(System.in);
		String miString  = sc.nextLine();
		//String miString =  "charjholadklajdslad";
		ManejoCadenas mc = new ManejoCadenas();
		System.out.println("Cantidad de caracteres: " + mc.retornarCantidadCaracteres(miString));
		System.out.println("Media cadena: " + mc.retornarMediaCadena(miString));
		System.out.println("Ultimo caracter: "+ mc.retornarUltimoCaracter(miString));
		System.out.println("Invertido: " + mc.retornarInvertido(miString));
		System.out.println("Separado con guiones: " + mc.separarConGuiones(miString));
		System.out.println("Verificar si contiene hola: " + mc.verificarContainsHola(miString));
		*/
//Wrappers
/*		Integer i = Integer.valueOf(1);//instancia a Integer y transforma el 1 de tipo primitivo a clase. 
		int ip = i.intValue();//vuelve a recuperar el tipo primitivo
		
		System.out.println(i);
		System.out.println(ip);
*/
		
//Interfaces y Exceptions
//Ejercicio 5
		try {
			Number n1 = 4.3;
			Number n2 = 0;
			Calculadora c = new Calculadora();
			c.sumar(n1, n2);
			c.restar(n1, n2);
			c.multiplicar(n1, n2);
			c.dividir(n1,n2);
			
		}
		catch(MiException e){
			e.printStackTrace(); //arroja toda la información
			System.out.println(e.getMessage());//arroja mensaje 
		}finally {		
		}
	
	
	}
}
