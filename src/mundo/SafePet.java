package mundo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class SafePet {

	private ArrayList<Afiliado> misAfiliados;
	private ArrayList<Empleado> misEmpleados;
	private ArrayList<Plan> misPlanes;
	private ArrayList<Prestacion> misPrestaciones;
	private ArrayList<Calificacion> misCalificaciones;
	private ArrayList<Copago> misCopagos;

	public SafePet() {

		misAfiliados = new ArrayList<Afiliado>();
		misEmpleados = new ArrayList<Empleado>();
		misPlanes = new ArrayList<Plan>();
		misCalificaciones = new ArrayList<Calificacion>();
		misPrestaciones = new ArrayList<Prestacion>();
		misCopagos = new ArrayList<Copago>();
	}

	public void agregarFuncionario() {

		Empleado miEmpleado = new Empleado(1234, "Luis Miguel Mejia", "3007502536", "Armenia", "luisMiguel@gmail.com",
				30, 1002, 2000000);
		misEmpleados.add(miEmpleado);
	}

	public void agregarUsuario() {
		Afiliado miAfiliado = new Afiliado(12, "Margarita", "314747", "Armenia", "mar@gmail.com", 30, 1);
		misAfiliados.add(miAfiliado);
	}

	public void agregarUsuario(Afiliado miAfiliado) {
		int credencial = misAfiliados.size() + 1;
		miAfiliado.setCredencial(credencial);
		misAfiliados.add(miAfiliado);
	}

	public boolean validarExistenciaUsuario(int id) {

		boolean validacion = false;

		for (int i = 0; i < misAfiliados.size(); i++) {

			Afiliado miAfiliado = misAfiliados.get(i);
			int idGuardado = miAfiliado.getId();

			if (idGuardado == id) {
				validacion = true;
			}
		}

		return validacion;
	}

	public String registrarCopago(int prestacion) {
		Prestacion miPrestacion;
		Plan miPlan;
		String mensaje = "Informacion de Copago  \n\n";
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		int codigoArray = 0;

		for (int i = 0; i < misPrestaciones.size(); i++) {

			miPrestacion = misPrestaciones.get(i);
			if (miPrestacion.getCodigoConsulta() == prestacion) {

				int cedula = miPrestacion.getCodigoAfiliado();
				for (int j = 0; j < misPlanes.size(); j++) {
					miPlan = misPlanes.get(j);

					if (misPlanes.get(j).getMiAfiliado().getId() == cedula) {

						mensaje += "Fecha:" + timeStamp + "\nCodigo Afiliado: " + miPrestacion.getCodigoAfiliado() + "\nCodigo atencion"
								+ miPrestacion.getCodigoConsulta() + "\nValor a Pagar: " + miPlan.getValor();

						String copago = "Codigo Afiliado: " + miPrestacion.getCodigoAfiliado() + ""
								+ miPrestacion.getCodigoConsulta() + "Valor a Pagar: " + miPlan.getValor();

						codigoArray = misCopagos.size() + 1;

						Copago miCopago = new Copago(codigoArray, prestacion, misPlanes.get(j).getMiAfiliado(), miPlan.getValor());

						misCopagos.add(miCopago);

					}

				}
			}

		}
		return mensaje;
	}

	public String calcularPlanSimulacion(int contadorMascotas, boolean consultas, boolean ambulancia,
			boolean asistencia, boolean tres, boolean seis, boolean doce) {

		String respuesta = "Su plan contara con los siguientes beneficios: \n";
		double valorConsultas = 0;
		double valorAmbulancia = 0;
		double valorAsistencia = 0;
		double valorTotal = 0;
		double descuento = 0.0;

		if (consultas == true) {
			valorConsultas = 15000;
			respuesta += " - Consultas ilimitadas \n";
		}

		if (ambulancia == true) {
			valorAmbulancia = 10000;
			respuesta += " - Ambulancia las 24 horas \n";
		}

		if (asistencia == true) {
			valorAsistencia = 8000;
			respuesta += " - Asistencia en casa \n\n";
		}

		if (tres == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 3 * contadorMascotas;
			descuento = base * 0.0010;
			valorTotal = (base - descuento) / 3;
			respuesta += " Por un periodo de 3 meses \n\n";
		}

		if (seis == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 6 * contadorMascotas;
			descuento = base * 0.0015;
			valorTotal = (base - descuento) / 6;
			respuesta += " Por un periodo de 6 meses \n\n";
		}

		if (doce == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 12 * contadorMascotas;
			descuento = base * 0.0025;
			valorTotal = (base - descuento) / 12;
			respuesta += " Por un periodo de 12 meses \n\n";
		}

		respuesta += "El valor total del plan mensual es: " + valorTotal + "\nCon cobertura para " + contadorMascotas
				+ " mascota(s)";

		return respuesta;
	}

	public double valorPlan(int contadorMascotas, boolean consultas, boolean ambulancia, boolean asistencia,
			boolean tres, boolean seis, boolean doce) {

		double valorConsultas = 0;
		double valorAmbulancia = 0;
		double valorAsistencia = 0;
		double valorTotal = 0;
		double descuento = 0.0;

		if (consultas == true) {
			valorConsultas = 15000;
		}

		if (ambulancia == true) {
			valorAmbulancia = 10000;
		}

		if (asistencia == true) {
			valorAsistencia = 8000;
		}

		if (tres == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 3 * contadorMascotas;
			descuento = base * 0.0010;
			valorTotal = (base - descuento) / 3;
		}

		if (seis == true) {
			double base = (valorConsultas + valorAmbulancia + valorAsistencia) * 6 * contadorMascotas;
			descuento = base * 0.0015;
			valorTotal = (base - descuento) / 6;
		}

		if (doce == true) {
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

		if (tipoPersona == "Funcionario") {

			for (int i = 0; i < misEmpleados.size(); i++) {

				Empleado miF = misEmpleados.get(i);

				if (miF.getId() == id) {
					validacion = true;
				}

			}
		}

		if (tipoPersona == "Afiliado") {
			for (int i = 0; i < misAfiliados.size(); i++) {

				Afiliado miA = misAfiliados.get(i);

				if (miA.getId() == id) {
					validacion = true;
				}

			}
		}

		return validacion;
	}

	public Prestacion buscarPrestacionD(int id) {

		Prestacion miPrestacion = null;

		for (int i = 0; i < misPrestaciones.size(); i++) {

			Prestacion miA = misPrestaciones.get(i);

			if (miA.getCodigoConsulta() == id) {
				miPrestacion = miA;
			}
		}
		return miPrestacion;
	}

	public Afiliado buscarUsuario(int id) {

		Afiliado miAfiliado = null;

		for (int i = 0; i < misAfiliados.size(); i++) {

			Afiliado miA = misAfiliados.get(i);

			if (miA.getId() == id) {
				miAfiliado = miA;
			}
		}
		return miAfiliado;
	}

	public Empleado buscarFuncionario(int id) {
		Empleado miEmpleado = null;

		for (int i = 0; i < misEmpleados.size(); i++) {

			Empleado miE = misEmpleados.get(i);

			if (miE.getId() == id) {
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

	public void agregarRegistroAtencion(Prestacion miPrestacion) {

		int contadorRegistrosAtencion = misPrestaciones.size() + 1;
		miPrestacion.setCodigoConsulta(contadorRegistrosAtencion);
		misPrestaciones.add(miPrestacion);

		JOptionPane.showMessageDialog(null, "Prestacion No. " + contadorRegistrosAtencion + "\n\nRegistrada con exito");
	}

	public ArrayList<Prestacion> buscarPrestaciones(int id)

	{
		ArrayList<Prestacion> buscado = new ArrayList<Prestacion>();

		for (int i = 0; i < misPrestaciones.size(); i++) {
			int miA = misPrestaciones.get(i).getCodigoAfiliado();
			if (miA == id) {
				buscado.add(misPrestaciones.get(i));
			}

		}

		return buscado;
	}

	public String revisarPlan(int idAfiliado) {
		String msj = "";

		for (int i = 0; i < misPlanes.size(); i++) {

			Afiliado miPlanAfiliado = misPlanes.get(i).getMiAfiliado();
			int idGuardado = miPlanAfiliado.getId();

			if ((idGuardado) == idAfiliado) {
				// Codigo
				msj += misPlanes.get(i).getCodigo() + "\n";
				// copago
				msj += misPlanes.get(i).getCopago() + "\n";
				// Cantidad mascotas
				msj += obtenerMisBeneficios(misPlanes.get(i).getMisBeneficiarios()) + "\n";
				// valor
				msj += misPlanes.get(i).getValor() + "\n";
				// Servicio Ambulancia
				msj += misPlanes.get(i).isAmbulancia() + "\n";
				// Servicio Asistencia
				msj += misPlanes.get(i).isAsistenciaCasa() + "\n";
				// Servicio consultas
				msj += misPlanes.get(i).isConsultas() + "\n";

			}
		}
		return msj;
	}

	private String obtenerMisBeneficios(ArrayList<Beneficiario> misMascotas) {
		// TODO Auto-generated method stub
		int acum = 0;
		for (int i = 0; i < misMascotas.size(); i++) {
			acum++;
		}

		return "" + acum;
	}

	public String evaluarServicio(int idPersona, int numEstrellas, String observaciones) {
		Calificacion miCalificacion = new Calificacion(idPersona, numEstrellas, observaciones);
		String nombre = buscarPorId(idPersona);
		misCalificaciones.add(miCalificacion);
		String mensaje = "Sr(a) " + nombre + "\n\n" + "Ha calificado con " + numEstrellas
				+ " Estrellas nuestros servicios" + "\n\n" + "Observaciones: " + observaciones + "\n\n"
				+ "Calificacion exitosa";
		return mensaje;

	}

	private String buscarPorId(int idPersona) {
		String nombreAfiliado = "";
		boolean encontrado = false;
		for (int i = 0; i < misAfiliados.size() && !encontrado; i++) {
			if (misAfiliados.get(i).getId() == idPersona) {
				encontrado = true;
				nombreAfiliado = misAfiliados.get(i).getNombre();
			}

		}
		return nombreAfiliado;
	}

	public void consultarCopago(int id) {

		Plan miPlan = null;
		int miAfiliado;
		boolean bandera = true;

		for (int i = 0; i < misPlanes.size(); i++) {

			String mensaje = "---------------Informacion Copago  -------------------" + "\n";
			miPlan = misPlanes.get(i);
			miAfiliado = miPlan.getMiAfiliado().getId();
			String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

			if (miAfiliado == id) {
				JOptionPane.showMessageDialog(null, mensaje + "Fecha:" + timeStamp + "\n " + "Afiliado: " + id + "\n"
						+ "Plan No: " + miPlan.getCodigo() + "\n" + "Costo: " + miPlan.getCopago());
				bandera = false;
				;
			}

		}

		if (bandera) {
			JOptionPane.showMessageDialog(null, "El afiliado no tiene ningun copago registrado", "Error",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	public ArrayList<Beneficiario> traerBeneficiarios(String idAfiliado) {
		int idAfiliadoC = Integer.parseInt(idAfiliado);
		ArrayList<Beneficiario> listaMascotasDeAfiliado = new ArrayList<Beneficiario>();
		boolean bandera = false;
		for (int i = 0; i < misPlanes.size() && !bandera; i++) {

			Afiliado miPlanAfiliado = misPlanes.get(i).getMiAfiliado();
			int idGuardado = miPlanAfiliado.getId();

			if (idGuardado == idAfiliadoC) {
				bandera = true;
				listaMascotasDeAfiliado = misPlanes.get(i).getMisBeneficiarios();
				return listaMascotasDeAfiliado;

			}

		}
		return listaMascotasDeAfiliado;

	}

	public boolean validarExistenciaUsuarioEnPlan(String idAfiliado) {
		int idAfiliadoC = Integer.parseInt(idAfiliado);
		boolean bandera = false;

		for (int i = 0; i < misPlanes.size() && !bandera; i++) {
			Afiliado miPlanAfiliado = misPlanes.get(i).getMiAfiliado();
			int idGuardado = miPlanAfiliado.getId();
			if (idGuardado == idAfiliadoC) {
				bandera = true;
			}
		}
		return bandera;
	}

	public void añadirBeneficiarioAlplan(String idAfiliado, Beneficiario miBeneficiario) {
		int idAfiliadoC = Integer.parseInt(idAfiliado);
		ArrayList<Beneficiario> listaMascotasDeAfiliado = new ArrayList<Beneficiario>();

		boolean bandera = false;
		for (int i = 0; i < misPlanes.size() && !bandera; i++) {

			Afiliado miPlanAfiliado = misPlanes.get(i).getMiAfiliado();
			int idGuardado = miPlanAfiliado.getId();

			if (idGuardado == idAfiliadoC) {
				bandera = true;
				listaMascotasDeAfiliado = misPlanes.get(i).getMisBeneficiarios();
				listaMascotasDeAfiliado.add(miBeneficiario);
				misPlanes.get(i).setMisBeneficiarios(listaMascotasDeAfiliado);
				
				Plan miPlan = misPlanes.get(i);
				
				int contadorMascotas = miPlan.getMisBeneficiarios().size();
				boolean consultas = miPlan.isConsultas();
				boolean ambulancia = miPlan.isAmbulancia();
				boolean asistencia = miPlan.isAsistenciaCasa();
				int tiempo = miPlan.getTiempo();
				boolean tres = false;
				boolean seis = false;
				boolean doce = false;
				
				if(tiempo == 3) {
					tres = true;
				}
				
				if(tiempo == 6) {
					seis = true;
				}
				
				if(tiempo == 12) {
					doce = true;
				}
				
				double valor = valorPlan(contadorMascotas, consultas, ambulancia, asistencia, tres, seis, doce);
				miPlan.setValor(valor);
				JOptionPane.showMessageDialog(null, "El nuevo valor de su plan es: " + valor, "Nuevo valor",
						JOptionPane.WARNING_MESSAGE);
			}

		}
	}

	public boolean isInteger(String texto) {
		try {
			Integer.valueOf(texto);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean validarPagoCopago(int prestacion) {
		
		boolean validacion = false;
		
		for (int i = 0; i < misCopagos.size(); i++) {
			
			Copago miCopago = misCopagos.get(i);
			int codigo = miCopago.getCodigoPrestacion();
			
			if(codigo == prestacion) {
				validacion = true;
			}
		}
		
		return validacion;
	}

	public boolean validarCodigoMascota(int codigoAfiliado, int codigoMascota) {
		
		boolean validacion = false;
		
		for (int i = 0; i < misPlanes.size(); i++) {
			
			Plan miPlan = misPlanes.get(i);
			
			if(miPlan.getMiAfiliado().getId() == codigoAfiliado) {
				
				for (int j = 0; j < miPlan.getMisBeneficiarios().size(); j++) {
					
					Beneficiario miBeneficiario = miPlan.getMisBeneficiarios().get(j);
					
					if(miBeneficiario.getCodigo() == codigoMascota) {
						validacion = true;
					}
					
				}
			}
			
		}
		
		return validacion;
	}

}
