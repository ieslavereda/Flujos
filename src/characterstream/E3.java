package characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E3 {

	private static String fichero_entrada = "fichero_texto.txt";
	private static String fichero_salida = "fichero_texto_character_salida.txt";
	
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader(fichero_entrada);
		PrintWriter pw = new PrintWriter(fichero_salida);){
			
			int c ;
			
			while((c=fr.read())!=-1) {
				System.out.println(String.format("%16s", Integer.toBinaryString(c)).replaceAll(" ", "0"));
				pw.write(c);
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
