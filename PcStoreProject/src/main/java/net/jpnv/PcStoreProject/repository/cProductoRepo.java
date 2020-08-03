package net.jpnv.PcStoreProject.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import net.jpnv.PcStoreProject.entities.*;

public interface cProductoRepo extends CrudRepository <cProducto, Long> {
	List<cProducto> findById(String Id);
	List <cProducto> findBynombre(String nombre);
	List <cProducto> findByprecioVenta(float PV);
	}
