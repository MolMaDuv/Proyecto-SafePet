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

	public String calcularPlanSimulacion(int contadorMascotas, boolean consultas, boolean ambulancia, boolean asistencia, boolean tres, boolean seis, boolean doce) {
		
		String respuesta = "Su plan contara con los siguientes beneficios: \n";
		double valorConsultas = 0;
		double valorAmbulancia = 0;
		double valorAsistencia = 0;
		double valorTotal = 0;
		double descuento = 0.0;
		
		if(consultas == true) {
			valorConsultas = 20000;
			respuesta += " - Consultas ilimitadas \n";
		}
		
		if(ambulancia == true) {
			valorAmbulancia = 10000;
			respuesta += " - Ambulancia las 24 horas \n";
		}
		
		if(asistencia == true) {
			valorAsistencia = 8000;
			respuesta += " - Asistencia en casa \n\n";
		}
		
		if(tres == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 3 * contadorMascotas;
			descuento = base * 0.008;
			valorTotal = base - descuento;
			respuesta += " Por un periodo de 3 meses \n\n";
		}
		
		if(seis == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 6 * contadorMascotas;
			descuento = base * 0.0012;
			valorTotal = base - descuento;
			respuesta += " Por un periodo de 6 meses \n\n";
		}
		
		if(doce == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 12 * contadorMascotas;
			descuento = base * 0.0018;
			valorTotal = base - descuento;
			respuesta += " Por un periodo de 12 meses \n\n";
		}
		
		respuesta += "El valor total del pan simulado es: " + valorTotal + "\nCon cobertura para "+contadorMascotas+" mascota(s)";
		
		return respuesta;
	}

}
