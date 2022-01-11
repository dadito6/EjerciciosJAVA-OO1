package recorridos;

import ejercicio3.Grafo;

public class dfs{
	
	public void  dfs ( Grafo<String> grafo) {
		boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
		ListaEnlazadaGenerica<Vertice<T>> list= new ListaEnlazadaGenerica <Vertice<T>> () ;
		for( int i=1;i<=grafo.listaDeVertices().tamanio()+1 ; i++) {
			if(!marca[i]) 	
				dfs(i,grafo,marca, list);
		}
		
}


		
		private void dfs(int i, Grafo<T> grafo, boolean[] marca, ListaEnlazadaGenerica<Vertice<T>> lis) {
			marca[i]=true;
			Vertice<T> v = grafo.listaDeVertices().elemento(i) ;
			lis.agregar (v,lis.tamanio());
			ListaGenerica<Arista<T>> ady = grafo.ListaDeAyacentes(v);
			ady.comenzar();
			while(!ady.fin()) {
				int j=ady.proximo().getVerticeDestino().getPosicion();
				if(!marca[j]) 
					this.dfs(j, grafo, marca, lis);
				
			}
		}
		
		

}

