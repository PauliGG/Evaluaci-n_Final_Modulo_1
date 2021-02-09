package entidad;

import java.time.LocalDate;

//Clase padre
public class Usuario implements Asesoria {
	
	//Atributos
	private String nombreUsuario;
	private String fechaNacimiento;
	private Integer run;
	
	//Constructores 
	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String fechaNacimiento, Integer run) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	//Métodos accesores
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Integer getRun() {
		return run;
	}

	//Métodos mutadores
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ "]";
	}
	
	//Metodos Adicionales
	public String mostrarEdad() {
		LocalDate anyoActual = LocalDate.now(); // Entrega la fecha actual

		Integer anyo = Integer.parseInt(fechaNacimiento.substring(fechaNacimiento.length() - 4));
		Integer edad = anyoActual.getYear() - anyo;
		return "El usuario tiene " + edad + " años";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("Usuario [nombreUsuario=" + nombreUsuario + ", run=" + run + "] ");
	}
	
}
