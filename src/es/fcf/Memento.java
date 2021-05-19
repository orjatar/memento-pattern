package es.fcf;

public class Memento {

	private String ciudad;
	private String tipoTransporte;

	// ---------------------------
	public Memento(String ciudad, String tipoTransporte) {
		this.ciudad = ciudad;
		this.tipoTransporte = tipoTransporte;
	}

	// ---------------------------
	public String getCiudad() {
		return this.ciudad;
	}

	// ---------------------------
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	// ---------------------------
	public String getTipoTransporte() {
		return this.tipoTransporte;
	}

	// ---------------------------
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

}
