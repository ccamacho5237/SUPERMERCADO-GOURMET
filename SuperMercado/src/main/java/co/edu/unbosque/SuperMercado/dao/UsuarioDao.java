package co.edu.unbosque.SuperMercado.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.SuperMercado.model.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
	
	@Transactional(readOnly = true)
	 public boolean existsByUsuarioAndPassword(String usuario,String password);

	/*public Optional<Usuario> findByUsuario1(String usuario);
	
	public Usuario findByUsuario(String usuario);
	
	public Usuario findByUsuarioAndPassword(String usuario, String password);*/
	
}
