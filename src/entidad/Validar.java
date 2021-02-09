package entidad;

public class Validar {
	
	
	public Validar() {

	}
	
	public boolean minimoMaximo(String dato, Integer minimo, Integer maximo) {

		if(dato.length()>=minimo && dato.length()<=maximo) {
			//System.out.println("Dato valido");
			return true;
		}else {
			System.out.print("Dato no valido: ");
			System.out.println("min. " + minimo + "max. " + maximo);
			return false;			
		}
	}
	
	public boolean fecha(String fecha) {
		String numeros= "0123456789";
		Integer contador = 0 ; 
		Character [] caracter = new Character [fecha.length()];

		for (int i = 0; i < fecha.length(); i++) {
			caracter[i] = fecha.charAt(i);   //LLena el arreglo caracter
			//System.out.println(caracter[i]);

			for (int j = 0; j < numeros.length(); j++) {
				if (caracter[i].equals(numeros.charAt(j)) && !caracter[i].equals('/')) {   //Evalua pertenece a numero o si es " / "
					//System.out.println("numero");
					j = numeros.length();   //Termina el for si encuentra el caracter en el String numeros
					contador++;   //cuenta cuantos caracteres son correctos. deben ser 8 
				}
			}		
		}

		if (caracter[2].equals('/') && caracter[5].equals('/') && contador== 8 && fecha.length()== 10) {   //Evalua el formato y maximom de caracteres
			
			//System.out.println("fecha valida");
			
			String diasString = String.valueOf(caracter[0])+String.valueOf(caracter[1]);   //convierte el caracter a String 
			String mesesString = String.valueOf(caracter[3])+String.valueOf(caracter[4]);   //y se hace una concatenacion de character
			String anyoString = String.valueOf(caracter[6]) +String.valueOf(caracter[7])+String.valueOf(caracter[8])+String.valueOf(caracter[9]); 
			
			Integer dias = Integer.parseInt(diasString);   //convierte el String a Integer
			Integer meses = Integer.parseInt(mesesString);
			Integer anyo = Integer.parseInt(anyoString);
						
			if(dias>=1 && dias<=31 && meses>=1 && meses<=12 && anyo>=1000 ) {
				//System.out.println("fecha valida");
				return true; 
			}else {
				System.out.println("Error de formato: dia 0-30 , mes 0-12 , año > 1000");
				return false;
				
			}
		}else {
			System.out.println("Error de formato: dd/mm/aaaa , solo numeros");
			return false;		
		}

	}

	public boolean dia(String dia) {
		
		if (dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves")
				|| dia.equals("Viernes") || dia.equals("Sabado")|| dia.equals("Domingo")) {
			return true;
			
		}else {
			return false;
		}
	
	}

	public boolean hora(String hora) {
		
		String numeros= "0123456789";
		Integer contador = 0 ; 
		Character [] caracter = new Character [hora.length()];
		
		for (int i = 0; i < hora.length(); i++) {
			caracter[i] = hora.charAt(i);   //LLena el arreglo caracter
			//System.out.println(caracter[i]);

			for (int j = 0; j < numeros.length(); j++) {
				if (caracter[i].equals(numeros.charAt(j)) && !caracter[i].equals(':')) {   //Evalua pertenece a numero o si es " / "
					//System.out.println("numero");
					j = numeros.length();   //Termina el for si encuentra el caracter en el String numeros
					contador++;   //cuenta cuantos caracteres son correctos. deben ser 8 
				}
			}		
		}

		if (caracter[2].equals(':') && contador== 4 && hora.length()== 5) {   //Evalua el formato y maximom de caracteres
					
			//System.out.println("hora buena");
			String horaString = String.valueOf(caracter[0])+String.valueOf(caracter[1]);   //convierte el caracter a String 
			String minutoString = String.valueOf(caracter[3])+String.valueOf(caracter[4]);   //y se hace una concatenacion de character
			
			Integer horas = Integer.parseInt(horaString);   //convierte el String a Integer
			Integer minutos = Integer.parseInt(minutoString);
			
			if(horas>=0 && horas<=23 && minutos>=0 && minutos<=59 ) {
				
				return true; 
			}else {
				return false;
			}	
					
		}else {
			System.out.println("Error de formato: hh:mm");
			return false;		
		}
	}
	
	public boolean menorMayor(Integer dato, Integer menor, Integer mayor) {
		
		if(dato>=menor && dato<=mayor) {
			 
			//System.out.println( "Dato valido");
			return true;
			
		}else {
			 
			System.out.println("Dato no valido: min. " +" max."+ mayor);
			return false;
		}
	}
	
	public boolean vacio(String dato) {

		if (dato.isEmpty()) {
			System.out.println("Error: Debe ingresar un Dato");
			return true;
		} else {
			// System.out.println("no vacio");
			return false;
		}
	}
}
