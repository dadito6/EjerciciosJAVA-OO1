package alquiler.bnb;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class propiedad {
public propiedad(String nomb, String direc, double prec, usuario u) {
		this.nombre=nomb;
		this.direccion=direc;
		this.precio=prec;
	
	}
public propiedad() {
	// TODO Auto-generated constructor stub
}
private String nombre;
private String direccion;
private Double precio;
private propiedad yo;
private ArrayList<reserva> reservas ;


public propiedad estaDisponible( LocalDate inicio, LocalDate fin) {
return 	yo =   (alquiler.bnb.propiedad) this.reservas.stream().filter(p -> p.disponible(inicio, fin) != null);
	
}
public reserva Reservar(LocalDate inicio, LocalDate fin , usuario u) {
	if (this.estaDisponible(inicio, fin)!= null) {
		reserva rese= new reserva(u, inicio, fin);
		this.reservas.add(rese);
		return rese;
	}else 
		return null;
}

public ArrayList<reserva> getReservas(){
	return this.reservas;
}


public ArrayList<reserva> dameReservasEn(LocalDate inicio , LocalDate fin){
	return (ArrayList<reserva>) this.reservas.stream().filter(p -> p.disponible(inicio, fin)!= null).collect(Collectors.toList());
}


public double precioReserva(reserva re) {
	reserva a = new reserva();
	a= (reserva) this.reservas.stream().filter(p -> p.getTiempo()== re.getTiempo());
	int cant=a.getTiempo().sizeInDays();
	return cant * this.precio;
}
public boolean eliminarReserva(reserva res) {
	reserva b = new reserva();
	b= (reserva) this.reservas.stream().filter(p -> p.getTiempo()== res.getTiempo());
	if (b.getTiempo().esPosterior()) {
		this.reservas.remove(b);
		return true;
	}else return false;
}

public double precio () {
int cant=this.reservas.stream().mapToInt(p -> p.getTiempo().sizeInDays()).sum();
return cant * this.precio();

}


	
	
	
}

