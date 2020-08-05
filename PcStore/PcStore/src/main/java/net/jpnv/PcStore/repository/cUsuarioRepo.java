package net.jpnv.PcStore.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import net.jpnv.PcStore.entities.cUsuario;


public interface  cUsuarioRepo extends CrudRepository<cUsuario,Long> {
    List<cUsuario> findbynombre(String nombre); 
    List<cUsuario> findTelefono(String Telefono);
}
//text