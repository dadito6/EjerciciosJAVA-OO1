package red.alambrado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Farola {
	private boolean estado;
	private List<Farola> vecinos;
	
	public Farola() {
		this.vecinos=new  ArrayList<Farola>();
		this.estado=false;
		
	}
	
	public boolean isOn() {
		return this.estado;
	}
	
	public List<Farola> getNeighbors() {
		
			return this.vecinos;
		
	}
	public boolean getEstado() {
		return this.estado;
	}


	public void pairWithNeighbor(Farola farolaDos) {
		if(this.vecinos.contains(farolaDos)) {
			this.vecinos.add(farolaDos);
			farolaDos.vecinos.add(this);
		}
	}
	public void setEstado(boolean a) {
		this.estado=a;
	}

	public void turnOn() {
		if(this.estado==false) {
			this.estado=true;
			if(!this.vecinos.isEmpty()) {
				this.vecinos.stream().forEach(Farola -> Farola.setEstado(true));
				
			}
		}
	
	}
	public	void turnOff() {
		if(this.estado==true) {
			this.estado=false;
			if(!this.vecinos.isEmpty()) {
				this.vecinos.stream().forEach(Farola -> Farola.setEstado(false));
		}
	
	}
	}
	

	

}
