package mundo;

import java.util.Date;

public class Beneficiario {
	
	private int codigoMascota;
	private int edad;
	private String nombre;
	private String raza;
	private double peso;
	private int altura;
	private String color;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
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
	public String getColor() {
		return color;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public Beneficiario(int codigoMascota, int edad, String nombre, String raza, double peso, int altura,
			String color) {
		super();
		this.codigoMascota = codigoMascota;
		this.edad = edad;
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.altura = altura;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Beneficiario [codigoMascota = " + codigoMascota + ", Edad = " + edad + ", nombre = "
				+ nombre + ", raza = " + raza + ", peso = " + peso + ", altura = " + altura + ", color = " + color
				+ "]";
	}
	
	
	

}
