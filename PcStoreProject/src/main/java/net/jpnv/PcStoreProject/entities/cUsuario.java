package net.jpnv.PcStoreProject.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 

public class cUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String nombre;
	private String telefono;
	
	public void setId(Long Id) {
		this.id= Id; 
	}
	public Long getId() {
		return id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String Telefono) {
		telefono = Telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String Nombre) {
		nombre = Nombre;
	}
	
	
}
