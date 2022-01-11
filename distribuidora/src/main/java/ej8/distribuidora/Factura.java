package ej8.distribuidora;

import java.sql.Date;
import java.time.LocalDate;

public class Factura {

public Factura(double montoE,Usuario usu,double descuento) {
		this.montoEnergiaActiva=montoE;
		this.Descuento=descuento;
		this.fecha= LocalDate.now();
		this.usuario=usu;
		// TODO Auto-generated constructor stub
	}

private double montoEnergiaActiva;
private double Descuento;
private LocalDate fecha;

private Usuario usuario;




public double montoTotal(double diner) {
	double tenPorciento=0;
	if (usuario.aplicoDescuento()) {
		 tenPorciento= usuario.ultimoConsumoActiva()*10 / 100;
	}
	return usuario.ultimoConsumoActiva()- tenPorciento * diner ;
}

public Usuario getUser() {
	return this.usuario;
}
public void setMontoEnergiaActica(double mon) {
	this.montoEnergiaActiva=mon;
}
public LocalDate getFecha() {
	return this.fecha;
}
public double getDescuento() {
	return this.Descuento;
}
public double getMontoEnergiaActiva() {
	return this.montoEnergiaActiva;
}



	
}