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
	 * Permite dividir dos n�meros
	 * @param num1: n�mero1
	 * @param num2: n�mero2
	 * @return divisi�n
	 * @throws MiException: excepci�n de tipo: no se puede dividir por cero
	 * */
	public double dividir(Number num1, Number num2) throws MiException{
		if(num2.doubleValue() == 0) {
			throw new MiException("No es posible dividir por cero");
		}
		
		return num1.doubleValue()/num2.doubleValue();
		
	}
}
