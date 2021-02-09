package entidad;


//Clase hija de Usuario
public class Administrativo extends Usuario{
	
	private String area ; 
	private String experienciaPrevia ;
	
	//Constructores
	public void administrativo() {

	}
	
	public Administrativo(String nombreUsuario, String fechaNacimiento, Integer run, String area, String experienciaPrevia) {
		super(nombreUsuario, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	// Métodos accesores
	public String getArea() {
		return area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	
	//Métodos mutadores
	public void setArea(String area) {
		this.area = area;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
	
	//Metodos Adicionales
	@Override
	public void analizarUsuario() {
		//Debe desplegar la información de padre mas algunas de la hija
		super.analizarUsuario();
		System.out.println("Administrativo [area=" + area + ", experienciaPrevia="
				+ experienciaPrevia + "]");
	}
 
}
