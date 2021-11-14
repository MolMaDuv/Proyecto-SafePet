package mundo;

import java.util.ArrayList;

public class Copago {
	
	int codigo;
	private Afiliado miAfiliado;
	private double valor;
	
	
	
	
	
	public Copago(int codigo, Afiliado miAfiliado, double valor) {
		super();
		this.codigo = codigo;
		this.miAfiliado = miAfiliado;
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
