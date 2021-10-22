package co.edu.unbosque.SuperMercado.model;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
	// Atributos
		@Id 
		@Column(name="cedula_cliente",length = 11)
		private long cedula_cliente;
		
		@Column(name="nombre_cliente",length = 50)
		private String nombre_cliente;
		
		@Column(name="apellido_cliente",length = 50)
		private String apellido_cliente;
		
		@Column(name="email_cliente",length = 50)
		private String email_cliente;
		
		@Column(name="direccion_cliente",length = 200)
		private String direccion_cliente;
		
		@Column(name="telefono_cliente",length = 50)
		private String telefono_cliente;

		public long getCedula_cliente() {
			return cedula_cliente;
		}

		public void setCedula_cliente(long cedula_cliente) {
			this.cedula_cliente = cedula_cliente;
		}

		public String getNombre_cliente() {
			return nombre_cliente;
		}

		public void setNombre_cliente(String nombre_cliente) {
			this.nombre_cliente = nombre_cliente;
		}

		public String getApellido_cliente() {
			return apellido_cliente;
		}

		public void setApellido_cliente(String apellido_cliente) {
			this.apellido_cliente = apellido_cliente;
		}

		public String getEmail_cliente() {
			return email_cliente;
		}

		public void setEmail_cliente(String email_cliente) {
			this.email_cliente = email_cliente;
		}

		public String getDireccion_cliente() {
			return direccion_cliente;
		}

		public void setDireccion_cliente(String direccion_cliente) {
			this.direccion_cliente = direccion_cliente;
		}

		public String getTelefono_cliente() {
			return telefono_cliente;
		}

		public void setTelefono_cliente(String telefono_cliente) {
			this.telefono_cliente = telefono_cliente;
		}
			
		
}
