package alquiler.bnb;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class timeLaps {
private LocalDate from;
private LocalDate To;

public timeLaps(LocalDate fromm, LocalDate too) {
	this.from=fromm;
	this.To=too;
}
	


public LocalDate getFrom() {
	//LocalDate hoy = LocalDate.parse("1999-11-30");
	return this.from;
}

public void setFrom(LocalDate re) {
	this.from=re;
}
public LocalDate getTo() {
	return this.To;
}
public void setTo(LocalDate too) {
	this.To=too;
}
	

public int sizeInDays() {
//"retorna la cantidad de días entre la fecha 'from' y la fecha 'to'"
	
	return (int) this.from.until(this.To, ChronoUnit.DAYS);
}


public boolean includesDate( LocalDate inicio) {
	return inicio.isEqual(this.from)  ||  inicio.isEqual(this.To) || ( inicio.isAfter(this.from) && inicio.isBefore(this.To));
}
public boolean esPosterior() {
	return this.from.isAfter(this.To);
}

}
