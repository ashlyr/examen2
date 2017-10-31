package gt.edu.url.examen2.problema5;

import gt.url.edu.demoestructuras.modelo.Nodo;

public class DynamicStack<E> implements Stack<E> {

	private static class Node<E>{
		private E element; //Valor
		private Node<E> next; //Puntero en la lista
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}public class Nodo {
		
		private int v;
		private Nodo siguiente;//
		
		
		
		public Nodo(int v, Nodo siguiente) {
			super();
			this.v = v;
			this.siguiente = siguiente;
		}
		public int getV() {
			return v;
		}
		public void setV(int v) {
			this.v = v;
		}
		public Nodo getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}
		@Override
		public String toString() {
			return "Nodo [v=" + v + ", siguiente=" + siguiente + "]";
		}

	private Node<E> head = null;
	private Node<E> tail = null;
	
	
	

	
		//ARRAY LIST
		/*public static final int CAPACITY=1000;
		private E[] data;
		
		
		public DynamicStack() {
			this(CAPACITY);
		}

		public DynamicStack(int capacity) {
			data = (E[]) new Object[capacity];
		}

		public int size(){
			return size;
		}

		public boolean isEmpty() {
			return (t == -1);
		}

		public void push(E e) {
			data[++t] = e;
		}

		public E top() {
			if (isEmpty()) return null;
			return data[t];
		}

		public E pop() {
			if (isEmpty()) return null;
			E response = data[t];
			data[t] = null;
			t--;
			return response;
		}*/
		

	
}
	public DynamicStack(int capacity) {
		data = (E[]) new Object[capacity];
		capacidadD = capacity;
	}
	
	private int capacidadD;
	private int t=-1;
	private int size = 0;
	private E[] data;
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t == -1);
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		data[++t] = e;
		if(t == capacidadD-1)
		{
			E[] auxiliar = data;
			data = (E[]) new Object[this.size()+10];
			capacidadD = this.size()+10;
			for(int i=0; i<=this.size();i++)
			{
				data[i]= auxiliar[i];
			}
		}
		
	}
	public void Ampliar() {
		
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return data[t];
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		E response = data[t];
		data[t] = null;
		t--;
		return response;
	}
}