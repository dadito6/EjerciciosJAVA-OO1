package recorridos;

public class resultado<T> {
	ListaGenerica<T> lista;
	int peso ;
	
	public ListaGenerica<T> getLista( ){
		return lista;
	}
	
	public void setlista ( ListaGenerica<T> list) {
		this.lista=list ;
		
	}
	public int getpeso() {
		return peso;
	}
	public void setpeso(int pe) 
	{
		this.peso=pe;
	}

}
