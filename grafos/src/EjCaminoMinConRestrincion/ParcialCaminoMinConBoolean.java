package EjCaminoMinConRestrincion;


import tp02.ejercicio2.ListaGenerica;
import tp06.ejercicio3.Arista;
import tp06.ejercicio3.Grafo;
import tp06.ejercicio3.Vertice;

public class ParcialCiudades {
	/// veo innecesario crear otra clase solo para guardar la lista, al no tener que trabajar con el peso, creo que basta con esto.. Solo necesito saber si el peso de la arista es menor al peso por parametro, no el peso minimo del camino.
	
	public ListaGenerica<String> resolver1(Grafo<String> grafo, String origen, String destino,int distanciaEvitar, String ciudadTransitar) {
		
		boolean[] marca = new boolean[grafo.listaDeVertices().tamanio() + 1];
		ListaGenerica<String> caminoactual = new ListaEnlazadaGenerica<String>();
		ListaGenerica<String> caminosalida = new ListaEnlazadaGenerica<String>();
		ListaGenerica<Vertice<String>> lisv = grafo.listaDeVertices();
		lisv.comenzar();
		while (!lisv.fin()) {
			Vertice<String> ver = lisv.proximo(); 
			if (ver.dato().getNom().equals(origen)) {  // considero que hay que buscar el origen en el grafo , ya que solo tengo el string no donde esta ubicado
				resolver1(grafo, ver, marca, destino, distanciaEvitar, caminoactual, caminosalida,ciudadTransitar);
				break;
			}
		}
		return caminosalida;
	}

	private void resolver1(Grafo<String> grafo, Vertice<String> ver, boolean[] marca, String destino,
			int distanciaMax, ListaGenerica<String> caminoactual, ListaGenerica<String> caminosalida,String ciudadTransitar) {
		

		marca[ver.getPosicion()] = true;
		caminoactual.agregarFinal(ver.dato());
		if (ver.dato().getNom().equals(destino)) {
			if (estaContenido(caminoactual,ciudadTransitar)) {
				caminoactual.guardarEnCamino(caminoactual, caminosalida);
			}
		} else {
			ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(ver);
			ady.comenzar();
			while ((!ady.fin())) {
				Arista<String> sigAris=ady.proximo();
				Vertice<String> nextver = sigAris.verticeDestino();
				if ((!marca[nextver.getPosicion()]) && (sigAris.peso() <= distanciaMax)) {  // podria preguntar aca si esta contenido por ciudadTransitar, pero pienso que puede llegar en el futuro la ciudad..
						resolver1(grafo, nextver, marca, destino, distanciaMax, caminoactual, caminosalida, ciudadTransitar);
					}
				
			}
		}
		caminoactual.eliminarEn(caminoactual.tamanio());
		marca[ver.getPosicion()] = false;
	}



private void guardarEnCamino ( ListaGenerica<String> aux , ListaGenerica<String> listaFinal) {
	int tamañoListaFinal= listaFinal.tamanio() ;
	for ( int i=1 ; i<=tamañoListaFinal ; i++) 
		listaFinal.eliminar (0) ;
	
	int tamañoListaAux = aux.tamanio() ;
	for (int i =0; i<tamañoListaAux;i++) 
		listaFinal.agregarFinal(aux.elemento(i)) ;
	
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
