package Paquete1;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona(null,"Perez",1);
		Persona p2 = new Persona("juan","Perez",1);

		if(p.equals(p2)) {
			System.out.println(p);
			System.out.println(p2);
			System.out.println("son iguales p a p2");
		}else {
			System.out.println("no son iguales p a p2");
		}
		if(p2.equals(p)) {
			System.out.println(p);
			System.out.println(p2);
			System.out.println("son iguales p2 a p");
		}else {
			System.out.println("no son iguales p a p2");
		}
	}

}
