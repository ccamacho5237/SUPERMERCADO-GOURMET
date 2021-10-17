package tiendaGenerica;

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
	
	//TODO Metodos de Usuarios
	public static ArrayList<Usuarios> parsingUsuarios(String json) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		JSONArray usuarios = (JSONArray) jsonParser.parse(json);
		Iterator i = usuarios.iterator();
		while (i.hasNext()) 
		{
		JSONObject innerObj = (JSONObject) i.next();
		Usuarios usuario = new Usuarios();
		Roles rol = new Roles();
		usuario.setCedula_usuario(Long.parseLong(innerObj.get("cedula_usuario").toString()));
		usuario.setNombre_usuario(innerObj.get("nombre_usuario").toString());
		usuario.setEmail_usuario(innerObj.get("email_usuario").toString());
		usuario.setCelular_usuario(innerObj.get("celular_usuario").toString());
		usuario.setPassword(innerObj.get("password").toString());
		String variable = "["+innerObj.get("rol").toString()+"]";
		JSONArray roles = (JSONArray) jsonParser.parse(variable);
		JSONObject innerObjroles = (JSONObject) roles.get(0);
		rol.setId_rol(Long.parseLong(innerObjroles.get("id_rol").toString()));
		rol.setDescripcion(innerObjroles.get("descripcion").toString());
		usuario.setRol(rol);
		lista.add(usuario);
		}
		return lista;
		}
	
	public static ArrayList<Usuarios> getJSONUsuarios() throws IOException, ParseException{
		url = new URL(sitio+"usuarios/listar");
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr); 
		InputStream respuesta = http.getInputStream();
		//System.out.print(respuesta);
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
		json += (char)inp[i];
		//System.out.println(i);
		//System.out.print((char)inp[i]);
		}
		//System.out.print(json);
		
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		lista = parsingUsuarios(json);
		System.out.print("Pas� por aqu� listar");
		http.disconnect();
		return lista;
		}
	
	public static int postJSONUsuarios(Usuarios usuario) throws IOException {
		url = new URL(sitio+"usuarios/guardar");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
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
		+ "\"cedula_usuario\":\""+ usuario.getCedula_usuario()
		+"\",\"nombre_usuario\":\""+usuario.getNombre_usuario()
		+"\",\"email_usuario\":\""+usuario.getEmail_usuario()
		+"\",\"celular_usuario\":\""+usuario.getCelular_usuario()
		+"\",\"password\":\""+usuario.getPassword()                       
		+"\",\"rol\":{\"id_rol\":\""+usuario.getRol().getId_rol()+"\"}"
		+ "}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		System.out.print(respuesta);
		return respuesta;
		}
	
	public static int putJSONUsuarios(Usuarios usuario) throws IOException {
		url = new URL(sitio+"usuarios/actualizar");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		try {
		http.setRequestMethod("PUT");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr); 
		http.setRequestProperty("Content-Type", "application/json");
		System.out.print("Pas� por aqu�1");
		String data = "{"
		+ "\"cedula_usuario\":\""+ usuario.getCedula_usuario()
		+"\",\"nombre_usuario\":\""+usuario.getNombre_usuario()
		+"\",\"email_usuario\":\""+usuario.getEmail_usuario()
		+"\",\"celular_usuario\":\""+usuario.getCelular_usuario()
		+"\",\"password\":\""+usuario.getPassword()                       
		+"\",\"rol\":{\"id_rol\":\""+usuario.getRol().getId_rol()+"\"}"
		+ "}";
		System.out.print(data);
		System.out.print("Pas� por aqu�2");
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		System.out.print("Pas� por aqu�3");
		return respuesta;
		}
	
	public static int deleteJSONUsuarios(Long id) throws IOException {
		url = new URL(sitio+"usuarios/eliminar/"+id);
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		try {
		http.setRequestMethod("DELETE");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr); 
		http.setRequestProperty("Content-Type", "application/json");
		http.connect();
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
	//TODO Metodos de Roles
	public static ArrayList<Roles> parsingRoles(String json) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Roles> lista = new ArrayList<Roles>();
		JSONArray roles = (JSONArray) jsonParser.parse(json);
		Iterator i = roles.iterator();
		while (i.hasNext()) {
		JSONObject innerObj = (JSONObject) i.next();
		Roles rol = new Roles();
		rol.setId_rol(Long.parseLong(innerObj.get("id_rol").toString()));
		rol.setDescripcion(innerObj.get("descripcion").toString());
		lista.add(rol);
		}
		return lista;
		}
	
	public static ArrayList<Roles> getJSONRoles() throws IOException, ParseException{
		url = new URL(sitio+"roles/listar");
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
		ArrayList<Roles> lista = new ArrayList<Roles>();
		lista = parsingRoles(json);
		http.disconnect();
		return lista;
		}
	
	public static int postJSONRoles(Roles rol) throws IOException {
		url = new URL(sitio+"roles/guardar");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
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
		+ "\"id_rol\":\""+ rol.getId_rol()
		+"\",\"descripcion\": \""+rol.getDescripcion()
		+ "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	public static int putJSONRoles(Roles rol) throws IOException {
		url = new URL(sitio+"roles/actualizar");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		try {
		http.setRequestMethod("PUT");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr); 
		http.setRequestProperty("Content-Type", "application/json");
		String data = "{"
				+ "\"id_rol\":\""+ rol.getId_rol()
				+"\",\"descripcion\": \""+rol.getDescripcion()
				+ "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
	public static int deleteJSONRoles(Long id) throws IOException {
		url = new URL(sitio+"roles/eliminar/"+id);
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		String authStr = Base64.getEncoder().encodeToString("user:pass".getBytes());
		try {
		http.setRequestMethod("DELETE");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr); 
		http.setRequestProperty("Content-Type", "application/json");
		http.connect();
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
}
