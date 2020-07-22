package net.jpnv.PcStore.entities;


import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class cProducto {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long Id ;
	    private float precioUnitario;
	    private float precioVenta;
     private String nombre;
	    private UUID foto;
	    
	    private String descripcion;
	    private String tipo;
	    /*Metodos set*/
	    public void setId (long Id) {this.Id= Id;}
	    public void setPrecioUnitario(float PU) {this.precioUnitario= PU;}
	    public void setPrecioVenta(float PV) {this.precioVenta= PV;}
	    public void setFoto(UUID foto) {this.foto= foto;}
	    public void setDescripcion(String descripcion) {this.descripcion=descripcion;}
	    public void setTipo(String tipo) {this.tipo= tipo;}
	    public void setNombre(String nombre) {this.nombre= nombre;}
	    
	    /*Metodos get*/
	    public long  getId () {return Id;}
	    public float getPrecioUnitario() {return precioUnitario;}
	    public float getPrecioVenta() {return precioVenta;}
	    public UUID getFoto() {return foto;}
	    public String getDescripcion() {return descripcion;}
	    public String getTipo() {return tipo;}
	    public String getNombre() {return nombre;}
}
