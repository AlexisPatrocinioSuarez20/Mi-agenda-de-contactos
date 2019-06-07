package Mi_agenda;
import java.util.Scanner;
public class principal {

		public static void main(String[] arg){		
			
			Scanner reader=new Scanner(System.in);
			int opcion, tamanio;
			Contactos mi_contacto = null;
			String nombre, telefono, email;
			boolean band=true;	
			
			System.out.print("Tamaño de la agenda: ");
			tamanio=reader.nextInt();
			Agenda mi_agenda=new Agenda(tamanio);		
					
			while(band==true){	
				menu();			
				System.out.print("> Elegir opcion: ");
				opcion=reader.nextInt();
				
				switch(opcion){
					case 1: //insertar contacto
						System.out.print("Ingresar nombre contacto: ");
						nombre=reader.next();
						System.out.print("Ingresar telefono contacto: ");
						telefono=reader.next();
						System.out.print("Ingresar email contacto: ");
						email=reader.next();
						mi_contacto=new Contactos(nombre,telefono,email);
						mi_agenda.setContacto(mi_contacto);
						break;
					case 2://Editar contacto
						System.out.print("Ingresar nombre nuevo del contacto: ");
						nombre=reader.next();
						System.out.print("Ingresar nuevo telefono del contacto: ");
						telefono=reader.next();
						System.out.print("Ingresar nuevo email del contacto: ");
						email=reader.next();
						mi_agenda.editarContacto(mi_agenda);
						break;
					case 3:// buscar contacto
						System.out.println("Escribe el nombre del contacto");
						nombre=reader.next();
						mi_agenda.buscar_nombre(nombre);
						break; 
					case 4://eliminar contacto
						System.out.println("Escribe el nombre del contacto");
						nombre=reader.next();
						mi_contacto= new Contactos (nombre);
						mi_agenda.eliminarContacto(mi_contacto);
						break;
				}				
			}		
		}
		
		//Metodo de menu de opciones del proyecto
		public static void menu(){
			System.out.println("");
			System.out.println("========= Menu Agenda Telefonica =========");
			System.out.println("[1] Añadir Contacto");
			System.out.println("[2] Editar Contacto");
			System.out.println("[3] Buscar Contacto");
			System.out.println("[4] Eliminar Contacto"); // por nombre
		}
		


	}
