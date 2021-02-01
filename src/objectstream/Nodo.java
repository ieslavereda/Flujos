package objectstream;

import java.io.Serializable;

public class Nodo<T> implements Serializable{
	
	private T info;
	private Nodo<T> siguiente;
	private Nodo<T> anterior;
	
	public Nodo(T info) {
		this.info=info;
		siguiente = null;
		anterior = null;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}

	public T getInfo() {
		return info;
	}
	
	@Override
	public String toString() {
		return info.toString();
	}

}
