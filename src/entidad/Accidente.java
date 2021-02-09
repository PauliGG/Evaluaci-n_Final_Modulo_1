package entidad;

public class Accidente {
	
	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	private Cliente cliente; //Multiplicidad: Cliente 1 - 0..* Accidente
	
	public Accidente() {
		
	}

	public Accidente(Integer identificador, Integer rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencias) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

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

	public String getOrigen() {
		return origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

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

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", Consecuencias=" + consecuencias + "]";
	}
	
}
