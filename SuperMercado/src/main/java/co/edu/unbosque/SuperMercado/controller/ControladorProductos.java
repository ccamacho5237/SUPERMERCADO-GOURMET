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


import co.edu.unbosque.SuperMercado.api.ProductoApi;
import co.edu.unbosque.SuperMercado.model.Producto;

@RestController
@RequestMapping("/productos")
public class ControladorProductos {
	@Autowired
	private ProductoApi productoApi;

	@PostMapping("/guardar")
	public void crear (@RequestBody Producto productoNuevo){
		productoApi.save(productoNuevo);
	}
	
	@GetMapping("/buscar/{id}")
	
	public ResponseEntity<?> buscar (@PathVariable(value="id") Long productoId){
		Optional<Producto> optionalProducto = productoApi.findById(productoId);
		if(!optionalProducto.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optionalProducto);
	}
	
	@PutMapping("/actulizar/{id}")
	public void actualizar (@RequestBody Producto datosProducto, @PathVariable(value = "id")Long productoId){
		Optional<Producto> unProducto = productoApi.findById(productoId);

		if(!unProducto.isPresent()) {
			ResponseEntity.notFound().build();
		}
		
		unProducto.get().setIva_compra(datosProducto.getIva_compra());
		unProducto.get().setIva_venta(datosProducto.getIva_venta());
		unProducto.get().setNombre_producto(datosProducto.getNombre_producto());
		unProducto.get().setPrecio_compra(datosProducto.getPrecio_compra());
		unProducto.get().setPrecio_venta(datosProducto.getPrecio_venta());
		
		productoApi.save(unProducto.get());
	}
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> borrar (@PathVariable(value = "id") Long productoId){
		if(!productoApi.findById(productoId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		productoApi.deleteById(productoId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/listar")
	public List<Producto> readAll(){
		return productoApi.findAll();
	}

}
