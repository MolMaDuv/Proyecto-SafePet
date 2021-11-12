package mundo;

import java.util.ArrayList;

public class Afiliado  extends Persona {

	private int credencial;
	
	public Afiliado(int id, String nombre, String telefono, String direccion, String correo, int edad, int credencial) {
		super(id, nombre, telefono, direccion, correo, edad);
		this.credencial = credencial;
	}

	public int getCredencial() {
		return credencial;
	}

	public void setCredencial(int credencial) {
		this.credencial = credencial;
	}

}
