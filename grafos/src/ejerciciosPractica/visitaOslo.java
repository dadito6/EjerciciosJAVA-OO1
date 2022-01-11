package ejerciciosPractica;

import java.util.Collections;

import ejercicio3.Grafo;
import ejercicio3.Vertice;

public class visitaOslo{
	private Grafo<String> grafo;
	
	public ListaGenerica<String> paseoEnBici ( ) {
		boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
		ListaGenerica<String> list= new ListaGenerica <String> () ;
		ListaGenerica<String> restringidos= new ListaEnlazadaGenerica <String> () ;
		Restingidos.agregarFinal( "Akker Brigge" , "Palacio Real" ) ;
		int maxTiempo= 120 ;
		int i=1;
		Vertice<String> inicial= "Ayuntamiento";
		Vertice<String> destino= "Museo Vikingo" ;
		while(i<=grafo.listaDeVertices().tamanio()+1 ) {
			Vertice<String> v = grafo.listaDeVertices().elemento(i) ;
			if(!marca[i] && grafo.listaDeVertices().elemento(i)== "Ayuntamiento")
				return paseoEnBici(grafo,marca, list,restringidos,inicial, destino ,maxTiempo);
			i+=1 ;
		}
		return list;
		}
	

	
	private ListaGenerica<String> paseoEnBici(Grafo<String> grafo, boolean[] marca,ListaEnlazadaGenerica<String> camino ,ListaEnlazadaGenerica<String> restringidos, Vertice<String> inicial, Vertice<String> destino, int min) {
		marca[inicial.getPosicion()]=true;
		camino.agregarAlFinal(inicial.dato()) ;
		if (inicial == destino) {
            return camino;
		}
		ListaGenerica<Arista<String>> ady = grafo.ListaDeAyacentes(inicial);
		ady.comenzar();
		while(!ady.fin()) {
			Arista<String> arista = ady.proximo();
            Vertice<String> verticeSig = arista.verticeDestino();
				 if ( min >= arista.peso() && !marca[verticeSig.getPosicion()] &&!estaContenido(restringidos, verticeSig.dato())) {
					 ListaGenerica<String> resultado = paseoEnBici(grafo,marca, camino, restringidos,verticeSig,destino, 
                       min - arista.peso());
					 if (resultado != null) {
                    	return resultado;
             }
					 
				}
			}
			  marca[inicial.getPosicion()] = false;
              camino.eliminarEn(camino.tamanio());
              return null;
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


