package Modelo;

import java.sql.*;


public class ConexionBD {

	// atributos
	private String bd = "tiendagenerica";   
	private String login = "root";   
	private String password = "1234";   
	private String url = "jdbc:mariadb://localhost:3306/" + bd;
	//se incializa la conexion
	Connection miConexion=null;

	//constructor
	public ConexionBD() {

	}
	// para abrir la conexion
	public Connection obtenerConexion() {
		try {        
			Class.forName("org.mariadb.jdbc.Driver");
			miConexion = DriverManager.getConnection(url, login, password);
		}
		catch(Exception e){
			e.toString();
		}	
		return miConexion;
	}
	// para desconectar la conexion
	public void desconectar() {
		miConexion=null;
	}
}
