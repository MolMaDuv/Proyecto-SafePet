package mundo;

public class Simulacion extends Persona{
	
	private int numeroMascotas;

	/**
	 * @return the numeroMascotas
	 */
	public int getNumeroMascotas() {
		return numeroMascotas;
	}

	/**
	 * @param numeroMascotas the numeroMascotas to set
	 */
	public void setNumeroMascotas(int numeroMascotas) {
		this.numeroMascotas = numeroMascotas;
	}

	public Simulacion(int id, String nombre, String telefono, String direccion, String correo, int edad,
			int numeroMascotas) {
		super(id, nombre, telefono, direccion, correo, edad);
		this.numeroMascotas = numeroMascotas;
	}

	@Override
	public String toString() {
		return "[numeroMascotas=" + numeroMascotas + "]";
	}
	
	

}
