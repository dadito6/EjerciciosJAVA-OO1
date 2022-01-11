package ejerciciosPractica;

import ejercicio3.Arista;
import ejercicio3.Grafo;
import ejercicio3.Vertice;

public class RecorridoDeCiudades {

	private Grafo<String> grafo;
	
		public ListaGenerica<String> RecorridoDeCiudades () {
			boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
			ListaEnlazadaGenerica<Vertice<String>> list= new ListaEnlazadaGenerica <Vertice<String>> () ;
			ListaEnlazadaGenerica<Vertice<String>> lis= new ListaEnlazadaGenerica <Vertice<String>> () ;
			ListaEnlazadaGenerica<Vertice<String>> camino= new ListaEnlazadaGenerica <Vertice<String>> () ;
			RecorridoDeCiudades(grafo,marca, list, lis,camino,"General Belgrano" , "La Plata", 20);
		
			return camino;
}



/// parte cinco
		
		private void RecorridoDeCiudades( Grafo<String> grafo, boolean[] marca,ListaEnlazadaGenerica<Vertice<String>> lista, ListaEnlazadaGenerica<Vertice<String>> lis, ListaEnlazadaGenerica<Vertice<String>> camino,String ciudad1,String ciudad2, int combustible) {
			marca[i]=true;
			Vertice<String> v = grafo.listaDeVertices().elemento(ciudad1) ;
			lis.agregar (v);
			ListaGenerica<Arista<T>> ady = grafo.ListaDeAyacentes(v);
			ady.comenzar();
			boolean tanque=True;
			while(!ady.fin() && tanque) {
				if(ady.getVerticeDestino()== ciudad2) {  //a
			/// ej b)  If( ady.GetVerticeDestino() == ciudad2) &&  ( lis!= lista ) 
					//ej c) if ( ady.getVerticeDestino() == ciudad2 ) &&( lis < camino ) 
					//ej d) if (combustible > 0 ) combustible -=1  else tanque=False
								/// ej d)) if (ady.getVerticeDestino()=== ciudad2)&& (lis<camino) &&  
					// ej e) if (combustible >2 ) combustible -=1 ej e)) if (ady.getVerticeDestino()=== ciudad2)&& (lis<camino)
					// else cargar(combustible)
					camino.clonar(lis);
				}
				int j=ady.proximo().getVerticeDestino().getPosicion();
				if(!marca[j]) {
					this.dfs(j, grafo, marca, lis, camino ,ciudad1,ciudad2);
				}
			}
		}
		}
		
		
		
