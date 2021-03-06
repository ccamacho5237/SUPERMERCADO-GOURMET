package co.edu.unbosque.supermercadogourmet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestJSON {

	private static URL url;
	private static String sitio = "http://localhost:5000/";

	public static ArrayList<Usuario> parsingUsuarios(String json) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		JSONArray usuarios = (JSONArray) jsonParser.parse(json);
		Iterator i = usuarios.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			Usuario usuario = new Usuario();
			usuario.setCedula_usuario(Long.parseLong(innerObj.get("cedula_usuario").toString()));
			usuario.setNombre_usuario(innerObj.get("nombre_usuario").toString());
			usuario.setApellido_usuario(innerObj.get("apellido_usuario").toString());
			usuario.setEmail_usuario(innerObj.get("email_usuario").toString());
			usuario.setFecha_usuario(innerObj.get("fecha_usuario").toString());
			usuario.setGenero_usuario(innerObj.get("genero_usuario").toString());
			usuario.setUsuario(innerObj.get("usuario").toString());
			usuario.setPassword(innerObj.get("password").toString());
			lista.add(usuario);
		}
		return lista;
	}

	public static ArrayList<Usuario> getJSON() throws IOException, ParseException{
		url = new URL(sitio+"usuarios/listar");
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr);
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
			json += (char)inp[i];
			System.out.println(i);
		}
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista = parsingUsuarios(json);
		http.disconnect();
		return lista;
	}
	
	public static boolean login(String usuario, String password) throws IOException, ParseException{
		
		boolean validacion = false;
		url = new URL(sitio+"usuarios/login/"+usuario+"&"+password);
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr);
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
			json += (char)inp[i];
		}
		if (json.equals("true")) {
			validacion = true;
		}
		http.disconnect();
		return validacion;
	}

	public static int postJSON(Usuario usuario) throws IOException {
		url = new URL(sitio+"usuarios/guardar");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr=Base64.getEncoder().encodeToString("user:pass".getBytes());
		try {
			http.setRequestMethod("POST");
			
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr);
		http.setRequestProperty("Content-Type", "application/json");
		String data = "{"
				+"\"cedula_usuario\":\""+usuario.getCedula_usuario()+"\","
				+"\"nombre_usuario\" : \""+usuario.getNombre_usuario()+"\","
				+"\"apellido_usuario\": \""+usuario.getApellido_usuario()+"\","
				+"\"email_usuario\": \""+usuario.getEmail_usuario()+"\","
				+"\"fecha_usuario\": \""+usuario.getFecha_usuario()+"\","
				+"\"genero_usuario\": \""+usuario.getGenero_usuario()+"\","
				+"\"usuario\": \""+usuario.getUsuario()+"\","
				+"\"password\": \""+usuario.getPassword()+"\""
				+"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}
}

