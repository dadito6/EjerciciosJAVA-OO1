package ej8.distribuidora;


import java.time.LocalDate;

public class Consumo {




public Consumo (LocalDate of, double i, double j) {
	this.fecha=of;
	this.consumoEnergiaActiva=i;
	this.consumoEnergiaReactiva=j;
}
private LocalDate fecha;
private double consumoEnergiaActiva;
private double consumoEnergiaReactiva;





public Double getConsumoEnergiaActiva() {
	return this.consumoEnergiaActiva;
}
public double getConsumoEnergiaReactiva() {
	return this.consumoEnergiaReactiva;
}
public LocalDate getFecha() {
	return this.fecha;
}
public double costoEnBaseA(double pre) {
	return this.consumoEnergiaActiva=pre;
	
}
public double factorDePotencia() {
	return 0;	
}
}
