package entidad;

//Clase hija de Usuario
public class Profesional extends Usuario {
	
	private String titulo;
	private String fechaDeIngreso;
	
	//Constructores
	public Profesional() {
	
	}
	
	public Profesional(String nombreUsuario, String fechaNacimiento, Integer run, String titulo, String fechaDeIngreso) {
		super(nombreUsuario, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	// Métodos accesores
	public String getTitulo() {
		return titulo;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	//Métodos mutadores
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaDeIngreso=" + fechaDeIngreso + "]";
	}
	
	//Metodos Adicionales
	@Override
	public void analizarUsuario() {
		//Debe desplegar la información de padre mas algunas de la hija
		super.analizarUsuario();
		System.out.println("Profesional [titulo=" + titulo + ", fechaDeIngreso=" + fechaDeIngreso + "]");
	}
	

}
