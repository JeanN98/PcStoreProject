package net.jpnv.PcStore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.jpnv.PcStore.entities.cProducto;
import net.jpnv.PcStore.repository.cProductoRepo;


@Repository
@Qualifier("Repository1")
public class cProductoImpl implements cProductoRepo {

	@Override
	public <S extends cProducto> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	//text
	@Override
	public <S extends cProducto> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<cProducto> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<cProducto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<cProducto> findAllById(Iterable<Long> ids) {
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
	public void delete(cProducto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends cProducto> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<cProducto> findById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<cProducto> findBynombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<cProducto> findByprecioVenta(float PV) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String EnviarAlgo() {
		return "Hola como estas";
		
	}

}
