package figuras.ej4;

public class Cuerpos3D {
	
	private CanalC caraBasal;
	private double altura;

	public Cuerpos3D() {
		caraBasal = new circulo();
		caraBasal= new cuadrado();
		
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double a) {
		this.altura=a;
	}
	
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura();
	}

	
	public double getCaraBasal() {
		// tomamos el radio del circulo 
		return this.caraBasal.getRadio();   // dado que el radio del cilindro es el radio de una base.
	}
	
	public void setCaraBasal(CanalC	 a) {
		this.caraBasal.setRadio(a.getRadio());
	}
	public double getSuperficieExterior() {
		return (this.caraBasal.getPerimetro() * this.getAltura()) + ( this.caraBasal.getArea()  * 2);
	}
	
	
}
