package edu.eci.cvds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "USERS")
public class Users {
	@Id
	@Column(name= "USUARIO")
	private String usuario;
	@Column(name= "PASSWORD")
	private String password;
	

	public String  getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Users(){
		
	}
	public Users(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;

	}
	
}