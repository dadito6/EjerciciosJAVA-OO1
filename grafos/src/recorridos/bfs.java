package recorridos;

public class bfs (Grafo <T> grafo) {
		boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
		for( int i=1;i<=grafo.listaDeVertices().tamanio()+1 ; i++) {
			if(!marca[i]) 	
				this.dfs(i,grafo,marca);
		}
		
		private void bfs (int i ,  Grafo<T> grafo ,boolean [] marca) {
			ListaGenerica<Arista<T>> ady = null ;
			ColaGenerica<Vertice<T>> q = new ColaGenerica<Vertice<T>> () ;
			q.encolar ( grafo.listaDeVertices().elemento(i));
			marca[i] = true;
			while(!cola.esVacia()) {
				Vertice<T> v = q.desencolar() ;
				ady.comenzar();
				while(!ady.fin()) {
					Arista<T> arista = ady.proximo();
					int j = arista.getVerticeDestino() .getPosicion();
					if ( !marca[j]) {
						Vertice<T> w = arista.getVerticeDestino();
						marca[j] = true;
						q.encolar(w);
					}
				}
			}
		}
			
		}

