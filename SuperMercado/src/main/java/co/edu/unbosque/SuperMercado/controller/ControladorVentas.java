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

import co.edu.unbosque.SuperMercado.api.VentaApi;
import co.edu.unbosque.SuperMercado.model.Venta;



@RestController
@RequestMapping("/ventas")
public class ControladorVentas {
	@Autowired
	private VentaApi ventaApi;

	@PostMapping("/guardar")
	public void crear (@RequestBody Venta ventaNueva){
		
		ventaApi.save(ventaNueva);
	}
	
	@GetMapping("/buscar/{id}")
	
	public ResponseEntity<?> buscar (@PathVariable(value="id") Long ventaId){
		Optional<Venta> optionalVenta = ventaApi.findById(ventaId);
		if(!optionalVenta.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optionalVenta);
	}
	
	@PutMapping("/actulizar/{id}")
	public void actualizar (@RequestBody Venta datosVenta, @PathVariable(value = "id")Long ventaId){
		Optional<Venta> unaVenta = ventaApi.findById(ventaId);

		if(!unaVenta.isPresent()) {
			ResponseEntity.notFound().build();
		}
		
		unaVenta.get().setIva_venta(datosVenta.getIva_venta());
		unaVenta.get().setValor_venta(datosVenta.getValor_venta());
		unaVenta.get().setTotal_venta(datosVenta.getTotal_venta());
		ventaApi.save(unaVenta.get());
	}
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> borrar (@PathVariable(value = "id") Long ventaId){
		if(!ventaApi.findById(ventaId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		ventaApi.deleteById(ventaId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/listar")
	public List<Venta> readAll(){
		return ventaApi.findAll();
	}

}
