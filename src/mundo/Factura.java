package mundo;

import java.util.Date;

public class Factura {

	private int codigoFactura;
	private Date fechaFactura;
	private int codigoAfiliado;
	private int codigoMascota;
	private int codVeterinario;
	private String descripcion;
	private double valor;
	/**
	 * @return the codigoFactura
	 */
	public int getCodigoFactura() {
		return codigoFactura;
	}
	/**
	 * @param codigoFactura the codigoFactura to set
	 */
	public void setCodigoFactura(int codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	/**
	 * @return the fechaFactura
	 */
	public Date getFechaFactura() {
		return fechaFactura;
	}
	/**
	 * @param fechaFactura the fechaFactura to set
	 */
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	/**
	 * @return the codigoAfiliado
	 */
	public int getCodigoAfiliado() {
		return codigoAfiliado;
	}
	/**
	 * @param codigoAfiliado the codigoAfiliado to set
	 */
	public void setCodigoAfiliado(int codigoAfiliado) {
		this.codigoAfiliado = codigoAfiliado;
	}
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
	 * @return the codVeterinario
	 */
	public int getCodVeterinario() {
		return codVeterinario;
	}
	/**
	 * @param codVeterinario the codVeterinario to set
	 */
	public void setCodVeterinario(int codVeterinario) {
		this.codVeterinario = codVeterinario;
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
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Factura(int codigoFactura, Date fechaFactura, int codigoAfiliado, int codigoMascota, int codVeterinario,
			String descripcion, double valor) {
		super();
		this.codigoFactura = codigoFactura;
		this.fechaFactura = fechaFactura;
		this.codigoAfiliado = codigoAfiliado;
		this.codigoMascota = codigoMascota;
		this.codVeterinario = codVeterinario;
		this.descripcion = descripcion;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", fechaFactura=" + fechaFactura + ", codigoAfiliado="
				+ codigoAfiliado + ", codigoMascota=" + codigoMascota + ", codVeterinario=" + codVeterinario
				+ ", descripcion=" + descripcion + ", valor=" + valor + "]";
	}
	
	
	
	
}
