package edu.eci.cvds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CONFIG")
public class Configuration {
	@Id
	@Column(name= "PROPIEDAD")
	private String propiedad;
	@Column(name= "VALOR")
	private String valor;
	

	public String  getPropiedad() {
		return propiedad;
	}
	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public Configuration(){
		
	}
	public Configuration(String propiedad, String valor) {
        this.propiedad = propiedad;
        this.valor = valor;

	}
	
}