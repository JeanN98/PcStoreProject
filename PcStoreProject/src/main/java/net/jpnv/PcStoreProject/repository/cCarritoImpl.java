package net.jpnv.PcStoreProject.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.jpnv.PcStoreProject.entities.cCarrito;


@Repository
public class cCarritoImpl implements CrudRepository<cCarrito,Long> {

	@Override
	public <S extends cCarrito> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends cCarrito> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<cCarrito> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<cCarrito> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<cCarrito> findAllById(Iterable<Long> ids) {
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
	public void delete(cCarrito entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends cCarrito> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
