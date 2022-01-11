package figuras.ej4;

public class cuadrado implements CanalC{
	private double lado;
	
	public cuadrado(double la) {
		this.lado=la;
	}
	public cuadrado() {
		
	}
	public double getLado() {
		return this.lado;
	}
	public void setLado(double la) {
		this.lado=la;
	}
	public double getArea() {
		return this.lado * this.lado;
	}
	public double getPerimetro() {
		return this.lado + this.lado + this.lado + this.lado;
	}
	@Override
	public double getDiametro() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getRadio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setRadio(double e) {
		// TODO Auto-generated method stub
		
	}

}
