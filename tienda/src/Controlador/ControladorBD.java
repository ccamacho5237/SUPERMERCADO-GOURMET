package Controlador;

import java.sql.*;

import Modelo.*;
public class ControladorBD {
	private ConexionBD miConexion;
	private PreparedStatement prs;
	private ResultSet rs;
	private Usuario unUsuario;

	public ControladorBD() {

		miConexion = new ConexionBD();
		unUsuario = new Usuario();
	}

	public void ingresarUsuario(Usuario unUsuario) {

		String registrar="INSERT INTO usuario(Nombre_usuario,Apellido_usuario,Cedula_usuario,Email_usuario,"
				+ "Fecha_usuario,Genero_usuario,Usuario,Contraseña) VALUES(?,?,?,?,?,?,?,?)";
		try {
			prs = miConexion.obtenerConexion().prepareStatement(registrar);
			prs.setString(1, unUsuario.getNombres());
			prs.setString(2, unUsuario.getApellidos());
			prs.setString(3, unUsuario.getCedula());
			prs.setString(4, unUsuario.getCorreo());
			prs.setString(5, unUsuario.getFecha());
			prs.setString(6, unUsuario.getGenero());
			prs.setString(7, unUsuario.getUsuario());
			prs.setString(8, unUsuario.getContraseña());
			prs.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void loginUsuario(String usuario,String contraseña) {
		String sql = "SELECT * FROM usuario WHERE usuario ='"+usuario+"' and contraseña='"+contraseña+"'";
		try {			
			prs = miConexion.obtenerConexion().prepareStatement(sql);
			rs = prs.executeQuery();
			if(rs.next()) {
				unUsuario = new Usuario();
				unUsuario.setNombres(rs.getString(2));
				unUsuario.setApellidos(rs.getString(3));
				unUsuario.setCedula(rs.getString(4));
				unUsuario.setCorreo(rs.getString(5));
				unUsuario.setFecha(rs.getString(6));
				unUsuario.setGenero(rs.getString(7));
				unUsuario.setUsuario(rs.getString(8));
				unUsuario.setContraseña(rs.getString(9));

				System.out.println("bienvenido"+unUsuario.toString());
			}
			else {
				System.out.println("Usuario o contraseña invalidos");
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
	}	
	public void modificarUsuario(String usuario,String contraseña,String nuevoCorreo, String nuevaContraseña) {
		try {
			String modificar ="UPDATE usuario SET Email_usuario = ?,contraseña = ?"
					+ "where usuario ='"+usuario+"' and contraseña='"+contraseña+"'";
			prs = miConexion.obtenerConexion().prepareStatement(modificar);
			prs.setString(1, nuevoCorreo);
			prs.setString(2, nuevaContraseña);
			prs.executeUpdate();
			System.out.println("Se modifico los datos");
			
		}catch(SQLException e) {
			System.out.println(e.toString());
		}

	}
	public void eliminarUsuario(String usuario,String contraseña) {
		try {
			String eliminar = "DELETE from usuario WHERE usuario ='"+usuario+"' and contraseña='"+contraseña+"'";
			prs = miConexion.obtenerConexion().prepareStatement(eliminar);
			prs.executeUpdate();
			System.out.println("usuario eliminado");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}	
	}
	public void buscarUsuario(String cedula) {
		String sql = "SELECT * FROM usuario WHERE Cedula_usuario ='"+cedula+"'";
		try {			
			prs = miConexion.obtenerConexion().prepareStatement(sql);
			rs = prs.executeQuery();
			if(rs.next()) {
				unUsuario = new Usuario();
				unUsuario.setNombres(rs.getString(2));
				unUsuario.setApellidos(rs.getString(3));
				unUsuario.setCedula(rs.getString(4));
				unUsuario.setCorreo(rs.getString(5));
				unUsuario.setFecha(rs.getString(6));
				unUsuario.setGenero(rs.getString(7));
				unUsuario.setUsuario(rs.getString(8));
				unUsuario.setContraseña(rs.getString(9));
				
				System.out.println("bienvenido"+unUsuario.toString());
			}
			else {
				System.out.println("Usuario o contraseña invalidos");
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
	}	
}

