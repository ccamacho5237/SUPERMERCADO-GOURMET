package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.ProveedorDao;
import co.edu.unbosque.SuperMercado.model.Proveedor;

@Service
public class ProveedorApi {
	@Autowired
	private ProveedorDao proveedorDao;
	
	public List<Proveedor> findAll() {

		return proveedorDao.findAll();
	}
	
	public Optional<Proveedor> findById(long id) {

		return proveedorDao.findById(id);
	}

	public boolean existById(Long id) {
		return proveedorDao.existsById(id);
	}

	public void save(Proveedor unProveedor) {
		proveedorDao.save(unProveedor);
	}
	
	public void deleteById(Long id) {
		proveedorDao.deleteById(id);
	}
	
	

}
