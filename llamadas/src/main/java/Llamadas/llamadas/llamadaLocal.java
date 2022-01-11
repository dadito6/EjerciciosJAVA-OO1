package Llamadas.llamadas;

import java.time.LocalDate;

public class llamadaLocal extends Llamada{

	public llamadaLocal(LocalDate inicio, LocalDate fin, int dura, int remi, int desti) {
		super(inicio, fin, dura, remi, desti);
		// TODO Auto-generated constructor stub
	}

	public double getPrecio() {
		return this.getDuracion();
	}
	

}
