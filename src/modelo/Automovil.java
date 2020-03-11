package modelo;

public class Automovil {
	
	public final static int CILINDRAJE_BAJO=50;
	public final static int CILINDRAJE_MEDIO=100;
	public final static int CILINDRAJE_ALTO=150;
	
	private String color;
	
	private String marca;
	
	private double precio;
	
	private String modelo;
	
	private int cilindraje;

	public Automovil(String color, String marca, double precio, String modelo, int cilindraje) {
		super();
		this.color = color;
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.cilindraje=cilindraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	

}
