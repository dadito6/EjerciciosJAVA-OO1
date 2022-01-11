package ej7.empleado;

public class empleado {
private String nombre;
	
public empleado(String nom) {
	this.nombre=nom;
}

public double montoBasico() {
	return 35000;
}
public double aportes() {
	return 13500;
}

public double sueldoBasico() {
	return this.montoBasico() + this.aportes();
	
}
public String getNombre() {
	return this.getNombre();
}


}
