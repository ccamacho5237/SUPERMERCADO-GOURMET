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

import co.edu.unbosque.SuperMercado.api.UsuarioApi;
import co.edu.unbosque.SuperMercado.model.Usuario;


@RestController
@RequestMapping("/usuarios")
public class ControladorUsuarios {
	
	@Autowired
	private UsuarioApi usuarioAPI;
	
	@PostMapping("/guardar")
	public void crear (@RequestBody Usuario usuarioNuevo){
		usuarioNuevo.getCedula_usuario();
		usuarioAPI.save(usuarioNuevo);
	}
	@GetMapping("/buscar/{id}")
	public ResponseEntity<?> leer (@PathVariable(value="id") Long usuarioId){
		Optional<Usuario> optionalUsuario = usuarioAPI.findById(usuarioId);
		if(!optionalUsuario.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optionalUsuario);
	}
	@PutMapping("/actulizar/{id}")
	public void actualizar (@RequestBody Usuario usuarioDetails, @PathVariable(value = "id")Long usuarioId){
		Optional<Usuario> unUsuario = usuarioAPI.findById(usuarioId);
		
		if(!unUsuario.isPresent()) {
			ResponseEntity.notFound().build();
		}
		unUsuario.get().setNombre_usuario(usuarioDetails.getNombre_usuario());
		unUsuario.get().setApellido_usuario(usuarioDetails.getApellido_usuario());
		unUsuario.get().setFecha_usuario(usuarioDetails.getFecha_usuario());
		unUsuario.get().setEmail_usuario(usuarioDetails.getEmail_usuario());
		unUsuario.get().setPassword(usuarioDetails.getPassword());
		
		usuarioAPI.save(unUsuario.get());
		}
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> borrar (@PathVariable(value = "id") Long usuarioId){
		if(!usuarioAPI.findById(usuarioId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		usuarioAPI.deleteById(usuarioId);
		return ResponseEntity.ok().build();
	}
	// Leer todos los usuarios
	@GetMapping("/listar")
	public List<Usuario> readAll(){
		return usuarioAPI.findAll();
	}
	
	//login 
	@GetMapping("/login/{usuario}&{password}")
	public boolean login (@PathVariable(value = "usuario")String usuario,@PathVariable(value = "password")String password){
		return usuarioAPI.existByUsuarioAndPassword(usuario,password);
	}
}
