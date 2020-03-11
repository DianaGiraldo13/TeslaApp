package modelo;

import java.util.ArrayList;

public class Tesla {

	private ArrayList<Usuario> usuarios;
	
	private ArrayList<Automovil> automoviles;
	
	public Tesla() {
		usuarios = new ArrayList<Usuario>();
		automoviles = new ArrayList<Automovil>();
		automoviles.add(new AutomovilGamaAlta("Gris", "Tesla", 80000, "Model X"));
		automoviles.add(new AutomovilGamaMedia("Gris", "Tesla", 1093400, "Model Y"));
		automoviles.add(new AutomovilGamaBaja("Negro", "Tesla", 798300, "Model 3"));
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(ArrayList<Automovil> automoviles) {
		this.automoviles = automoviles;
	}
	
	
	
}
