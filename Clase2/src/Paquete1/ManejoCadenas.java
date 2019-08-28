package Paquete1;

public class ManejoCadenas {
	
	public int retornarCantidadCaracteres(String s)
	{
		return s.length();
	}
	
	public String retornarMediaCadena(String s)
	{
		return s.substring(0, this.retornarCantidadCaracteres(s)/2);
	}
	
	public char retornarUltimoCaracter(String s)
	{
		return s.charAt(s.length()-1);
	}
	
	public String retornarInvertido(String s)
	{
		String retorno = "";
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			retorno = retorno + s.charAt(i);
		}
		return retorno;
	}
	
	public String separarConGuiones(String s)
	{
		String retorno = "";
		for(char c: s.toCharArray()) //version del foreach
		{
			retorno = retorno + c + '-';
		} 
		/*for(int i = 0; i < s.length(); i++)
		{
			retorno = retorno + s.charAt(i); 
			if(i<s.length()-1) 
			{
				retorno = retorno + "-";
			}
		}*/
		return retorno;
	}
	
	public boolean verificarContainsHola(String s)
	{/*
		s = s.toUpperCase();
		if(s.contains("HOLA"))
			return true;
		else
			return false;
		*/
		return s.toUpperCase().contains("HOLA");
	}
}
