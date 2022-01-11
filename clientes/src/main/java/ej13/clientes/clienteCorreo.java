package ej13.clientes;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;




public class clienteCorreo {

private ArrayList<carpeta> carpetas ;
private carpeta inbox;


public void recibir ( Email email){
	this.inbox.agregarE(email);
	
}
public void mover ( Email em , carpeta destino , carpeta origen) {
	origen.getEma().removeIf((Predicate<? super Email>) em);
	destino.agregarE(em);
}


public Email buscar (String texto) {
	// el primero que encontro que coincida con el parametro pasado

	Email encontrado = this.inbox.obtenerEmail(texto);
	if ( encontrado == null)
		encontrado = this.carpetas.stream().map(c -> c.obtenerEmail(texto)).filter(e -> (e!=null)).findFirst().get();
	return encontrado;
	
	
}

public Integer espacioOcupado() {
	
	Integer espacio= this.carpetas.stream().mapToInt(carpeta::getTamaño).sum();
	return espacio;			
}


	 

}






