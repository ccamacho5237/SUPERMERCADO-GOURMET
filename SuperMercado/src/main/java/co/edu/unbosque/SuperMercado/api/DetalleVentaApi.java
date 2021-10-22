package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.DetalleVentaDao;
import co.edu.unbosque.SuperMercado.model.DetalleVenta;

@Service
public class DetalleVentaApi {
	@Autowired
	private DetalleVentaDao detalleVentaDao;
	
	public List<DetalleVenta> findAll() {

		return detalleVentaDao.findAll();
	}
	
	public Optional<DetalleVenta> findById(long id) {

		return detalleVentaDao.findById(id);
	}

	public boolean existById(Long id) {
		return detalleVentaDao.existsById(id);
	}

	public void save(DetalleVenta unDetalleVenta) {
		detalleVentaDao.save(unDetalleVenta);
	}
	
	public void deleteById(Long id) {
		detalleVentaDao.deleteById(id);
	}
}
