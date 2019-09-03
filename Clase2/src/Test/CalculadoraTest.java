package Test;

import Paquete1.Calculadora;
import Paquete1.MiException;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void dividirOk() {
		Number divisor = 6;
		Number dividendo = 2;
		Number resultado = 3.0;
		Calculadora calcu = new Calculadora();
		try {
			Number retorno =  calcu.dividir(divisor, dividendo);
			Assert.assertEquals(resultado, retorno);
		}
		catch(MiException e){
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void dividirPorCero() {
		Number divisor = 6;
		Number dividendo = 0;
		Calculadora calcu = new Calculadora();
		try {
			Number retorno =  calcu.dividir(divisor, dividendo);
		}
		catch(MiException e){
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void dividirNull() {
		Calculadora calcu = new Calculadora();
		try {
			Number retorno = calcu.dividir(null, 1);
		}catch(MiException e) {
			Assert.fail("Lanza mi exception");
		}
		catch(NullPointerException ex){
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void dividirNulls() {
		Calculadora calcu = new Calculadora();
		try {
			Number retorno = calcu.dividir(null, null);
		}catch(MiException e) {
			Assert.fail("Lanza mi exception");
		}
		catch(NullPointerException ex){
			Assert.assertTrue(true);
		}
	}
	
	
}
