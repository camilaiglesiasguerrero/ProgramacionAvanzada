package Paquete1;

/*public class Caja<T> {
	T miObjeto;
	
	public void add(T obj) {
		this.miObjeto = obj;
	}
	
	public T get() {
		return this.miObjeto;
	}
}
*/


public class Caja<T,N extends Number, O> {
T miObjetoT;
O miObjetoO;
N miObjetoN;

public void add(T obj, N obj2, O obj1) {
	this.miObjetoT = obj;
	this.miObjetoO = obj1;
	this.miObjetoN = obj2;
}

/*public <L> void get() {
	return this.miObjeto;

}*/
}
