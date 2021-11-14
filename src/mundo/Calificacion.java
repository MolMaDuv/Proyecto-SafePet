package mundo;

public class Calificacion {

	private int codigoUsuario; 
	private int calificacion;
	private String opinion;
	
	
	public Calificacion(int codigoUsuario, int calificacion, String opinion) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.calificacion = calificacion;
		this.opinion = opinion;
	}


	public int getCodigoUsuario() {
		return codigoUsuario;
	}


	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	public String getOpinion() {
		return opinion;
	}


	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
}
