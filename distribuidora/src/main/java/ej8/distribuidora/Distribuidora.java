package ej8.distribuidora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Distribuidora {
private double precioKWH;
private List<Usuario> usuarios;

public Distribuidora (double precio) {
	this.usuarios = new ArrayList<Usuario>();
	this.precioKWH=precio;
}
public void agregarUsuario(Usuario usu) {
	usuarios.add(usu);
}


public double getPrecioKw() {
	return this.precioKWH;
}

public Double  consumoTotalActiva() {
	
	Double total = this.usuarios
		    .stream()
		    .mapToDouble(Usuario::ultimoConsumoActiva)
		    .sum();
	
	return total;
	
	
}
public void setPrecioKWH(double kd) {
	this.precioKWH=kd;	
}
public List<Usuario> getUsuarios() {
	return new ArrayList<>(this.usuarios);
}

public List<Factura> facturar() {
	List<Factura> result = this.usuarios
		.stream()
		.map((Usuario u) -> u.facturarEnBaseA(this.getPrecioKw()))
		.collect(Collectors.toList());
	return result;
}




}
