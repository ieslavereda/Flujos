package objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E6 {

	private static String fichero = "fichero_objeto.txt";

	public static void main(String[] args) {

		Lista<Persona> l = new Lista<>();
		l.addHead(new Persona("Luis", 22));
		l.addHead(new Persona("Manolo", 33));

		save(l);
		System.out.println(loadLista());

	}

	private static Lista<Persona> loadLista() {
		Lista<Persona> lista = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

			lista = (Lista<Persona>) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

	private static Persona load() {
		Persona per = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

			per = (Persona) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return per;
	}

	private static void save(Lista<Persona> l) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {

			oos.writeObject(l);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void save(Persona p) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {

			oos.writeObject(p);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
