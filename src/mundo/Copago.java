package mundo;

import java.util.ArrayList;

public class Copago {
	
	private int codigo;
	private int codigoPrestacion;
	private Afiliado miAfiliado;
	private double valor;
	
	public Copago(int codigo, int codigoPrestacion, Afiliado miAfiliado, double valor) {
		super();
		this.codigo = codigo;
		this.codigoPrestacion = codigoPrestacion;
		this.miAfiliado = miAfiliado;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoPrestacion() {
		return codigoPrestacion;
	}

	public void setCodigoPrestacion(int codigoPrestacion) {
		this.codigoPrestacion = codigoPrestacion;
	}

	public Afiliado getMiAfiliado() {
		return miAfiliado;
	}

	public void setMiAfiliado(Afiliado miAfiliado) {
		this.miAfiliado = miAfiliado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
