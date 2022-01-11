package Llamadas.llamadas;


import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;

public class llamadaInternacional extends Llamada{

	public llamadaInternacional(LocalDate inicio, LocalDate fin, int dura, int remi, int desti,String paisO ,String paisD) {
		super(inicio, fin, dura, remi, desti);
		this.paisDestino=paisD;
		this.paisOrigen=paisO;
		// TODO Auto-generated constructor stub
	}
	private String paisOrigen;
	private String paisDestino;
	
	
	public double getPrecio() {
		double precio=0;
		 String strDateFormat = "HH:mm:ss.SSS" ; // El formato de fecha está especificado  
	     SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
	     String dateString = objSDF.format( new Date()   );
	     Date   ini      = objSDF.parse ( "08:00.00.000" ); 
	     
	     String strDate = "HH:mm:ss.SSS" ; // El formato de fecha está especificado  
	     SimpleDateFormat objSDf = new SimpleDateFormat(strDate);
	     String dateStrinG = objSDf.format( new Date()   );
	     Date  fin     = objSDF.parse ( "20:00.00.000" );
	    
		if ( super.includesDate(ini) &&  super.includesDate(fin)) {
			precio=this.getDuracion()*4;
		}else precio=this.getDuracion()*3;
	
	return precio;
	
	
}
}
