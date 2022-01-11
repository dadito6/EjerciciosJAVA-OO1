package alquiler.bnb;


import java.time.LocalDate;
import java.util.ArrayList;


public class usuario {

	public usuario(String nomb, String direc, String dni2) {
		this.nombre=nomb;
		this.direccion=direc;
		this.dni=dni2;
	}
	public usuario() {
		// TODO Auto-generated constructor stub
	}
	private ArrayList<reserva> reservas;
	private ArrayList<propiedad> propiedades;
	private String nombre;
	private String direccion;
	private String dni;
	
	public ArrayList<reserva> MisReservas(){
		return this.reservas;
	}
	
	
	public ArrayList<propiedad> MisPropiedades(){
		return this.propiedades;
	}

	public String getDni() {
		return this.dni;
	}
	
	
public double IngresosTotales(usuario us, LocalDate inicio, LocalDate fin) {
		ArrayList<propiedad> prop = new  ArrayList<propiedad>();
		prop = (ArrayList<propiedad>) us.MisPropiedades().stream().filter(p -> p.dameReservasEn(inicio,fin)!= null);
		return prop.stream().mapToDouble(propiedad::precio).sum();
		
	
		
	}
}
	

