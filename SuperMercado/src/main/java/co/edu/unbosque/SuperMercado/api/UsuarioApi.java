package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.UsuarioDao;
import co.edu.unbosque.SuperMercado.model.Usuario;



@Service
public class UsuarioApi{
	
	@Autowired
	private UsuarioDao usuarioDao;


	public List<Usuario> findAll() {
		
		return usuarioDao.findAll();
	}
	
	public Optional<Usuario> findById(long id) {
	
		return usuarioDao.findById(id);
	}
	
	public boolean existById(Long id) {
		return usuarioDao.existsById(id);
	}

	public void save(Usuario unUsuario) {
		usuarioDao.save(unUsuario);
	}

	public void deleteById(Long id) {
		
		usuarioDao.deleteById(id);
	}

	public boolean existByUsuarioAndPassword(String usuario,String password) {
	
		return usuarioDao.existsByUsuarioAndPassword(usuario,password);
	}
}
