package mundo;

import java.util.ArrayList;

public class Plan {
	private int codigo;
	private boolean consultas;
	private boolean ambulancia;
	private boolean asistenciaCasa;
	private double valor;
	private double copago;
	private Afiliado miAfiliado;
	private ArrayList<Beneficiario> misBeneficiarios;
	private int tiempo;
	private String metodoPago;
	
	public Plan(int codigo, boolean consultas, boolean ambulancia, boolean asistenciaCasa, double valor, double copago,
			Afiliado miAfiliado, ArrayList<Beneficiario> misBeneficiarios, int tiempo, String metodoPago) {
		super();
		this.codigo = codigo;
		this.consultas = consultas;
		this.ambulancia = ambulancia;
		this.asistenciaCasa = asistenciaCasa;
		this.valor = valor;
		this.copago = copago;
		this.miAfiliado = miAfiliado;
		this.misBeneficiarios = misBeneficiarios;
		this.tiempo = tiempo;
		this.metodoPago = metodoPago;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isConsultas() {
		return consultas;
	}

	public void setConsultas(boolean consultas) {
		this.consultas = consultas;
	}

	public boolean isAmbulancia() {
		return ambulancia;
	}

	public void setAmbulancia(boolean ambulancia) {
		this.ambulancia = ambulancia;
	}

	public boolean isAsistenciaCasa() {
		return asistenciaCasa;
	}

	public void setAsistenciaCasa(boolean asistenciaCasa) {
		this.asistenciaCasa = asistenciaCasa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getCopago() {
		return copago;
	}

	public void setCopago(double copago) {
		this.copago = copago;
	}

	public Afiliado getMiAfiliado() {
		return miAfiliado;
	}

	public void setMiAfiliado(Afiliado miAfiliado) {
		this.miAfiliado = miAfiliado;
	}

	public ArrayList<Beneficiario> getMisBeneficiarios() {
		return misBeneficiarios;
	}

	public void setMisBeneficiarios(ArrayList<Beneficiario> misBeneficiarios) {
		this.misBeneficiarios = misBeneficiarios;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
}
