package balanza;

public class producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;



	public double precio() {
		// retorna el precio del producto

		return this.precioPorKilo * this.peso;
	}
	
	public void setPeso(double p) {
		this.peso=p;
	}
	public void setDescripcion(String d) {
		this.descripcion=d;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPrecioPorKilo(double p) {
		this.precioPorKilo=p;
	}
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}


	
	
}
