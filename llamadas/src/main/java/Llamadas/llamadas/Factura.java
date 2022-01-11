package Llamadas.llamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Factura {

	private Cliente cliente;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaFacturacion;
	private ArrayList<Llamada> llamadas;
	private double montoTotal;
	
	public Factura(Cliente client, LocalDate inicio, LocalDate fin, LocalDate Ffacturacion) {
		this.cliente=client;
		this.fechaInicio=inicio;
		this.fechaFin=fin;
		this.fechaFacturacion=LocalDate.now();
		this.montoTotal=0;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

	
	
	public double calcularPrecioTotal() {
	 List<Llamada> entreFechas =this.llamadas.stream().filter(a -> a.disponible(fechaInicio, fechaFin)==true).collect(Collectors.toList());
	 this.montoTotal=entreFechas.stream().mapToDouble(p -> p.getPrecio()).sum();
	 return this.montoTotal;
	}
	

}
