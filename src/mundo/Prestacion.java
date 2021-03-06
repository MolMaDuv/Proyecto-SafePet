package mundo;

import java.util.Date;

public class Prestacion {

	public int getCodigoAfiliado() {
		return codigoAfiliado;
	}
	public void setCodigoAfiliado(int codigoAfiliado) {
		this.codigoAfiliado = codigoAfiliado;
	}
	private int codigoConsulta;
	private int codigoAfiliado;
	private int codigoBeneficiario;
	private String fechaConsulta;
	private String motivo;
	private String diagnostico;
	private String tratamiento;
	/**
	 * @return the codigoConsulta
	 */
	public int getCodigoConsulta() {
		return codigoConsulta;
	}
	/**
	 * @param codigoConsulta the codigoConsulta to set
	 */
	public void setCodigoConsulta(int codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}
	/**
	 * @return the fechaConsulta
	 */
	public String getFechaConsulta() {
		return fechaConsulta;
	}
	/**
	 * @param fechaConsulta the fechaConsulta to set
	 */
	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	/**
	 * @return the motivo
	 */
	public String getMotivo() {
		return motivo;
	}
	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
	}
	/**
	 * @param diagnostico the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	/**
	 * @return the tratamiento
	 */
	public String getTratamiento() {
		return tratamiento;
	}
	/**
	 * @param tratamiento the tratamiento to set
	 */
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	
	public int getCodigoBeneficiario() {
		return codigoBeneficiario;
	}
	public void setCodigoBeneficiario(int codigoBeneficiario) {
		this.codigoBeneficiario = codigoBeneficiario;
	}
	public Prestacion(int codigoConsulta, int codigoAfiliado, int codigoBeneficiario, String fechaConsulta,
			String motivo, String diagnostico, String tratamiento) {
		super();
		this.codigoConsulta = codigoConsulta;
		this.codigoAfiliado = codigoAfiliado;
		this.codigoBeneficiario = codigoBeneficiario;
		this.fechaConsulta = fechaConsulta;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}
	@Override
	public String toString() {
		return "Consulta [codigoConsulta=" + codigoConsulta + ", fechaConsulta=" + fechaConsulta + ", motivo=" + motivo
				+ ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + "]";
	}
	
	
	
}
