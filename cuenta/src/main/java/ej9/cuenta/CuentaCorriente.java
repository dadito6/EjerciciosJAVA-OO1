package ej9.cuenta;

public class CuentaCorriente extends Cuenta{
private double limiteDescubierto;

public CuentaCorriente() {
	this.limiteDescubierto=0;
}

public double getLimiteDescubierto() {
	return this.limiteDescubierto;
}

public void setLimiteDescubierto(double limite) {
	this.limiteDescubierto=limite;
}

public boolean extraerL(double monto) {
	if(this.puedeExtraer(monto)) {
		super.extraer(monto);
		return true;	
	}else return false;
	
} 

public void depositar(double monto) {
	super.depositar(monto);
}
public  void extraerSinControlar(double cantidadDinero) {
	double a= super.getSaldo() - cantidadDinero;
	super.setSaldo(a);
	
}

public boolean puedeExtraer(double cant) {
	if ( super.getSaldo()-cant > this.getLimiteDescubierto()) {
		return true;
	}else return false;
}
}
