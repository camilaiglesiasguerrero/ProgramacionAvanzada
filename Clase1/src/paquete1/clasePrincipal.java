package paquete1;

public class clasePrincipal {

	public static void main(String[] args) {
		//System.out.println("hola");
		Persona p;
		p = new Persona();
		Persona p2 = new Persona("Juan", "Pérez", 24567890);
		p.setNombre("Juan");
		p.setApellido("Perez");
		p.setDni(24567890);
		System.out.println(p);
		System.out.println(p2);
		
		if(p==p2){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		if(p.equals(p2)){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
	}

}

