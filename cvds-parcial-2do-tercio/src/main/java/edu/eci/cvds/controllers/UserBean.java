package edu.eci.cvds.controllers;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class UserBean implements Serializable{
   private String usuario;
   private String password;

   public UserBean() {
      this.usuario = "";
      this.password = "";
  }
  
   public String getUsuario() {
      return usuario;
   }

   public void setUserName(String usuario) {
      this.usuario = usuario;
   }

   public String getPassword() {
    return password;
 }

    public void setPassword(String password) {
    this.password = password;
 }
   
}
