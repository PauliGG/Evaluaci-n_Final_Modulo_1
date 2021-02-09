package entidad;

public class Capacitacion {
	
	//Atributos
	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private Integer cantidadDeAsistentes;
	
	private Cliente cliente;   //Multiplicidad: Cliente 1 -  0..* Capacitacion

	//Constructores
	public Capacitacion() {     
		
	}

	public Capacitacion(Integer identificador, Integer rutCliente, String dia, String hora, String lugar, String duracion,
			Integer cantidadDeAsistentes) {
		
		this.identificador = identificador;
		this.rutCliente = rutCliente ;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}

	// Métodos accesores
	public Integer getIdentificador() {
		return identificador;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public String getLugar() {
		return lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public Integer getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}
	
	//Métodos mutadores
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setCantidadDeAsistentes(Integer cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCapacitacion=" + rutCliente + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes=" + cantidadDeAsistentes
				+ "]";
	}
	
	//Metodos adicionales
	public String mostrarDetalle(){	
		return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos";
	}

}
