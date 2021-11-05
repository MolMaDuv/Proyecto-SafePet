package mundo;

import java.util.Date;

public class Afiliado  extends Persona {

	private int credencial;
	private Date ultimaVisita;
	
	

	public Afiliado(int id, String nombre, String telefono, String direccion, String correo, int edad, int credencial,
			Date ultimaVisita) {
		super(id, nombre, telefono, direccion, correo, edad);
		this.credencial = credencial;
		this.ultimaVisita = ultimaVisita;
	}



	@Override
	public String toString() {
		return "Afiliado [credencial=" + credencial + ", ultimaVisita=" + ultimaVisita + "]";
	}
	
	
	
	

}
