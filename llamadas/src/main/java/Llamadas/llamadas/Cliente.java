package Llamadas.llamadas;

import java.util.ArrayList;

public abstract class Cliente {
private String nombre;
private String direccion;
private int numero;
private ArrayList<Llamada> llamadas;

public Cliente (String nomb, String dire , int num) {
	this.nombre=nomb;
	this.direccion=dire;
	this.numero=num;
}

public String getNombre() {
	return this.nombre;
}

public String getDireccion() {
	return this.direccion;
}
public int getNumero() {
	return this.numero;
}
	

}

