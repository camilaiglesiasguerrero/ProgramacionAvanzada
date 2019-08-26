package Paquete1;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona() {	}
	
	public Persona(String nombre, String apellido, int dni)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.dni;
	}
	
	@Override
	public boolean equals(Object o){
		if(o != null && this != null 
				&& this.nombre != null && this.apellido != null
				&& o.getClass().equals(this.getClass())) {
			Persona p = (Persona)o;
			if(p.nombre != null && p.apellido != null 
				&& this.nombre.equals(p.nombre) 
			 	&& this.apellido.equals(p.apellido)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int primo = 89;
		int resultado = 0;
		if(this.nombre != null) {
			resultado += primo * this.nombre.hashCode();
		}
		
		if(this.apellido != null) {
			resultado += primo * this.apellido.hashCode();
		}
		return resultado;
	}
}
