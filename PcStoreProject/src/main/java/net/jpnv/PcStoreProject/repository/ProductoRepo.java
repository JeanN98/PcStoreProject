package net.jpnv.PcStoreProject.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.jpnv.PcStoreProject.entities.cProducto;

@Repository 
public interface ProductoRepo extends CrudRepository<cProducto,Long>{
List<cProducto> findByNombre(String nombre);

}
