package co.edu.unbosque.SuperMercado.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.SuperMercado.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long>{

}
