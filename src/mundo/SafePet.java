package mundo;

import java.util.ArrayList;

public class SafePet {
	
	private ArrayList<Afiliado> misAfiliados;

	public SafePet() {
		
		misAfiliados= new ArrayList<Afiliado>();		
	}
	
	public void agregarUsuario( Afiliado miAfiliado ) {
		misAfiliados.add(miAfiliado);
	}

	public boolean validarExistenciaUsuario(int id) {

		boolean validacion = false;
		
		for (int i = 0; i < misAfiliados.size(); i++) {
			
			Afiliado miAfiliado = misAfiliados.get(i);
			int idGuardado = miAfiliado.getId();
			
			if(idGuardado == id) {
				validacion = true;
			}
		}
		
		return validacion;
	}

}
