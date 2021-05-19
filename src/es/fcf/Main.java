package es.fcf;

public class Main {

	public static void main(String[] args) {
		// Crear el objeto originador/creador
		Originator originator = new Originator("París", "Avión");
		// Crear el objeto gestor/vigilante del Memento
		GestorViajes vigilanteGestorViajes = new GestorViajes();
		// Crear el Memento y asociarlo al objeto gestor
		vigilanteGestorViajes.setMemento(originator.createMemento());
		// Mostrar los datos del objeto
		System.out.println("Nombre completo: [" + originator.getCiudad() + " " + originator.getTipoTransporte() + "]");
		// Modificar los datos del objeto
		originator = nuevoDestino(originator);
		// Mostrar los datos del objeto
		System.out.println("Nombre completo: [" + originator.getCiudad() + " " + originator.getTipoTransporte() + "]");
		// Restaurar los datos del objeto
		originator.setMemento(vigilanteGestorViajes.getMemento());
		// Mostrar los datos del objeto
		System.out.println("Nombre completo: [" + originator.getCiudad() + " " + originator.getTipoTransporte() + "]");
	}

	private static Originator nuevoDestino(Originator originator) {

		originator.setCiudad("Madrid");
		originator.setTipoTransporte("AVE");
		
		return originator;
	}
}
