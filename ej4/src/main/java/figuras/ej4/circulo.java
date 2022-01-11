package figuras.ej4;

public class circulo implements CanalC{
	private double diametro;
	private double radio;

	public circulo(double dia, double ra) {
		this.diametro=dia;
		this.radio=ra;
	}
	public circulo() {
		
	}
	public double getDiametro() {
		return this.radio *2;
	}
	public void setDiametro(double dia) {
		this.diametro=dia;
	}
	public double getRadio() {
		return this.getDiametro() / 2;
	}
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	public double getArea() {
		return Math.pow(this.radio, 2) * Math.PI;
	}
	public void setRadio(double ra) {
		this.radio=ra;
	}
}
