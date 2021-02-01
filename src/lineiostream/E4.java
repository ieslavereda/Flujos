package lineiostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E4 {

	private static String fichero_entrada = "fichero_texto.txt";
	private static String fichero_salida = "fichero_texto_linea_salida.txt";

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new FileReader(fichero_entrada));
				PrintWriter pw = new PrintWriter(fichero_salida)){
			
			String line;
			while((line=br.readLine())!=null) {

				System.out.println(line);
				pw.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
