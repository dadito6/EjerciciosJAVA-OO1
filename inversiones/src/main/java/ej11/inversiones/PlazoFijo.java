package ej11.inversiones;

import java.sql.Date;
import java.time.Duration;


public class PlazoFijo implements Inter{
private CharSequence fecha;
private double Mdespositado;
private double porcentaje;

public double valorTotal() {
	  Duration duration = Duration.parse(this.fecha);
      System.out.println("Duration   : " + duration);
      int dias=  (int) duration.toDays();
      double interes= this.Mdespositado * this.porcentaje;
      interes*=dias;
      return this.Mdespositado + interes;
}


}
