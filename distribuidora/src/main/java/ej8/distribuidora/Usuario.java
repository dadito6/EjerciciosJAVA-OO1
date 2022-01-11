package ej8.distribuidora;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Usuario {
private String domicilio;
private String nombre;
private List<Consumo> Consumos;
private List<Factura> facturas;


	
	public Usuario(String dom ,String nomb) {
		this.domicilio=dom;
		this.nombre=nomb;
		this.Consumos = new ArrayList<Consumo>();
		this.facturas = new ArrayList<Factura>();
	}
	
	public void agregarMedicion(Consumo con) {
		this.Consumos.add(con);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public Double ultimoConsumoActiva() {	
		Consumo total = this.Consumos.stream().max((Consumo e1, Consumo e2)->e1.getFecha().compareTo(e2.getFecha())).get();
		return total.getConsumoEnergiaActiva();
		
	}
	public Consumo UltimoConsumo() {
		return this.Consumos.get(this.Consumos.size());
		
	}
	
	public Double ultimoConsumoReactiva() {	
		Consumo total = this.Consumos.stream().max((Consumo e1, Consumo e2)->e1.getFecha().compareTo(e2.getFecha())).get();		
		return total.getConsumoEnergiaReactiva();
	}
	
	public boolean aplicoDescuento() {
		
		if( this.ultimoConsumoActiva() / Math.pow(this.ultimoConsumoActiva(), 2) + Math.pow(this.ultimoConsumoReactiva(), 2)> 0.8) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Factura> getFacturas() {
		return this.facturas;
	}



	public List<Consumo> getConsumos() {
		return this.Consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.Consumos = consumos;
	}

	public Factura facturarEnBaseA(double precio) 	{
		Factura fa = new Factura(800,this,10);
		fa.montoTotal(precio);
		this.facturas.add(fa);
		return fa;
			
		
		
	}



	
	

}
