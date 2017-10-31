package gt.edu.url.examen2.problema2;

import java.util.Iterator;

public class ArrayList<E> implements List<E> {

	private int j = 0; 
	public static final int CAPACITY = 16;
	private E[] data;
	private int size = 0;

	public void add(int i, E e) {
		checkIndex(i, size + 1);
		if (size == data.length)
			resize(2 * data.length);
		for (int k = size - 1; k >= i; k--)
			data[k + 1] = data[k];
		data[i] = e; 
		size++;

	}
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
	
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E set(int i, E e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}


}
