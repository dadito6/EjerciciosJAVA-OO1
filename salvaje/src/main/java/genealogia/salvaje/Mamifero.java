package genealogia.salvaje;

import java.time.LocalDate;

public class Mamifero {

	private Mamifero padre;
	private Mamifero madre;
	private LocalDate fecha;
	private String especie;
	private String identificador;
	
	public Mamifero (String iden) {
	}
	public Mamifero() {
		
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public void setPadre(Mamifero pad) {
		this.padre=pad;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String i) {
		this.identificador=i;
	}
	public Mamifero getMadre() {
	if (this.madre!=null) {
		return this.madre;
	}
	else return null;
	}
	public void setMadre(Mamifero ma) {
		this.madre=ma;
	}
	public LocalDate getFecha() {
		return this.fecha;
		
	}
	public void setFecha(LocalDate fe) {
		this.fecha=fe;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.madre!= null) {
			return this.madre.getMadre();
		} else {
				return null;
			}
		
	}

	
	public Mamifero getAbueloMaterno() {
		if(this.madre!= null) {
			return this.madre.getPadre();
		}else {
			return null;
		}
		
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre!=null) {
			return this.padre.getPadre();
		}else {
			return null;
		}
	}
	public void setEspecie(String espe) {
		this.especie=espe;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public boolean tieneComoAncestroA(Mamifero um) {
		boolean bol=false;
		return this.tieneComoAncestroA(um, bol);
		
	}
	
	
	public boolean tieneComoAncestroA( Mamifero unma , boolean bo) {
		if(!bo) {
			if(this.madre!=null) {
				if(this.getMadre().equals(unma)){
					return true;
				}else {
					bo=this.madre.tieneComoAncestroA(unma, bo);
				}
			}
			if(this.padre!=null) {
				if(this.getPadre().equals(unma)) {
					return true;
				}else {
					bo=this.padre.tieneComoAncestroA(unma, bo);
				}
			}
		
		}
		return bo;
		
	}
	
}
