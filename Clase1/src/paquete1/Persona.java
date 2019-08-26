package paquete1;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona(){
		
	}
	
	public Persona(String nombre, String apellido, int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public void setDni(int dni){
		this.dni = dni;
	}
	
	public int getDni(){
		return this.dni;
	}
	
	@Override
	public String toString(){
		return this.nombre + ' ' + this.apellido + ' ' + this.dni;
	}

	@Override
	public boolean equals(Object o){
		//if(o != null && o instanceof Persona){	//referencia no nula y para saber si el objeto es de tipo persona
		if(o != null && o.getClass().equals(this.getClass())){ //referencia no nula y misma clase
			Persona p = (Persona)o;				//casteo
			if(this.nombre.equals(p.nombre) && this.apellido.equals(p.apellido)){	//en caso de string tengo q comparar con equals. Equals compara por objeto == tipo primitivo
				return true;
			}
		}
		return false;
		//falta validar que los atributos no sean nulos. sino va a dar null pointer exception
	}

	@Override
	public int hashCode(){
		//falta validar que los atributos no sean nulos. sino va a dar null pointer exception
		final int primo = 31; //ni muy grande ni muy chico
		int resultado = 0;
		if(this.nombre != null){
			resultado = primo * this.nombre.hashCode();
		}
		if(this.apellido != null){
			resultado += primo * this.apellido.hashCode();	
		}
		return resultado;
	}
	
	
}
