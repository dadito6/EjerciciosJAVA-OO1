package ej9.cuenta;

public class CajaDeAhorro extends Cuenta{
	
	
	public boolean extraer(double mont) {
		double dosPorciento= mont *2 / 100	;
		if (this.puedeExtraer(mont+dosPorciento)) {
			 this.extraerSinControlar(mont);
			 super.cobrarComision(dosPorciento);  //debemos cobrarle el 2% de la operacion
			 return true;
		}else return false;
	}
	public void depositar( double dinero) {
		double dosPorciento= dinero *2 / 100	;
		super.cobrarComision(dosPorciento); // el costo de la operacion
		super.depositar(dinero);
	}
	public boolean transeferirA( double monto , Cuenta destino) {
		double dosPorciento= monto *2 / 100	;
		if(this.puedeExtraer(monto + dosPorciento)) {
			this.extraerSinControlar(monto);
			destino.depositar(monto);
			super.cobrarComision(dosPorciento);
			return true;
		}else return false;
	}
	
	public  void extraerSinControlar(double cantidadDinero) {

		super.setSaldo(super.getSaldo()-cantidadDinero);
		
	}
	public boolean puedeExtraer(double cant) {
		if ( cant <= super.getSaldo()) {
			return true;
		}else return false;
	}

	

}
