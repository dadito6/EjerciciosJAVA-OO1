package presupuesto.ej3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class presupuesto {

	private LocalDate fecha;
	private String cliente;
	private List<item> items;
	
	
	public presupuesto() {
		this.fecha=LocalDate.now();
		this.items= new ArrayList<item>();
	}
	
	public void agregarItem(item I) {
		this.items.add(I);
		
	}
	
	public presupuesto cliente(String C) {
		this.cliente=C;
		return this;
	
	}
	

	public Double calcularTotal() {
		if (items.isEmpty()){
			return  (double) 0;
		}else {
		Double totalI = this.items 
			    .stream()
			    .mapToDouble(item::costo) ///en la clase item hay un procedimiento que nos brinda el costo total teniendo en cuenta la cantidad de estos
			    .sum();
		// Chequeo si la suma de los salarios es 5100.
		
		//assertEquals(totalI.floatValue(),5100f,0f);
		
		 return totalI;
		
		
	}
	
	

	
	}
}
