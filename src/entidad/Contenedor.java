package entidad;

import java.util.List;
//import entidad.Usuario;

public class Contenedor  {
	
	private List<Asesoria> listaDeInstancias  ; //Almacenados distintos tipos de usuarios
	private List<Capacitacion> listaDeObjetos  ; //Almacenados distintos tipos de objetos
	
	//Principio de Inversión de Dependencias
	public Contenedor(List<Asesoria> listaDeInstancias, List<Capacitacion> listaDeObjetos ) {
		this.listaDeInstancias = listaDeInstancias;
		this.listaDeObjetos = listaDeObjetos;
	}
	
	public void almacenarCliente(Asesoria elemento){
		listaDeInstancias.add(elemento);
	}
	
	public void almacenarProfesional(Asesoria elemento){
		listaDeInstancias.add(elemento);
	}
	
	public void almacenarAdministrativo(Asesoria elemento){
		listaDeInstancias.add(elemento);
	}
	
	public void almacenarCapacitacion(Capacitacion elemento){
		listaDeObjetos.add(elemento);
	}
	
	public void eliminarUsuario(Integer rut){ //falta
		for(int i = 0; i<listaDeInstancias.size(); i ++) {
			
			Usuario usuario = (Usuario)listaDeInstancias.get(i) ; 
			
			if(usuario.getRun().equals(rut)) {
				
				listaDeInstancias.remove(i);
				
			}else {
				//System.out.println("Rut no encontrado");
			}
		}
	}
		 
	//mostrar Elementos
	public void listarUsuarios() {
		
		for(Asesoria elemento : listaDeInstancias) {  // solo se deben desplegar los datos de la clase usuario. 
			Usuario usuario = (Usuario) elemento ; 
			
			System.out.println("Usuario [nombreUsuario=" + usuario.getNombreUsuario() + ", fechaNacimiento="
					+ usuario.getFechaNacimiento() + ", run=" + usuario.getRun() + "]");
		}
	}
	
	public void listarUsuariosPorTipo(String perfil) { //recibe un tipo de usuario (cliente, administrador o profesional), y retorna los datos respectivos según el tipo de usuario.
		
		for(int i = 0; i<listaDeInstancias.size(); i ++) {
			
			Usuario usuario = (Usuario)listaDeInstancias.get(i) ; 
	
			if(usuario.toString().contains(perfil)==true){
				System.out.println(listaDeInstancias.get(i)); 
			}
		}
 
	}
	
	public void listarCapacitaciones() { //despliega las capacitaciones registradas en la lista respectiva, junto con los datos del cliente al que está asociada dicha capacitación.
		
		for(Capacitacion elemento : listaDeObjetos) {   //Falta nose que va
			System.out.println(elemento.mostrarDetalle());
			System.out.println(elemento.toString());
			System.out.println(" ");
			}

	}
	
	
	

}
