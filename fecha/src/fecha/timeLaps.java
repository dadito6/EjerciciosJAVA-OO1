package fecha;

import java.time.LocalDate;

import jdk.jfr.Period;

public class timeLaps {

public LocalDate getFrom() {
	LocalDate hoy = LocalDate.parse("1999-11-30");
	return hoy;
}
public LocalDate getTo() {
	return LocalDate.now();
}
	

public int sizeInDays() {
//"retorna la cantidad de días entre la fecha 'from' y la fecha 'to'"
	
	java.time.Period periodo= this.getFrom().until(this.getTo());
	int dias = periodo.getDays();
	return dias;
}


public boolean includesDate( LocalDate recib) {
//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
if (recib.isAfter(this.getFrom()) && recib.isBefore(this.getTo())) {
	return true;
}else
	return false;
}
}

	

