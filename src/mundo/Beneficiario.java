package mundo;

import java.util.Date;

public class Beneficiario {
	
	private int edad;
	private String nombre;
	private String raza;
	private int codigo;
	private int altura;
	private String color;
	
	public Beneficiario(int edad, String nombre, String raza, int codigo, int altura, String color) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.raza = raza;
		this.codigo = codigo;
		this.altura = altura;
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
