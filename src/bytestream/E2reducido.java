package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2reducido {
	
	private static String fichero_entrada = "fichero_texto.txt";
	private static String fichero_salida = "fichero_texto_byte_salida.txt";

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream(fichero_entrada);
				FileOutputStream fos = new FileOutputStream(fichero_salida)){
			
			int c = fis.read(); 
			while(c != -1) {
				System.out.println(String.format("%16s", Integer.toBinaryString(c)).replaceAll(" ", "0"));
				fos.write(c);				
				c = fis.read(); 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
