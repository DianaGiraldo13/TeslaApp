package modelo;

public class Historico {
	
	private String compraRealizada;
	private double montoCompra;
	private int cilindraje;
	public Historico(String compraRealizada, double montoCompra, int cilindraje) {
		super();
		this.compraRealizada = compraRealizada;
		this.montoCompra = montoCompra;
		this.cilindraje = cilindraje;
	}
	public String getCompraRealizada() {
		return compraRealizada;
	}
	public void setCompraRealizada(String compraRealizada) {
		this.compraRealizada = compraRealizada;
	}
	public double getMontoCompra() {
		return montoCompra;
	}
	public void setMontoCompra(double montoCompra) {
		this.montoCompra = montoCompra;
	}
	public int getGamaAuto() {
		return cilindraje;
	}
	public void setGamaAuto(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	

}
