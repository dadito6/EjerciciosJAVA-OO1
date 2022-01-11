package alquiler.bnb;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class reserva {

	private timeLaps dataLapse;
	private propiedad prop;
	private usuario Usuario;
	
	public reserva(usuario u, LocalDate inicio ,LocalDate fin) {
		this.Usuario=u;
		this.dataLapse.setFrom(inicio);
		this.dataLapse.setTo(fin);
	}
	
	public reserva() {
		// TODO Auto-generated constructor stub
	}
	public timeLaps getTiempo() {
		return this.dataLapse;
	}

	public propiedad disponible(LocalDate inicio , LocalDate fin) {
		 if (this.dataLapse.includesDate(inicio) && this.dataLapse.includesDate(fin)) {
			return prop;
		}else
			return null;
	}
	



}
