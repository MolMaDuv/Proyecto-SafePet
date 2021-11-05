package mundo;

public class Empleado extends Persona {
	
	private int numeroContrato;
	private double salario;
	

	/**
	 * @return the numeroContrato
	 */
	public int getNumeroContrato() {
		return numeroContrato;
	}


	/**
	 * @param numeroContrato the numeroContrato to set
	 */
	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}


	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}


	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Empleado(int id, String nombre, String telefono, String direccion, String correo, int edad,
			int numeroContrato, double salario) {
		super(id, nombre, telefono, direccion, correo, edad);
		this.numeroContrato = numeroContrato;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [numeroContrato=" + numeroContrato + ", salario=" + salario + "]";
	}


	

}
