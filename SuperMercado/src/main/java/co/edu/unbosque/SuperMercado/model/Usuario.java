package co.edu.unbosque.SuperMercado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	// Atributos
	@Id 
	@Column(name="cedula_usuario",length = 11)
	private long cedula_usuario;
	@Column(name="nombre_usuario",length = 50)
	private String nombre_usuario;
	@Column(name="apellido_usuario",length = 50)
	private String apellido_usuario;
	@Column(name="email_usuario",length = 50,unique=true)
	private String email_usuario;
	@Column(name="fecha_usuario",length = 15)
	private String fecha_usuario;
	@Column(name="genero_usuario",length = 10)
	private String genero_usuario;
	@Column(name="usuario",length = 50,unique=true)
	private String usuario;
	@Column(name="password",length = 50)
	private String password;
	
	// Metodos 
	
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellido_usuario() {
		return apellido_usuario;
	}
	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getFecha_usuario() {
		return fecha_usuario;
	}
	public void setFecha_usuario(String fecha_usuario) {
		this.fecha_usuario = fecha_usuario;
	}
	public String getGenero_usuario() {
		return genero_usuario;
	}
	public void setGenero_usuario(String genero_usuario) {
		this.genero_usuario = genero_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
