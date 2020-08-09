package net.jpnv.PcStoreProject.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.jpnv.PcStoreProject.entities.cUsuario;

@Repository 
public interface UsuarioRepo extends CrudRepository<cUsuario,Long>{
	
List<cUsuario> findByTelefono(String telefono); 
List<cUsuario> findByNombre(String nombre); 
}
