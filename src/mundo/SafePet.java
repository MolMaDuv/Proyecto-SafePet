package mundo;

import java.util.ArrayList;

public class SafePet {
	
	private ArrayList<Afiliado> misAfiliados;
	private ArrayList<Empleado> misEmpleados;
	private ArrayList<Plan> misPlanes;

	public SafePet() {
		
		misAfiliados= new ArrayList<Afiliado>();	
		misEmpleados= new ArrayList<Empleado>();
		misPlanes = new ArrayList<Plan>();
	}
	
	public void agregarFuncionario() {
		
		Empleado miEmpleado = new Empleado(1234, "Luis Miguel Mejia", "3007502536", "Armenia", "luisMiguel@gmail.com", 30, 1002, 2000000);
		misEmpleados.add(miEmpleado);
	}
	
	public void agregarUsuario( Afiliado miAfiliado ) {
		int credencial = misAfiliados.size() + 1;
		miAfiliado.setCredencial(credencial);
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
			valorConsultas = 15000;
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
			descuento = base * 0.0010;
			valorTotal = (base - descuento) / 3;
			respuesta += " Por un periodo de 3 meses \n\n";
		}
		
		if(seis == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 6 * contadorMascotas;
			descuento = base * 0.0015;
			valorTotal = (base - descuento) / 6;
			respuesta += " Por un periodo de 6 meses \n\n";
		}
		
		if(doce == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 12 * contadorMascotas;
			descuento = base * 0.0025;
			valorTotal = (base - descuento) / 12;
			respuesta += " Por un periodo de 12 meses \n\n";
		}
		
		respuesta += "El valor total del plan mensual es: " + valorTotal + "\nCon cobertura para "+contadorMascotas+" mascota(s)";
		
		return respuesta;
	}
	
	public double valorPlan(int contadorMascotas, boolean consultas, boolean ambulancia, boolean asistencia, boolean tres, boolean seis, boolean doce) {
		
		double valorConsultas = 0;
		double valorAmbulancia = 0;
		double valorAsistencia = 0;
		double valorTotal = 0;
		double descuento = 0.0;
		
		if(consultas == true) {
			valorConsultas = 15000;
		}
		
		if(ambulancia == true) {
			valorAmbulancia = 10000;
		}
		
		if(asistencia == true) {
			valorAsistencia = 8000;
		}
		
		if(tres == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 3 * contadorMascotas;
			descuento = base * 0.0010;
			valorTotal = (base - descuento) / 3;
		}
		
		if(seis == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 6 * contadorMascotas;
			descuento = base * 0.0015;
			valorTotal = (base - descuento) / 6;
		}
		
		if(doce == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 12 * contadorMascotas;
			descuento = base * 0.0025;
			valorTotal = (base - descuento) / 12;
		}
				
		return valorTotal;
	}
	

	public double calcularCopago(double valorPlan) {
					
		return valorPlan * 0.05;
	}

	public boolean validarPersona(String tipoPersona, int id) {
		
		boolean validacion = false;
		
		if(tipoPersona == "Funcionario") {
			
			for (int i = 0; i < misEmpleados.size(); i++) {
				
				Empleado miF = misEmpleados.get(i);
				
				if(miF.getId() == id) {
					validacion = true;
				}
				
			}
		}
		
		if(tipoPersona == "Afiliado") {
			for (int i = 0; i < misAfiliados.size(); i++) {
				
				Afiliado miA = misAfiliados.get(i);
				
				if(miA.getId() == id) {
					validacion = true;
				}
				
			}
		}
		
		return validacion;
	}

	public Afiliado buscarUsuario(int id) {
		
		Afiliado miAfiliado = null;
		
		for (int i = 0; i < misAfiliados.size(); i++) {
			
			Afiliado miA = misAfiliados.get(i);
			
			if(miA.getId() == id) {
				miAfiliado = miA;
			}
		}
		return miAfiliado;
	}

	public Empleado buscarFuncionario(int id) {
		Empleado miEmpleado = null;
		
		for (int i = 0; i < misEmpleados.size(); i++) {
			
			Empleado miE = misEmpleados.get(i);
			
			if(miE.getId() == id) {
				miEmpleado = miE;
			}
		}
		return miEmpleado;
	}

	public void agregarPlan(Plan miPlan) {
		
		int contadorPlanes = misPlanes.size() + 1;
		miPlan.setCodigo(contadorPlanes);
		misPlanes.add(miPlan);
	}
	
}
