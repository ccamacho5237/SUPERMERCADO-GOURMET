package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.ProductoDao;
import co.edu.unbosque.SuperMercado.model.Producto;

@Service
public class ProductoApi {
	@Autowired
	private ProductoDao productoDao;
	
	public List<Producto> findAll() {

		return productoDao.findAll();
	}
	
	public Optional<Producto> findById(long id) {

		return productoDao.findById(id);
	}

	public boolean existById(Long id) {
		return productoDao.existsById(id);
	}

	public void save(Producto unProducto) {
		productoDao.save(unProducto);
	}
	
	public void deleteById(Long id) {
		productoDao.deleteById(id);
	}

}
