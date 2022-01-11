
package ej11.inversiones;

public class EnAcciones implements Inter {
	
private String nombre;
private Integer cant;
private double valorUnitario;

public double valorTotal() {
	return this.valorUnitario * this.cant;
}

	
}
