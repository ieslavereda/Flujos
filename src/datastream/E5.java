package datastream;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E5 {

	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};
	
	public static void main(String[] args) {
		
		
		try(DataInputStream out = new DataInputStream(new FileInputStream(dataFile))) {
			
			while(true) {
				System.out.println(out.readUTF() + " " + out.readInt() + " " + out.readDouble()); 
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		} catch (EOFException eof) {
			
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
	              new FileOutputStream(dataFile)));){
			
			for(int i=0;i<descs.length;i++) {
				out.writeUTF(descs[i]);
				out.writeInt(units[i]);
				out.writeDouble(prices[i]);
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
