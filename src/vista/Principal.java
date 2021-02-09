package vista;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Asesoria;
import entidad.Capacitacion;

import entidad.Cliente;
import entidad.Profesional;
import entidad.Administrativo;

import entidad.Contenedor;

import entidad.VisitaEnTerreno;

import entidad.Validar;

public class Principal {
	
	public static void main(String[] args) {

		Contenedor lista = new Contenedor(new ArrayList<Asesoria>(), new ArrayList<Capacitacion>());
		Scanner leer = new Scanner(System.in) ; 
		
		String nombreUsuario = null;   //Atributos de Usuario
		String fechaNacimiento = null;
		Integer run = null;

		Integer rut = null;  //Atributos de Cliente
		String nombre = null;
		String apellido = null;
		String telefono = null;
		String afp = null;
		Integer sistemaDeSalud = null;
		String direccion = null;
		String comuna = null;
		Integer edad = null;
		
		String titulo = null;   //Atributos de Profesional
		String fechaDeIngreso = null;
		
		String area = null ;   //Atributos de Administrativo 
		String experienciaPrevia = null ;
		
		Integer identificador = null;   //Atribujos de Capacitacion
		Integer rutCapacitacion = null;
		String dia = null;
		String hora = null;
		String lugar = null;
		String duracion = null;
		Integer cantidadDeAsistentes = null;
		
		Integer identificadorAccidente = null;   //Atribujos de Accidente
		Integer rutCliente = null;
		String diaAccidente = null;
		String horaAccidente = null;
		String lugarAccidente = null;
		String origen = null;
		String consecuencias = null;
		
		Integer identificadorVisita = null;      //Atribujos visitas en terreno
		Integer rutClienteVisita = null;
		String diaVisita = null;
		String horaVisita = null;
		String lugarVisita = null; 
		String comentarios = null;
		
		Integer identificadorRevision = null;   //Atribujos revision
		Integer identificadorVisitaTerreno = null;
		String nombreRevision = null;
		String detalle = null;
		Integer estado = null;

		Integer opcion = 0 ;	
		
		Validar validar = new Validar(); 
		
		do {
			System.out.println("Menu Principal");
			System.out.println("1 - Almacenar cliente");
			System.out.println("2 - Almacenar profesional");
			System.out.println("3 - Almacenar administrativo");
			System.out.println("4 - Almacenar capacitación");
			System.out.println("5 - Eliminar usuario");
			System.out.println("6 - Listar usuarios");
			System.out.println("7 - Listar usuarios por tipo");
			System.out.println("8 - Listar capacitaciones");
			System.out.println("9 - Salir");
			
			System.out.println("Seleccione una opcion");
			opcion=leer.nextInt();
			leer.nextLine();
			
			switch (opcion) {
				case 1:
					
					System.out.println("Menu: Almacenar cliente");
					
					System.out.println("Datos de Usuario: ");
					do {
						System.out.print("nombreUsuario (min.10 - max.50) : ");
						nombreUsuario = leer.nextLine().trim();
					} while (!validar.minimoMaximo(nombreUsuario, 10, 50));
					
					do {
						System.out.print("fecha Nacimiento (DD/MM/AAAA) : ");
						fechaNacimiento = leer.nextLine().trim();
					} while (!validar.fecha(fechaNacimiento));
					
					do {
						System.out.print("run (rut<99.999.999) : ");
						run = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(run, 0, 99999999));
					
					System.out.println(" ");
					
					System.out.println("Datos de Cliente: ");
					do {
						System.out.print("rut (rut<99.999.999) : ");
						rut = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(rut, 0, 99999999));
					 
					do {
						System.out.print("nombre (min.5 - max.30) : ");
						nombre = leer.nextLine().trim();
					} while (!validar.minimoMaximo(nombre, 5, 30));
					
					do {
						System.out.print("apellido (min.5 - max.30) : ");
						apellido = leer.nextLine().trim();
					} while (!validar.minimoMaximo(apellido, 5, 30) );
					
					do {
						System.out.print("telefono (obligatorio) : ");
						telefono = leer.nextLine().trim();
					} while (validar.vacio(telefono));
					
					do {
						System.out.print("afp (min.4 - max.30) : ");
						afp = leer.nextLine().trim();
					} while (!validar.minimoMaximo(afp, 4, 30));
					
					do {
						System.out.print("sistemaDeSalud (1-fonasa , 2-isapre) : ");
						sistemaDeSalud = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(sistemaDeSalud, 1, 2));

					do {
						System.out.print("direccion (min.0 - max.70) : ");
						direccion = leer.nextLine().trim();
					} while (!validar.minimoMaximo(direccion, 0, 70));
					
					do {
						System.out.print("comuna (min.0 - max.50) : ");
						comuna = leer.nextLine().trim();
					} while (!validar.minimoMaximo(comuna, 0, 50));
					
					do {
						System.out.print("edad (0<= edad<150) : ");
						edad = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(edad, 0, 150));
					
					
					Cliente cliente = new Cliente(nombreUsuario, fechaNacimiento, run, rut, nombre, apellido, telefono, afp,
							sistemaDeSalud, direccion, comuna, edad, null);
					
					lista.almacenarCliente(cliente);
					
					break;
				case 2:
					
					System.out.println("Menu: Almacenar profesional");
					
					System.out.println("Datos de Usuario: ");
					do {
						System.out.print("nombreUsuario (min.10 - max.50) : ");
						nombreUsuario = leer.nextLine().trim();
					} while (!validar.minimoMaximo(nombreUsuario, 10, 50));
					
					do {
						System.out.print("fecha Nacimiento (DD/MM/AAAA) : ");
						fechaNacimiento = leer.nextLine().trim();
					} while (!validar.fecha(fechaNacimiento));
					
					do {
						System.out.print("run (rut<99.999.999) : ");
						run = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(run, 0, 99999999));
					
					System.out.println(" ");
					
					System.out.println("Datos de Profesional: ");
					
					do {
						System.out.print("titulo (min.10 - max.50) : ");
						titulo = leer.nextLine().trim();
					} while (!validar.minimoMaximo(titulo, 10, 50));
					
					do {
						System.out.print("fechaDeIngreso (DD/MM/AAAA) : ");
						fechaDeIngreso = leer.nextLine().trim();
					} while (!validar.fecha(fechaDeIngreso));
					
					Profesional profesional = new Profesional(nombreUsuario, fechaNacimiento, run, titulo, fechaDeIngreso);
					
					lista.almacenarAdministrativo(profesional);
					
					break;
				case 3:
					
					System.out.println("Menu: Almacenar administrativo");
					
					System.out.println("Datos de Usuario: ");
					do {
						System.out.print("nombreUsuario (min.10 - max.50) : ");
						nombreUsuario = leer.nextLine().trim();
					} while (!validar.minimoMaximo(nombreUsuario, 10, 50));
					
					do {
						System.out.print("fecha Nacimiento (DD/MM/AAAA) : ");
						fechaNacimiento = leer.nextLine().trim();
					} while (!validar.fecha(fechaNacimiento));
					
					do {
						System.out.print("run (rut<99.999.999) : ");
						run = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(run, 0, 99999999));
					
					System.out.println(" ");
					
					System.out.println("Datos de administrativo: ");
					do {
						System.out.print("area (min.5 - max.20) : ");
						area = leer.nextLine().trim();
					} while (!validar.minimoMaximo(area, 5, 20));
					
					do {
						System.out.print("experienciaPrevia (min.0 - max.100) : ");
						experienciaPrevia = leer.nextLine().trim();
					} while (!validar.minimoMaximo(experienciaPrevia, 0, 100));
					
					Administrativo administrativo = new Administrativo(nombreUsuario, fechaNacimiento, run, area, experienciaPrevia);
					
					lista.almacenarAdministrativo(administrativo);
	
					break;
				case 4:
					
					System.out.println("Menu: Almacenar capacitación");
					
					System.out.println("Datos de la Capacitacion: ");
					
					do {
						System.out.print("identificador (numero entero) : ");
						identificador = leer.nextInt();
						leer.nextLine().trim();	
					} while (identificador<0);
					
					do {
						System.out.print("rut Capacitacion (rut<99.999.999) : ");
						rutCapacitacion = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(rutCapacitacion, 0, 99999999));
					
					do {
						System.out.print("dia (Lunes-Domingo) : ");
						dia = leer.nextLine().trim();
					} while (!validar.dia(dia));
					
					do {
						System.out.print("hora (HH:MM 0 a 23 y  0 y 59) : ");
						hora = leer.nextLine().trim();
					} while (!validar.hora(hora));
					
					do {
						System.out.print("lugar (min.10 - max.50) : ");
						lugar = leer.nextLine().trim();
					} while (!validar.minimoMaximo(lugar, 10, 20));
					
					do {
						System.out.print("duracion (max.70) : ");
						duracion = leer.nextLine().trim();
					} while (!validar.minimoMaximo(duracion, 0, 70));
					
					do {
						System.out.print("cantidad De Asistentes (obigatorio - numero entero menor 1000:  ");
						cantidadDeAsistentes = leer.nextInt();
						leer.nextLine().trim();	
					} while (!validar.menorMayor(cantidadDeAsistentes, 0, 1000));
					
					Capacitacion capacitacion = new Capacitacion(identificador, rutCapacitacion, dia, hora, lugar,
							duracion, cantidadDeAsistentes);
					
					lista.almacenarCapacitacion(capacitacion);
		
					break;
				case 5:
					System.out.println("Menu: Eliminar usuario");
					System.out.println("Run a eliminar: ");
					run = leer.nextInt();
					leer.nextLine();
					
					lista.eliminarUsuario(run);
					
					
					break;
				case 6:
					System.out.println("Menu: Listar usuarios");
					
					System.out.println("Datos de los Usuarios: ");
					lista.listarUsuarios();
					
					break;
				case 7:
					System.out.println("Menu: Listar usuarios por tipo");
					String perfil=null;
					
					do {
						System.out.println("1- Cliente, 2- Profesional, 3- Administrativo");
						perfil = leer.nextLine().trim();
					} while (!perfil.equals("1") && !perfil.equals("2") && !perfil.equals("3"));
					
					if(perfil.equals("1")) {
						lista.listarUsuariosPorTipo("nombre"); 
					}else if (perfil.equals("2")) {
						lista.listarUsuariosPorTipo("titulo"); 
						
					}else if(perfil.equals("3")) {
						lista.listarUsuariosPorTipo("area"); 
					}
	
					break;
				case 8:
					System.out.println("Menu: Listar capacitaciones");
			
					System.out.println("Datos de las capacitaciones: ");
					lista.listarCapacitaciones();
					
					break;
				case 9:
					System.out.println("fin del programa");
					break;

				default:
					System.out.println("ERROR:Ingrese un opcion valida");
					System.out.println(" ");
					break;
			}
			
			
			
		} while (opcion!=9);
		
		
		
		
	leer.close();
	}
	
	
}
