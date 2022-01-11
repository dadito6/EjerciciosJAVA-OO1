package ej9.cuenta;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo=0;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double num) {
		this.saldo=num;
	}
	public void depositar(double dinero) {
		this.saldo+=dinero;
	}
	protected abstract void extraerSinControlar(double cantidadDinero) ;
	
	
	public void cobrarComision(double mont) {
		this.saldo-=mont;
	}
	
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}else return false;
	}
	protected abstract boolean puedeExtraer(double mont)  ;
		
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}else return false;
	}
}
