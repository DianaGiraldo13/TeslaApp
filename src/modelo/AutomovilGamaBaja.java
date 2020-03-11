package modelo;

public class AutomovilGamaBaja extends Automovil{
	
	public AutomovilGamaBaja(String color, String marca, double precio, String modelo) {
		super(color, marca, precio, modelo,Automovil.CILINDRAJE_BAJO);
	}

}
