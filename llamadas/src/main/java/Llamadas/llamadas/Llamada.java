package Llamadas.llamadas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;



public abstract class Llamada {
	
	private Date fechaInicio;
	private Date fechaFin;
	private int duracion;
	private int numRemitente;
	private int numDestinatario;
	
	public Llamada (LocalDate inicio , LocalDate fin, int dura , int remi , int desti) {
		this.fechaFin=fin;
		this.fechaInicio=inicio;
		this.duracion=dura;
		this.numRemitente=remi;
		this.numDestinatario=desti;
		
	}

public boolean disponible ( Date inicio , Date fin) {
	
	return includesDate(inicio) && includesDate (fin) ;
		
}


public int getDuracion() {
	return duracion;
}
public Date getInicio() {
	return this.fechaInicio;
}

public Date getFin() {
	return this.fechaFin;
}

public abstract double getPrecio();

public boolean includesDate( Date fin) {
	return fin.equals(this.fechaInicio)  ||  fin.equals(this.fechaFin) || ( fin.after(this.fechaInicio) && fin.before(this.fechaFin));
}
}
