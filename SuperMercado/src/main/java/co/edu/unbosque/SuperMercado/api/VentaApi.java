package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.VentaDao;

import co.edu.unbosque.SuperMercado.model.Venta;

@Service
public class VentaApi {
	@Autowired
	private VentaDao ventaDao;
	
	public List<Venta> findAll() {

		return ventaDao.findAll();
	}
	
	public Optional<Venta> findById(long id) {

		return ventaDao.findById(id);
	}

	public boolean existById(Long id) {
		return ventaDao.existsById(id);
	}

	public void save(Venta unaVenta) {
		ventaDao.save(unaVenta);
	}
	
	public void deleteById(Long id) {
		ventaDao.deleteById(id);
	}

}
