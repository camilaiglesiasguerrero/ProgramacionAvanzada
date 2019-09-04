package Paquete1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
			String s = br.readLine();// busca saltos de linea.
			while (s != null) {
				System.out.println(s);
				s = br.readLine();// busca saltos de linea. En cada linea, borro el buffer
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leerYCopiarStreamer() {
		try {
			//Inicio leer Streamer
			File fo = new File("C:/imgPA.jpg"); // file origen
			FileInputStream fis = new FileInputStream(fo); // de qué forma vamos a hacer el input
			BufferedInputStream bis = new BufferedInputStream(fis);
			//Fin leer - Inicio copiar
			File fd = new File("nuevo.jpg");// file destino
			FileOutputStream fos = new FileOutputStream(fd);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//fin copiar
			int cant = 1024;// cantidad de bytes q voy a leer
			int lei = 0;//cantidad de bytes que logr+o leer
			byte[] buff = new byte[cant];// Los array en Java son objetso, necesito instanciarlos
			while((lei = bis.read(buff, 0, cant))>-1) {// parametros: donde va a guardar, desde hasta de cant de bytes q voy a leer,
													//retorno: cuántos bytes leyó. si no tiene mas nada, devuelve -1
				bos.write(buff,0,lei);
			}
			bos.close();
			bis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void leerYCopiarCarpetaCompleta() {
		try {
			File pathOrigen = new File("C:\\Camera Roll");//ruta completa
			File[] todos = pathOrigen.listFiles();
			String name;
			File fd = new File("//Imagenes");
			fd.mkdir();
			for(File f1 : todos) {
				name = f1.getName();
				FileInputStream fis = new FileInputStream(f1);
				BufferedInputStream bis = new BufferedInputStream(fis);
				File fDestino = new File(name);
				FileOutputStream fos = new FileOutputStream(fDestino);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				int cant = 1024;
				int lei = 0;
				byte[] buff = new byte[cant];
				while((lei = bis.read(buff, 0, cant))>-1) {
					bos.write(buff,0,lei);
				}
				bos.close();
				bis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
