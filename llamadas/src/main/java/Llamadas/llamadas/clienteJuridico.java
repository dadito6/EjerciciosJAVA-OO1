package Llamadas.llamadas;

public class clienteJuridico extends Cliente {

	
	public clienteJuridico(String nomb, String dire, int num, int cuitt, String tip) {
		super(nomb, dire, num);
		this.cuit=cuitt;
		this.tipo=tip;
		// TODO Auto-generated constructor stub
	}
	private int cuit;
	private String tipo;
	





}
