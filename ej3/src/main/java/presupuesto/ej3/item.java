package presupuesto.ej3;


public class item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	/*public item(String unDetalle, int cant , double costoU) {
		this.detalle=unDetalle;
		this.cantidad=cant;
		this.costoUnitario=costoU;
		
	}

	*/

	
	public item detalle(String a) {
		this.detalle=a;
		return this;
	}
	public item costoUnitario(double c) {
		this.costoUnitario=c;
		return this;
	}
	public item cantidad(int a) {
		this.cantidad=a;
		return this;
	}
	
	//getters
	public String getDetalle() {
		return this.detalle;
	}
	public int getCantidad() {
		return this.cantidad;
	}

	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.cantidad * this.costoUnitario;
	}
}
