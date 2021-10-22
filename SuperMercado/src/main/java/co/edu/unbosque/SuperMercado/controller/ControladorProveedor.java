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

import co.edu.unbosque.SuperMercado.api.ProveedorApi;
import co.edu.unbosque.SuperMercado.model.Proveedor;



@RestController
@RequestMapping("/proveedores")
public class ControladorProveedor {
	@Autowired
	private ProveedorApi proveedorApi;
	
	@PostMapping("/guardar")
	public void crear (@RequestBody Proveedor proveedorNuevo){
		proveedorApi.save(proveedorNuevo);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<?> leer (@PathVariable(value="id") Long proveedorId){
		Optional<Proveedor> optionalProveedor = proveedorApi.findById(proveedorId);
		if(!optionalProveedor.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optionalProveedor);
	}
	
	@PutMapping("/actulizar/{id}")
	public void actualizar (@RequestBody Proveedor datosProveedor, @PathVariable(value = "id")Long proveedorId){
		Optional<Proveedor> unProveedor = proveedorApi.findById(proveedorId);
		
		if(!unProveedor.isPresent()) {
			ResponseEntity.notFound().build();
		}
		
		unProveedor.get().setNit_proveedor(datosProveedor.getNit_proveedor());
		unProveedor.get().setCiudad_proveedor(datosProveedor.getCiudad_proveedor());
		unProveedor.get().setDireccion_proveedor(datosProveedor.getDireccion_proveedor());
		unProveedor.get().setNombre_proveedor(datosProveedor.getNombre_proveedor());
		unProveedor.get().setTelefono_proveedor(datosProveedor.getTelefono_proveedor());
		
		proveedorApi.save(unProveedor.get());
		}
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> borrar (@PathVariable(value = "id") Long proveedorId){
		if(!proveedorApi.findById(proveedorId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		proveedorApi.deleteById(proveedorId);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/listar")
	public List<Proveedor> readAll(){
		return proveedorApi.findAll();
	}

}
