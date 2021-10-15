package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.SuperMercado.dao.UsuarioDao;
import co.edu.unbosque.SuperMercado.model.Usuario;

@Service
public class ImplementacionUsuarioApi implements UsuarioApi{
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		
		return usuarioDao.findAll();
	}

	@Override
	public Optional<Usuario> findById(long id) {
	
		return usuarioDao.findById(id);
	}
	
	public boolean existById(Long id) {
		return usuarioDao.existsById(id);
	}
	@Override
	public Usuario save(Usuario unUsuario) {
		return usuarioDao.save(unUsuario);
	}

	@Override
	public void deleteById(Long id) {
		
		usuarioDao.deleteById(id);
	}

	@Override
	public boolean existByUsuarioAndPassword(String usuario,String password) {
	
		return usuarioDao.existsByUsuarioAndPassword(usuario,password);
	}

	/*@Override
	public Optional<Usuario> findByUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findbyUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findbyUsuarioAndPassword(String usuario, String Password) {
		// TODO Auto-generated method stub
		return null;
	}*/

	
	

}
