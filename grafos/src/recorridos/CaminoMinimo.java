package recorridos;

import ejercicio3.Grafo;
import ejercicio3.Vertice;
import ejerciciosPractica.Arista;
import ejerciciosPractica.ListaGenerica;

public class CaminoMinimo  {
	private Grafo<String> grafo;
			//devuelva el camino minimo desde un vertice inicial a un destino con la particularidad de tener aristas negativas
         // camino minimo con pesos negativos
		public int caminominimo( Grafo<String> grafo, Vertice<String> inicial, Vertice<String> destino) {
			boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
			ListaEnlazadaGenerica<Vertice<String>> list= new ListaEnlazadaGenerica <Vertice<String>> () ;
			int pesoAux=0;
			resultado<Vertice<resultado>> res = new resultado<Vertice<resultado>> ();
			res.setPeso(9999);
 			caminominimo(grafo,marca, list, inicial ,destino,pesoAux ,res);
 			return res.getLista();	
		
	}

			
			private void caminominimo(Grafo<String> grafo, boolean[] marca, ListaGenerica<String> camino ,Vertice<String> inicial ,Vertice<String> destino, int pesoAux , resultado<Vertice<resultado>> res) {
				marca[inicial.getPosicion()]=true;
				Vertice<String> v = grafo.listaDeVertice().elemento(inicial.dato()) ;
				camino.agregar (inicial.dato());
				if (inicial.equals(destino)) {
		            if ( pesoAux<res.getpeso()) {
		            	 res.setpeso(pesoAux) ;
		            	 res.SetLista(camino);
		            }
				}else {
				ListaGenerica<Arista<String>> ady = grafo.ListaDeAyacentes(inicial);
				ady.comenzar();
				while(!ady.fin()) {
					Arista<String> arista = ady.proximo();
		            Vertice<String> verticeSig = arista.verticeDestino();
		            
		            if (!marca[verticeSig.getPosicion()]) {
		            	camino.agregarFinal(verticeSig);
		            	pesoAux+=verticeSig.peso();
		            	
		            	this.caminominimo(grafo,marca,camino, verticeSig, destino ,pesoAux, res);
		          
		              camino.eliminar(verticeSig);
		              pesoAux-=verticeSig.peso();
				}
			
				}
			} //  fin del else
				marca[inicial.getPosicion()] = false ;


}
		private boolean estaContenido(ListaGenerica<String> lista, String elemento) {
		        lista.comenzar();
		        while (!lista.fin()) {
		                if (lista.proximo().equals(elemento)) {
		                        return true;
		                }
		        }
		        return false;
		}

}


