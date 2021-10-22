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

import co.edu.unbosque.SuperMercado.api.DetalleVentaApi;
import co.edu.unbosque.SuperMercado.model.DetalleVenta;


@RestController
@RequestMapping("/detalles_ventas")
public class ControladorDetalleVentas {
	@Autowired
	private DetalleVentaApi detalleVentaApi;

	@PostMapping("/guardar")
	public void crear (@RequestBody DetalleVenta detalleVentaNueva){
		
		detalleVentaApi.save(detalleVentaNueva);
	}
	
	@GetMapping("/buscar/{id}")
	
	public ResponseEntity<?> buscar (@PathVariable(value="id") Long detalleVentaId){
		Optional<DetalleVenta> optionalDetalleVenta = detalleVentaApi.findById(detalleVentaId);
		if(!optionalDetalleVenta.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optionalDetalleVenta);
	}
	
	@PutMapping("/actulizar/{id}")
	public void actualizar (@RequestBody DetalleVenta datosdetalleVenta, @PathVariable(value = "id")Long detalleVentaId){
		Optional<DetalleVenta> unDetalleVenta = detalleVentaApi.findById(detalleVentaId);

		if(!unDetalleVenta.isPresent()) {
			ResponseEntity.notFound().build();
		}
		unDetalleVenta.get().setCantidad_producto(datosdetalleVenta.getCantidad_producto());
		unDetalleVenta.get().setValor_iva(datosdetalleVenta.getValor_iva());
		unDetalleVenta.get().setValor_venta(datosdetalleVenta.getValor_venta());
		unDetalleVenta.get().setValor_total(datosdetalleVenta.getValor_total());
		
		detalleVentaApi.save(unDetalleVenta.get());
	}
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> borrar (@PathVariable(value = "id") Long detalleVentaId){
		if(!detalleVentaApi.findById(detalleVentaId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		detalleVentaApi.deleteById(detalleVentaId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/listar")
	public List<DetalleVenta> readAll(){
		return detalleVentaApi.findAll();
	}

}
