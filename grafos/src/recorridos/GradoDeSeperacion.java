package recorridos;

import ejercicio3.Grafo;
import ejercicio3.Vertice;

public class GradoDeSeperacion {
	// calcular el grado de separacion 
	
	// BFS
	
	
	public int MaximoGradoDeSeparacion(Grafo<String> grafo) {
	ListaGenerica<Vertice<String>> vertice = grafo.listaDeVertices();
	boolean[] marca = new boolean [vertice.tamanio() + 1];
	int MaxGrafo = 0;
	boolean seguir= true;
	while (!vertices.fin() && seguir) {
		Vertice<String> v = vertice.proximo() ;
		int Grado = gradoDeSeparacionVertice ( grafo , v, marca) ;
		if(Grado>MaxGrafo) 
			MaxGrafo=Grado;
		if(Grado==0) {
			seguir= false;
			MaxGrafo=0;	
		}
	
	}
	return MaxGrafo;
	}
	
	private int gradoDeSeparacionVertice (Grafo<T> grafo,Vertice<String> v ,boolean [] marca) {
		int cantVis= 0;	
		ColaGenerica<Vertice<String>> q = new ColaGenerica<Vertice<String>> () ;
		for ( int i=0 ; i<marca.tamanio(); i++) marca[i] = false;
		q.encolar ( v)	; q.encolar ( null) ;
		marca[v.getPosicion()] = true;
		cantVis ++;
		int gradoSep= 0;
		while(!q.esVacia()) {
			Vertice<String> v = q.desencolar() ;
			if( v!=null) {
				ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes (v);
				ady.comenzar ( );
				while ( !ady.fin() ) {
					Arista<String> arista = ady.proximo()	 ;
					if ( !marca[arista.verticeDestino().posicion()]) {
						marca[arista.verticeDestino().posicion] = true;
						cantVis++;
						q.encolar(arista.verticeDestino()) ;
					}
				}
				
				
		}else { // elem es = null entonces procese todo el nivel anterior	
			gradoSep++;
			if ( !q.esVacia()) 
				q.encolar(null) ;
			
		}
	
		
	} //  del primer while .  La cola esta vacia .  Se procesaron todos los nodos alcanzables desde el origne mandado !!!!! 
		if (cantVis<grafo.listaDeVertices().tamanio() ) 
			return 0;
		else 
			return 	gradoSep;
		
		

	}
}
