package EjCaminoMinConRestrincion;



public class parcial {
	
	public ListaGenerica<String> resolver(Grafo<String> ciudades, String origen, String destino, int distanciaEvitar, String ciudadTransitar) {
		boolean[] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
		ListaGenerica<String> camino= new ListaGenerica <String> () ;
		Vertice<String> inicial= origen;
		Vertice<String> destino= destino ;
		paseoEnBici(grafo,marca, list,restringidos,inicial, destino ,maxTiempo);
		
		
		return list;
		}
	

	
	private void paseoEnBici(Grafo<String> grafo, boolean[] marca,ListaEnlazadaGenerica<String> camino ,ListaEnlazadaGenerica<String> restringidos, Vertice<String> inicial, Vertice<String> destino, int min) {
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
