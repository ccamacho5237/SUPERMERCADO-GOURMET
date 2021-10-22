package co.edu.unbosque.SuperMercado.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.SuperMercado.model.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long> {

}
