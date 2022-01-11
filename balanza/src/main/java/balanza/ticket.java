package balanza;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ticket{
	private double pesoTotal;
	private List<producto> productos;
	private LocalDate fecha;	
	
	public ticket(double pesoT ,LocalDate f) {
		this.pesoTotal=pesoT;
		this.fecha=f;
		this.productos= new ArrayList<producto>();
	}
	
	
	public double impuesto() {
		//aplica el impuesto iva a un precioTotal
		double a=0;
		a=this.calcularTotal()*21 / 100;
		return  a += this.calcularTotal() ;
	}
	public double getpesoTotal() {
		return this.pesoTotal;
	}
	
	public List<producto> getProductos() {
		return this.productos;
	}
	
	public LocalDate getfecha() {
		return this.fecha;
	}
	
	public double calcularTotal() {
		Double totalI = this.productos 
			    .stream()
			    .mapToDouble(producto::precio) 
			    .sum();
	
		
		 return totalI;
		
		
	}

}
