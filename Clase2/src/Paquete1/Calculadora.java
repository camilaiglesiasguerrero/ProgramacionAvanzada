package Paquete1;

public class Calculadora implements Icalcular {

	public double sumar(Number num1, Number num2)
	{
		return num1.doubleValue() + num2.doubleValue();
	}
	
	public double restar(Number num1, Number num2)
	{
		// FIXME
		return num1.doubleValue() - num2.doubleValue();
	}
	
	public double multiplicar(Number num1, Number num2)
	{
		return num1.doubleValue() * num2.doubleValue(); 
	}
	
	/**
	 * Permite dividir dos números
	 * @param num1: número1
	 * @param num2: número2
	 * @return división
	 * @throws MiException: excepción de tipo: no se puede dividir por cero
	 * */
	public double dividir(Number num1, Number num2) throws MiException{
		if(num2.doubleValue() == 0) {
			throw new MiException("No es posible dividir por cero");
		}
		
		return num1.doubleValue()/num2.doubleValue();
		
	}
}
