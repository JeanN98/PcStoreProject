package net.jpnv.PcStoreProject.entities;
//comentario

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class cProducto {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id ;
	    private String nombre;
	 @Column(name = "precio_unitario")
	    private float precioUnitario;
	 @Column(name = "precio_venta")
	    private float precioVenta;
	    private String descripcion;
	    private String tipo;
        
	    private UUID foto;
	    
	  
	    
	    
	    /*Metodos set y get*/
	    public void SetId(Long ID) {
	    	this.id= ID;  
	    	
	    }
	    
	    public Long getId() {
	    	return id; 
	    }
	    
	    
		public float getPrecioUnitario() {
			return precioUnitario;
		}
		public void setPrecioUnitario(float precioUnitario) {
			this.precioUnitario = precioUnitario;
		}
		
		
		public float getPrecioVenta() {
			return precioVenta;
		}
		public void setPrecioVenta(float precioVenta) {
			this.precioVenta = precioVenta;
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		public UUID getFoto() {
			return foto;
		}
		public void setFoto(UUID foto) {
			this.foto = foto;
		}
		
		
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	  
}
