package mundo;

import java.util.Date;

public class Beneficiario {
	
	private int codigoMascota;
	private Date fechaNacimiento;
	private String nombre;
	private String raza;
	private double peso;
	private int altura;
	private String descripcion;
	/**
	 * @return the codigoMascota
	 */
	public int getCodigoMascota() {
		return codigoMascota;
	}
	/**
	 * @param codigoMascota the codigoMascota to set
	 */
	public void setCodigoMascota(int codigoMascota) {
		this.codigoMascota = codigoMascota;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}
	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Beneficiario(int codigoMascota, Date fechaNacimiento, String nombre, String raza, double peso, int altura,
			String descripcion) {
		super();
		this.codigoMascota = codigoMascota;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.altura = altura;
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Beneficiario [codigoMascota=" + codigoMascota + ", fechaNacimiento=" + fechaNacimiento + ", nombre="
				+ nombre + ", raza=" + raza + ", peso=" + peso + ", altura=" + altura + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	

}
