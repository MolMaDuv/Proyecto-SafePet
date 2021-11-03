package mundo;

public class Plan {
	private int codigo;
	private String detalle;
	private double valor;
	private int numeroAfiliados;
	
	
	/**
	 * @return the numeroAfiliados
	 */
	public int getNumeroAfiliados() {
		return numeroAfiliados;
	}
	/**
	 * @param numeroAfiliados the numeroAfiliados to set
	 */
	public void setNumeroAfiliados(int numeroAfiliados) {
		this.numeroAfiliados = numeroAfiliados;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}
	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
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
	public Plan(int codigo, String detalle, double valor, int numeroAfiliados) {
		super();
		this.codigo = codigo;
		this.detalle = detalle;
		this.valor = valor;
		this.numeroAfiliados = numeroAfiliados;
	}
	
	@Override
	public String toString() {
		return "Plan [codigo=" + codigo + ", detalle=" + detalle + ", valor=" + valor + ", numeroAfiliados="
				+ numeroAfiliados + "]";
	}
	
	
	
	

}
