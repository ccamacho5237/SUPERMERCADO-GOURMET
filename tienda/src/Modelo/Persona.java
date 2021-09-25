/**
 * @author Julian Casallas
 */

package Modelo;

import java.io.Serializable;

public class Persona implements Serializable{

	//encapsulamiento de atributos

	private static final long serialVersionUID = 1L;
	protected String nombres,apellidos,cedula,fecha,genero;

	//constructores 
	public Persona() {

	}

	public Persona(String nombres, String apellidos,String cedula, String fecha, String genero) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.fecha = fecha;
		this.genero = genero;	
	}
	// metodos set y get
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}
