package net.jpnv.PcStoreProject.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name= "tecnico")
public class cTecnico {
	private String servicio;
	//text

	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
}
