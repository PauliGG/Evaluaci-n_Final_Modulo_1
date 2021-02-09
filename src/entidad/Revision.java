package entidad;


public class Revision {
	
	private Integer identificador;
	private Integer identificadorVisitaTerreno;
	private String nombreRevision;
	private String detalle;
	private Integer estado;
	
	private VisitaEnTerreno visitaEnTerreno;   //Multiplicidad: VisitaEnTerreno 1 - 1..* revision
	
	public Revision() {
	
	}

	public Revision(Integer identificador, Integer identificadorVisitaTerreno, String nombreRevision, String detalle,
			Integer estado) {
		
		this.identificador = identificador;
		this.identificadorVisitaTerreno = visitaEnTerreno.getIdentificador();
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public Integer getIdentificadorVisitaTerreno() {
		return identificadorVisitaTerreno;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public void setIdentificadorVisitaTerreno(Integer identificadorVisitaTerreno) {
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [identificador=" + identificador + ", identificadorVisitaTerreno=" + identificadorVisitaTerreno
				+ ", nombreRevision=" + nombreRevision + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
	
	
	

}
