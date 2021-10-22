package co.edu.unbosque.SuperMercado.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.SuperMercado.model.DetalleVenta;

public interface DetalleVentaDao extends JpaRepository<DetalleVenta, Long>{

}
