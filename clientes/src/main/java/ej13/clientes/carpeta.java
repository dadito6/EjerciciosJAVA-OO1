package ej13.clientes;

import java.util.ArrayList;

public class carpeta {

	
	private ArrayList<Email> emails;
	
public void agregarE(Email em) {
	this.emails.add(em);
}
	
public ArrayList<Email> getEma() {
	return this.emails;
}

public int getTamaño() {
	int tam = this.emails
			.stream()
			.mapToInt(Email::getTamaño)
			.sum();
	return tam;
	
	
}

public Email obtenerEmail(String texto) {
	return (Email) this.emails.stream().filter(p -> p.getTitulo().equals(texto));
}
}

