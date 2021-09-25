package Modelo;


public class Usuario extends Persona{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usuario,contraseña,correo;

	public Usuario() {
		super();
		
	}

	public Usuario(String nombres, String apellidos, String cedula, String fecha, String genero,String correo, String usuario,String contraseña) {
		super(nombres, apellidos, cedula, fecha, genero);
		this.correo = correo;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public String getNombres() {
		return super.getNombres();
	}
	public void setNombres(String nombres) {
		super.setNombres(nombres);
	}

	public String getApellidos() {
		return super.getApellidos();
	}

	public void setApellidos(String apellidos) {
		super.setApellidos(apellidos);
	}
	
	public String getCedula() {
		return super.getCedula();
	}

	public void setCedula(String cedula) {
		super.setCedula(cedula);
	}

	public String getFecha() {
		return super.getFecha();
	}

	public void setFecha(String fecha) {
		super.setFecha(fecha);
	}

	public String getGenero() {
		return super.getGenero();
	}

	public void setGenero(String genero) {
		super.setGenero(genero);
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", contraseña=" + contraseña + ", correo=" + correo + ", nombres="
				+ nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", fecha=" + fecha + ", genero="
				+ genero + "]";
	}
	

}
