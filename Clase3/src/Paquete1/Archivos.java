package Paquete1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

	public void escribirArchivo() {
		try {

			File f = new File("archivo.txt");// genero el archivo en ram
			f.createNewFile(); // archivo físico
			FileWriter fw = new FileWriter(f, true);// escribo el archivo. Lo sobreescribe a menos q le pasemos true
													// como segundo parametro. Por defecto viene en false. De esa forma
													// puedo escribir sin pisar
													// genera IOException si no tiene permiso para escribir
			BufferedWriter bw = new BufferedWriter(fw);// Modo de escritura - Toma el archivo, hasta el close.
			bw.newLine();// genera un salto de linea
			bw.write("Texto Plano"); // escritura sobre el buffer.
			bw.newLine();// genera un salto de linea
			bw.flush(); // vacía el buffer => pasa a disco. Lo fuerzo
			bw.close();// cierra el buffer - libera el archivo. El close hace un flush

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leerArchivo() {
		try {
			File f = new File("archivo.txt");// genero el archivo en ram
			FileReader fr = new FileReader(f);// qué se va a hacer con el archivo
			BufferedReader br = new BufferedReader(fr);// si el archivo no existe fisicamente arroja IOexception
			String s = br.readLine();//busca saltos de linea.
			while(s!= null){
				System.out.println(s);
				s = br.readLine();//busca saltos de linea. En cada linea, borro el buffer
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
