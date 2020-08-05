package net.jpnv.PcStore.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name= "tecnico")
public class cTecnico extends cUsuario  {

private String servicio;


public String getServicio() {
	return servicio;
}
public void setServicio(String servicio) {
	this.servicio = servicio;
}
}
