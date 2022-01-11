package ej7.empleado;

public class gerente extends empleadoJerarquico{


	
	public gerente(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	public double montoBasico() {
		return 5700;
	}
}
