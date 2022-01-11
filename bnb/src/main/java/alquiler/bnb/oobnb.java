package alquiler.bnb;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class oobnb {

	private ArrayList <usuario> usuarios;
	private ArrayList<propiedad> propiedades;
	
	
public oobnb() {
	
}


public usuario registrarUsuario(String nomb, String direc ,String  dni) {
	usuario usu = new usuario(nomb,direc,dni);
	this.usuarios.add(usu);
	return usu;
}
public propiedad registraPropiedad(String nomb, String direc , double precio , usuario u) {
	propiedad prop= new propiedad (nomb,direc,precio,u);
	this.propiedades.add(prop);
	return prop;
}

public List<propiedad> disponiblesEntreFechas(LocalDate inicio, LocalDate fin){
	List<propiedad> entreFechas = this.propiedades
			.stream()
			.filter(a -> a.estaDisponible(inicio, fin)!= null)
			.collect(Collectors.toList());
return entreFechas;

}



}


