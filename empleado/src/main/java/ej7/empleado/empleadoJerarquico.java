package ej7.empleado;

public class empleadoJerarquico extends empleado{





public empleadoJerarquico(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

public double sueldoBasico() {
	return super.sueldoBasico() + this.bonoPorCategoria();
}

public double bonoPorCategoria() {
	return 8000;
}


public double montoBasico() {
	return 4500;
}

}