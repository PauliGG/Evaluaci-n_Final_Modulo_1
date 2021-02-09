package entidad;

import java.util.ArrayList;
import java.util.List;

//Clase hija de Usuario
public class Cliente  extends Usuario {
	
	//Atributos
	private Integer rut;
	private String nombre;
	private String apellido;
	private String telefono;
	private String afp;
	private Integer sistemaDeSalud;
	private String direccion;
	private String comuna;
	private Integer edad;
	
	private List<Capacitacion> capacitaciones;   //Multiplicidad: Cliente 1 -  0..* Capacitacion
	
	private List<Accidente> accidentes;   //Multiplicidad: Cliente 1 - 0..* Accidente
	
	private List<VisitaEnTerreno> visitasEnTerreno; //Multiplicidad: Cliente 1 - 1..* VisitaEnTerreno
	
	//Constructores
	public Cliente() {
		
		capacitaciones = new ArrayList<Capacitacion>(); 
		accidentes = new ArrayList<Accidente>(); 
		visitasEnTerreno = new ArrayList<VisitaEnTerreno>(); 
		
	}
	
	public Cliente(String nombreUsuario, String fechaNacimiento, Integer run, Integer rut, String nombre,
			String apellido, String telefono, String afp, Integer sistemaDeSalud, String direccion, String comuna,
			Integer edad, List<Capacitacion> capacitaciones ) {
		
		super(nombreUsuario, fechaNacimiento, run);
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.capacitaciones= capacitaciones; 
	}

	// Métodos accesores
	public Integer getRut() {
		return rut;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getAfp() {
		return afp;
	}

	public Integer getSistemaDeSalud() {
		return sistemaDeSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public Integer getEdad() {
		return edad;
	}
	
	//Métodos mutadores
	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public void setSistemaDeSalud(Integer sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaDeSalud=" + sistemaDeSalud + ", direccion=" + direccion + ", comuna="
				+ comuna + ", edad=" + edad + "]";
	}
	
	//Metodos Adicionales	
	public String obtenerNombre() {
		return this.nombre + " "+ this.apellido ;	
	}
	
	public void obtenerSistemaSalud() {	
		String resultado=null;

		if(sistemaDeSalud==1) {
			resultado="Fonasa";
		}else {
			resultado="Isapre";		
		}
		
		System.out.println("tipo de sistema de salud: "+resultado);
	}
	
	@Override
	public void analizarUsuario() {
		// Debe desplegar la información de padre mas algunas de la hija
		super.analizarUsuario();
		System.out.println("Cliente [direccion=" + direccion + ", comuna="
				+ comuna + "]" );	
	}
	
}
