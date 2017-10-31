package gt.edu.url.examen2.problema4;

import gt.edu.url.examen2.problema5.Stack;

public class Nodo <E> implements PositionalList<E> {

	@Override
	public Position<E> positionAtIndex(int i)
	{
	
		Position<E> aux=this.first();
        int cont=0;
         
        if(i<0 || i>=size()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            
            while(aux!=null){
                if (i == cont){
                    return aux; 
                }
                 
                //Actualizo el siguiente
                
                cont++;
                 
                
                
                
            }
        }
         
        return aux;
       
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
	public Position<E> first() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> last() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> addFirst(E e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> addLast(E e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E remove(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
     
}
