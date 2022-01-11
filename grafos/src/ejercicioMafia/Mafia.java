package ejercicioMafia;

import ejercicio3.Arista;
import ejercicio3.Grafo;
import ejercicio3.Vertice;

public class Mafia {
	
	
	private Grafo<String> grafo;

	
	
	
		public ListaGenerica<Sitio> BuscarOringen_LanzarDFS(){
			ListaGenerica<Sitio> camino= new ListaGenericaEnlazada<Sitio>() ;
			int mafias=0;
			Vertice<Sitio> inicial = 	null ;
			Vertice<Sitio> destino = null;
			ListaGenerica<Sitio> caminoMin = new ListaGenericaEnlazada<Sitio> () ;
			int[] mafiasMin = {Integer.MAX_VALUE} ;
			ListaGenerica<Vertice<Sitio>> vertices = grafo.listaDeVertices() ;
			vertices.comenzar() ;
			boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
			
			while ( !vertices.fin() && (inicial== null || destino == null) ) {
				Vertice<Sitio> v = vertices.proximo() ;
				if(v.dato().getnombre().equals("Casa Intendente ")) 
					inicial=v;
				if ( v.dato().getnombre().equals("Municipalidad"))
					destino = v;
			}
			dfs ( inicial,destino , marca , camino , caminoMin, mafias, mafiasMin) ;
			return caminoMin;
		}
	
		private void dfs (Vertice<Sitio> inicial , Vertice<Sitio> destino , boolean[] marca, ListaGenerica<Sitio> caminoMin, ListaGenerica<Camino> camino ,int mafias, int[] mafiasMin) {
			
			marca[inicial.posicion()] = true ;
			camino.agregarFinal(inicial.dato()) ;
			if ( inicial.dato().getTieneMafia()) 
				mafias++;
			if(inicial.equals(destino)) {
				if ( mafias<mafiasMin[0]) {
					mafiasMin[0] = mafias ;
					this.copiar(camino,caminoMin);
				}
			
			}else {
				ListaGenerica<Vertice<Sitio>> adyacentes = grafo.listaDeAdyacentes(inicial) ;
				adyacentes.comenzar() ;
				while (!adyacentes.fin()) {
					Arista<Sitio> Aris = adyacentes.proximo() ;
					if ( !marca[Aris.verticeDestino().getPosicion()]) {
						dfs (Aris.verticeDestino(), destino , marca , caminoMin, camino ,mafias+Aris.peso(), mafiasMin) ;
						
					}
				
				}
			}
			 //  para pasar de nuevo por el mismo vertice 
			// sino nos quedariamos con un solo camino y no el minimo
			
			marca[inicial.getPosicion()] = false;
			camino.eliminarEn(camino.tamanio()-1) ;
			

			
		}
		
		
		private void copiar ( ListaGenerica<Sitio> aux , ListaGenerica<Sitio> listaFinal) {
			int tamañoListaFinal= listaFinal.tamanio() ;
			for ( int i=1 ; i<=tamañoListaFinal ; i++) 
				listaFinal.eliminar (0) ;
			
			int tamañoListaAux = aux.tamanio() ;
			for (int i =0; i<tamañoListaAux;i++) 
				listaFinal.agregarFinal(aux.elemento(i)) ;
			
			}
		
	
}
