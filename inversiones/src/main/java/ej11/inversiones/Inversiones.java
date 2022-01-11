package ej11.inversiones;


import java.util.function.ToDoubleFunction;





public   class Inversiones {
private Inter Contenidos;

public Inversiones() {
	Contenidos = new PlazoFijo();
	Contenidos = new EnAcciones();
}
	
	public Double valorTotal() {
		return this.Contenidos.valorTotal();
		
		
	}
}
