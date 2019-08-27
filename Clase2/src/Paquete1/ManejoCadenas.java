package Paquete1;

public class ManejoCadenas {
	
	public int retornarCantidadCaracteres(String s)
	{
		return s.length();
	}
	
	public String retornarMediaCadena(String s)
	{
		return s.substring(0, s.length()/2);
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
		//for(String s : s.split("-"))   version del foreach
		for(int i = 0; i < s.length(); i++)
		{
			retorno = retorno + s.charAt(i); 
			if(i<s.length()-1) 
			{
				retorno = retorno + "-";
			}
		}
		return retorno;
	}
	
	public Boolean verificarContainsHola(String s)
	{
		s = s.toUpperCase();
		if(s.contains("HOLA"))
			return true;
		else
			return false;
	}
}
