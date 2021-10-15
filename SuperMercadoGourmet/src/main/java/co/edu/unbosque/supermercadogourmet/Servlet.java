package co.edu.unbosque.supermercadogourmet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;


import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String listar = request.getParameter("Listar");
		String agregar = request.getParameter("Agregar");
		String login = request.getParameter("accion");

		if (agregar != null) {
			agregarUsuario(request, response);
		}
		if (listar != null) {
			try {
				listarUsuarios(request, response);
			} catch (ParseException | ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(login !=null) {
			try {
				login(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void agregarUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuario usuario = new Usuario();
		usuario.setCedula_usuario(Long.parseLong(request.getParameter("cedula")));
		usuario.setNombre_usuario(request.getParameter("nombre"));
		usuario.setApellido_usuario(request.getParameter("apellido"));
		usuario.setEmail_usuario(request.getParameter("email"));
		usuario.setFecha_usuario(request.getParameter("fecha"));
		usuario.setGenero_usuario(request.getParameter("genero"));
		usuario.setUsuario(request.getParameter("usuario"));
		usuario.setPassword(request.getParameter("password"));
		int respuesta = 0;
		try{
			respuesta=TestJSON.postJSON(usuario);
			PrintWriter writer = response.getWriter();
			if (respuesta == 200) {
				writer.println(" Registro Agregado!");
			}else {
				writer.println(" Error: "+respuesta);

			}
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		};
	}

	public void listarUsuarios(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException {
		try {
			ArrayList<Usuario> lista = TestJSON.getJSON();
			String pagina = "/resultado.jsp";
			request.setAttribute("lista", lista);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
			dispatcher.forward(request, response);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void login(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException{
		try {
			String perfil="/perfil.jsp";
			String login="/Login.jsp";
			String usuarioEntrado=request.getParameter("usuario");
			String passwordEntrada=request.getParameter("password");
			boolean respuesta = TestJSON.login(usuarioEntrado,passwordEntrada);
			if(respuesta) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(perfil);
				dispatcher.forward(request, response);
			}
			else {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(login);
				dispatcher.forward(request, response);
			}
		}catch ( IOException e) {
			e.printStackTrace();
		}

	}

}
