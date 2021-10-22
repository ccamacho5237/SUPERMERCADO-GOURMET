package co.edu.unbosque.SuperMercado.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.SuperMercado.api.ClienteApi;
import co.edu.unbosque.SuperMercado.model.Cliente;

	

@RestController
@RequestMapping("/Clientes")
public class ControladorClientes {

	@Autowired
	private ClienteApi clienteApi;

	@PostMapping("/guardar")
	public void crear (@RequestBody Cliente clienteNuevo){
		
		clienteApi.save(clienteNuevo);
	}
	
	@GetMapping("/buscar/{id}")
	
	public ResponseEntity<?> buscar (@PathVariable(value="id") Long clienteId){
		Optional<Cliente> optionalCliente = clienteApi.findById(clienteId);
		if(!optionalCliente.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optionalCliente);
	}
	
	@PutMapping("/actulizar/{id}")
	public void actualizar (@RequestBody Cliente datosCliente, @PathVariable(value = "id")Long clienteId){
		Optional<Cliente> unCliente = clienteApi.findById(clienteId);

		if(!unCliente.isPresent()) {
			ResponseEntity.notFound().build();
		}
		
		unCliente.get().setNombre_cliente(datosCliente.getNombre_cliente());
		unCliente.get().setApellido_cliente(datosCliente.getDireccion_cliente());
		unCliente.get().setEmail_cliente(datosCliente.getEmail_cliente());
		unCliente.get().setDireccion_cliente(datosCliente.getDireccion_cliente());
		unCliente.get().setTelefono_cliente(datosCliente.getTelefono_cliente());
		
		clienteApi.save(unCliente.get());
	}
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> borrar (@PathVariable(value = "id") Long clienteId){
		if(!clienteApi.findById(clienteId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		clienteApi.deleteById(clienteId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/listar")
	public List<Cliente> readAll(){
		return clienteApi.findAll();
	}

}

