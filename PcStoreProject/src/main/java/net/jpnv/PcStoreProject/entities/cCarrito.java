package net.jpnv.PcStoreProject.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cCarrito {
	
	@Id
	private int numCarrito = 1;
	private ArrayList<cProducto> producto = new ArrayList<cProducto>();
	private float totalPrecio=0;
	
	

	public ArrayList<cProducto> agregarProducto(cProducto Produ) {
		producto.add(Produ);		
		return producto;
		
	}
	
	
	public ArrayList<cProducto> quitarProducto(cProducto Produ) {
		producto.remove(Produ);		
		return producto;
	}

	
	public ArrayList<cProducto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<cProducto> producto) {
		this.producto = producto;
	}

	public int getNumCarrito() {
		return numCarrito;
	}

	public void setNumCarrito(int numCarrito) {
		this.numCarrito = numCarrito;
	}

	public float getTotalPrecio() {
		return totalPrecio;
	}

	public void setTotalPrecio(float totalPrecio) {
		this.totalPrecio = totalPrecio;
	}			
	
	
	

}
