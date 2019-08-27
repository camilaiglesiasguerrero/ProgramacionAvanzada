package Paquete1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//Ejercicio 3
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
	}

}
