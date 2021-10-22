package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.ClienteDao;
import co.edu.unbosque.SuperMercado.model.Cliente;

@Service
public class ClienteApi {
	
	@Autowired
	private ClienteDao clienteDao;

	public List<Cliente> findAll() {

		return clienteDao.findAll();
	}
	
	public Optional<Cliente> findById(long id) {

		return clienteDao.findById(id);
	}

	public boolean existById(Long id) {
		return clienteDao.existsById(id);
	}

	public void save(Cliente unCliente) {
		clienteDao.save(unCliente);
	}
	
	public void deleteById(Long id) {
		clienteDao.deleteById(id);
	}
}
