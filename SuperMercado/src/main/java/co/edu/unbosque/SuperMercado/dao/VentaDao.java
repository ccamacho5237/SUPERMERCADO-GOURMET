package co.edu.unbosque.SuperMercado.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.SuperMercado.model.Venta;

public interface VentaDao extends JpaRepository<Venta, Long>{

}
