package balanza;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;





public class balanza{
	private double pesoTotal;
	private List<producto> productos;
	
	
	public balanza() {
		this.pesoTotal=0;
		this.productos = new ArrayList<producto>();
	}
	

	public void ponerEnCero() {
		productos.clear();

		this.pesoTotal=0;
	}
	public List<producto> getProductos() {
		return this.productos;
	}
	public	double getPesoTotal() {
		return this.pesoTotal;
	}
	
	
	public double calcularTotal() {
		Double totalI = this.productos 
			    .stream()
			    .mapToDouble(producto::precio) 
			    .sum();
		
		
		 return totalI;
		
		
	}
	
	public void agregarProducto(producto p) {		
		this.productos.add(p);
	}

	public ticket emitirTicket() {
		ticket ticket= new ticket(this.pesoTotal,LocalDate.now());
		return ticket;
		
	
	}
	



}
