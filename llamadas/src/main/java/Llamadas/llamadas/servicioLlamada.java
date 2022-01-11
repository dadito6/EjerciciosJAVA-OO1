package Llamadas.llamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class servicioLlamada {

	private ArrayList<numero> numeros;
	private ArrayList<Cliente> clientes;
	private ArrayList<Llamada> llamadas;
	private ArrayList<Factura> facturas;
	
public void darDeAltaUnCliente(String nomb , String direc , int dni) {
	int numb=this.numeros.get(this.numeros.size()).getNumber();
	//Cliente Usuario = (Cliente) this.clientes.stream().filter(p -> p.getNombre().equals(nomb) && p.getDireccion().equals(direc));
	clienteOne nuevo = new clienteOne(nomb,direc,numb,dni);
	this.clientes.add(nuevo);
}


public void darDeAltaUnClienteJuridico(String nomb , String direc , int cuit, String tipo) {
	int numb=this.numeros.get(this.numeros.size()).getNumber();
	clienteJuridico nue = new clienteJuridico ( nomb ,direc, numb , cuit , tipo);
	this.clientes.add(nue);

}
public void agregarNumero(int num) {
	numero nume= new numero(num);
	this.numeros.add(nume);
}

public Llamada registrarLlamadaLocal(LocalDate fechaInicio , LocalDate fechaFin, int duracion , int numRemitente, int numDestino ) {
 llamadaLocal local = new llamadaLocal(fechaInicio ,fechaFin, duracion, numRemitente, numDestino);
 this.llamadas.add(local);
 return local;
}

public ArrayList<numero> getNumeros(){
	return this.numeros;
}
public Llamada registrarLlamadaInternacional(LocalDate fechaInicio , LocalDate fechaFin, int duracion , int numRemitente, int numDestino , String paisO, String paisD) {
	 llamadaInternacional local = new llamadaInternacional(fechaInicio ,fechaFin, duracion, numRemitente, numDestino , paisO , paisD);
	 this.llamadas.add(local);
	 return local;
	
	}

public Llamada registrarLlamadaInternacional(LocalDate fechaInicio , LocalDate fechaFin, int duracion , int numRemitente, int numDestino , double distancia) {
	 llamadaInterurbana local = new llamadaInterurbana(fechaInicio ,fechaFin, duracion, numRemitente, numDestino , distancia);
	 this.llamadas.add(local);
	 return local;
	
	}

public Factura dameFactura(Cliente cli , LocalDate fechaI ,LocalDate fechaF ) {
	Factura fac = new Factura (cli ,fechaI,fechaF, fechaF);
	fac.calcularPrecioTotal();
	return fac;
	
	
}
public ArrayList<Cliente> getCLi(){
	return this.clientes;
}
 
public ArrayList<Llamada> getLLamadas(){
	return this.llamadas;
}

}
