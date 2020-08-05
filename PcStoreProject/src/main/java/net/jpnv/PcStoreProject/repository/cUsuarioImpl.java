package net.jpnv.PcStoreProject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.jpnv.PcStoreProject.entities.cUsuario;

@Repository
@Qualifier("Repository2")
public class cUsuarioImpl implements cUsuarioRepo{

	@Override
	public <S extends cUsuario> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends cUsuario> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}//text

	@Override
	public Optional<cUsuario> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<cUsuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<cUsuario> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(cUsuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends cUsuario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<cUsuario> findbynombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<cUsuario> findTelefono(String Telefono) {
		// TODO Auto-generated method stub
		return null;
	}

}