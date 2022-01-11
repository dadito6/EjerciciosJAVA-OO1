package recorridos;

import ejercicio3.Grafo;
import ejercicio3.Vertice;
import ejerciciosPractica.Arista;
import ejerciciosPractica.ListaGenerica;

public class BuscadorCaminoMasCorto {
	
		private Grafo<String> bosque;
	
	
		
		public   BuscadorCaminoMasCorto(Grafo<String> bosque) {
			this.bosque= bosque ;
			}
		

		// buscamos el camino mas corto , NO el minimo , aca solo tenemos en cuenta la cantidad de aristas
			
		public ListaGenerica<String> recorridoMasCorto (){
				
				boolean[] marca = new boolean [bosque.listaDeVertices().tamanio()+1];
				ListaGenerica<String> resultado= new ListaEnlazadaGenerica <String> () ;
				ListaGenerica<String> caminoAct= new ListaEnlazadaGenerica <String> () ;
				Vertice<String> v = buscarInicial();
				caminoAct.agregarFinal(v.dato());
				marca[v.getPosicion()] = true;
				dfs(marca, resultado,caminoAct, v);
				return  resultado ;
				}
			
			
			//  me devuelve el inicio del bosque
			private int buscarInicial( ) {
				ListaGenerica<Vertice<String>> vertices = bosque.listaDeVertices() ;
				vertices.comenzar() ;
				int pos=-1 ;
				boolean encontre=false;
				while (!vertices.fin() && !encontre) {
					Vertice<String> v = vertices.proximo() ;
					if (v.dato().equals(" Casa xd")) {
						pos= v.getPosicion();
					}
				}
				return pos ;
 				}
			
			private void dfs( boolean[] marca, ListaGenerica<String> resultado , ListaGenerica<String> caminoAct,Vertice<String> v ) {
	
				ListaGenerica<Arista<String>> ady = grafo.ListaDeAyacentes(v);
				ady.comenzar();
				while(!ady.fin()) {
					Arista<String> arista = ady.proximo();
		            Vertice<String> verticeSig = arista.verticeDestino();
		            
		            if (!marca[verticeSig.getPosicion()]) {
		            	marca[verticeSig.getPosicion()] = true;
		            	caminoAct.agregarFinal(verticeSig.dato()) ;
		            	if (( verticeSig.dato().equals('Casa Abuelita')) && (( resultado.esVacia() ) || (caminoAct.tamanio()< resultado.tamanio()))) {
		            		resultado.eliminar();
		            		caminoAct.comenzar();
		            		while(caminoAct.fin()) {
		            			resultado.agregarFinal(caminoAct.proximo());
		            		}
		            		
		            	}	else {
		            		 this.dfs(marca, camino , caminoAct , verticeSig) ;
		            	}
		        
				marca[verticeSig.getPosicion()] = false ;
				caminoAct.eliminar(caminoAct.tamanio());

		            }
				}
}
			}