package Paquete1;

public class Calculadora implements Icalcular {

	public Double sumar(Number num1, Number num2)
	{
		return num1.doubleValue() + num2.doubleValue();
	}
	
	public Double restar(Number num1, Number num2)
	{
		return num1.doubleValue() - num2.doubleValue();
	}
	
	public Double multiplicar(Number num1, Number num2)
	{
		return num1.doubleValue() * num2.doubleValue(); 
	}
	
	public Double dividir(Number num1, Number num2) throws MiException{
		if(num2.intValue() == 0) {
			throw new MiException("No es posible dividir por cero");
		}
		
		return num1.doubleValue()/num2.doubleValue();
		
	}
}
