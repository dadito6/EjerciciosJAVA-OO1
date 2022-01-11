package ejercicioMafia;

public class Sitio {
	private String nombre;
	private boolean tieneMafia;
	
	
	
	public String getnombre() {
		return nombre ;
		
	}
	public void setnombre(String nom) {
		nombre=nom;
	}
	public boolean getTieneMafia() {
		return tieneMafia;
	}
	public void setMafia(boolean tieneMaf) {
		tieneMafia=tieneMaf;
	}
	public boolean equals(Object arg0) {
		if(arg0 instanceof Sitio ) 
			return this.getnombre().equals(((Sitio)	arg0).getnombre() ) ;
		
		else return false;
	
	
	}
	

}
