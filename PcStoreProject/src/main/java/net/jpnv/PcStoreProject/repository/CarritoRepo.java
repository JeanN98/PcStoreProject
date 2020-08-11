package net.jpnv.PcStoreProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.jpnv.PcStoreProject.entities.cCarrito;

@Repository 
public interface CarritoRepo extends CrudRepository<cCarrito,Long>{
	

}
