package modelo;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	
	private String apellido;
	
	private String correo;
	
	private String contra;
	
	private ArrayList<Historico> compras;

	public Usuario(String nombre, String apellido, String correo, String contra) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contra = contra;
		compras=new ArrayList<Historico>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public ArrayList<Historico> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Historico> compras) {
		this.compras = compras;
	}
	
	

}
