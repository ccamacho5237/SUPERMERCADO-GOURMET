package co.edu.unbosque.SuperMercado.api;

import java.util.List;
import java.util.Optional;

import co.edu.unbosque.SuperMercado.model.Usuario;

public interface UsuarioApi  {
	
	public List<Usuario> findAll();
	
	public Optional<Usuario> findById(long id);
	
	public boolean existById(Long id);
	
	public boolean existByUsuarioAndPassword(String usuario, String password);
	//ublic Optional<Usuario> findByUsuario(String usuario);
	
	//public Usuario findbyUsuario(String usuario);
	
	//public Usuario findbyUsuarioAndPassword(String usuario, String Password);
	
	public Usuario save(Usuario unUsuario);
	
	public void deleteById(Long id);

}
