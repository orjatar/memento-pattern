package es.fcf;

public class Originator {

	private String ciudad;
	private String tipoTransporte;

	// ---------------------------
	public Originator(String ciudad, String tipoTransporte) {
		this.ciudad = ciudad;
		this.tipoTransporte = tipoTransporte;
	}

	// ---------------------------
	public void setMemento(Memento m) {
		this.ciudad = m.getCiudad();
		this.tipoTransporte = m.getTipoTransporte();
	}

	// ---------------------------
	public Memento createMemento() {
		return new Memento(ciudad, tipoTransporte);
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
