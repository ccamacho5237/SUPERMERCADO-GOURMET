/**
 * @author Julian Casallas
 */
package Controlador;

import Modelo.*;
import java.util.Scanner;

public class Principal {

	private static Usuario unUsuario;
	private ControladorBD miBasedatos;

	public Principal() {
		unUsuario = new Usuario();
		miBasedatos = new ControladorBD();
	}

	public void registrarUsuario(String nombres, String apellidos, String cedula, String fecha, String genero,
			String correo, String usuario, String contrase�a) {

		unUsuario = new Usuario(nombres, apellidos, cedula, fecha, genero, correo, usuario, contrase�a);
		miBasedatos.ingresarUsuario(unUsuario);
	}

	public void login(String usuario, String contrase�a) {
		miBasedatos.loginUsuario(usuario, contrase�a);

	}

	public void actulizar(String usuario, String contrase�a, String nuevoCorreo, String nuevaContrase�a) {
		miBasedatos.modificarUsuario(usuario, contrase�a, nuevoCorreo, nuevaContrase�a);

	}

	public void eliminar(String usuario, String contrase�a) {
		miBasedatos.eliminarUsuario(usuario, contrase�a);
	}

	public static void main(String[] args) {
		String nombre, apellido, cedula, fecha, genero, correo, usuario, contrase�a, nuevoCorreo, nuevaContrase�a;
		Principal servicio = new Principal();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 5) {

			System.out.println("Ingrese la opcion que quiere realizar");
			System.out.println("1. Registrar");
			System.out.println("2. ingresar");
			System.out.println("3. modificar");
			System.out.println("4. eliminar");
			System.out.println("5. salir");
			System.out.print("opcion : ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.print("Ingresar nombre : ");
				nombre = sc.nextLine();
				System.out.print("Ingresar apellido : ");
				apellido = sc.nextLine();
				System.out.print("Ingresar cedula : ");
				cedula = sc.next();
				System.out.print("Ingresar fecha : ");
				fecha = sc.next();
				System.out.print("Ingresar genero : ");
				genero = sc.next();
				System.out.print("Ingresar correo : ");
				correo = sc.next();
				System.out.print("Ingresar usuario : ");
				usuario = sc.next();
				System.out.print("Ingresar contrase�a : ");
				contrase�a = sc.next();
				servicio.registrarUsuario(nombre, apellido, cedula, fecha, genero, correo, usuario, contrase�a);
				break;
			case 2:
				System.out.print("Ingresar usuario : ");
				usuario = sc.next();
				System.out.print("Ingresar contrase�a : ");
				contrase�a = sc.next();
				servicio.login(usuario, contrase�a);
				break;
			case 3:
				System.out.print("Ingresar usuario : ");
				usuario = sc.next();
				System.out.print("Ingresar contrase�a : ");
				contrase�a = sc.next();
				System.out.print("Ingresar correo nuevo : ");
				nuevoCorreo = sc.next();
				System.out.print("Ingresar contrase�a nueva : ");
				nuevaContrase�a = sc.next();
				servicio.actulizar(usuario, contrase�a, nuevoCorreo, nuevaContrase�a);
				break;
			case 4:
				System.out.print("Ingresar usuario : ");
				usuario = sc.next();
				System.out.print("Ingresar contrase�a : ");
				contrase�a = sc.next();
				servicio.eliminar(usuario, contrase�a);
				break;
			default:
				System.out.println("no existe esta opcion");
				break;
			}
		}

	}
}
