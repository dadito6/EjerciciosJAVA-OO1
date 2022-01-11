package Llamadas.llamadas;

import java.time.LocalDate;

public class llamadaInterurbana extends Llamada{

	public llamadaInterurbana(LocalDate inicio, LocalDate fin, int dura, int remi, int desti,double dista) {
		super(inicio, fin, dura, remi, desti);
		this.distancia=dista;
		// TODO Auto-generated constructor stub
	}

	private double distancia;
	
	public double getPrecio() {
		double precio = 5;
		if (this.distancia<100) {
			precio =this.getDuracion()*2;
		}else if(this.distancia>100 && this.distancia<500){
			precio=this.getDuracion()*2.5;
		}else if (this.distancia>500) {
			precio =this.getDuracion()*3;
		}
		return precio;
	}
	

}
