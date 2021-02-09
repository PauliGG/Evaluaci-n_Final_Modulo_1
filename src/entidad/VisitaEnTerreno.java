package entidad;

import java.util.ArrayList;
import java.util.List;

public class VisitaEnTerreno {
	
	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar; 
	private String comentarios;
	
	private Cliente cliente;   //Multiplicidad: Cliente 1 - 1..* VisitaEnTerreno
	private List<Revision> revisiones;   //Multiplicidad: VisitaEnTerreno 1 - 1..* revision
	
	public VisitaEnTerreno() {	
		revisiones = new ArrayList<Revision>(); 	 
	}
	
	public VisitaEnTerreno(Integer identificador, Integer rutCliente, String dia, String hora, String lugar,
			String comentarios, List<Revision> revisiones ) {
		this.identificador = identificador;
		this.rutCliente = cliente.getRut();
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.revisiones =  revisiones ; 
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

	public String getComentarios() {
		return comentarios;
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

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaEnTerreno [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	} 
	
	
	

}
