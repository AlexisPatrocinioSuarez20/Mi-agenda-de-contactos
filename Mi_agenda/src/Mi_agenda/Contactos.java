package Mi_agenda;

public class Contactos {

		// Definimos los atributos
		public String nombre;
		String telefono;
		public String email;
		String O;
		
		// Definimos el constructor
		public Contactos(String nombre,String telefono,String email){
			this.nombre=nombre;
			this.telefono=telefono;
			this.email=email;
		}
		
		// Sobrecarga del Metodo constructor
		public Contactos(String nombre,String telefono){
			this.nombre=nombre;
			this.telefono=telefono;
			this.email="";
		}
		
		// Sobrecarga del Metodo constructor
		public Contactos(String nombre){
			this.nombre=nombre;
			this.telefono= O;
		}
		
		// Metodos
		public String getNombre(){		
			return this.nombre;
		}
		
		public String getTelefono(){		
			return this.telefono;
		}
		
		public String getEmail(){		
			return this.email;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}	
		
		public void setTelefono(String telefono){
			this.telefono=telefono;
		}
		
		public void setEmail(String email){
			this.email=email;
		}
			
		public void DatosContacto(){
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Telefono: "+ getTelefono());
			System.out.println("Email: "+this.getEmail());
		}	
		// static: permite usar el metodo suma sin instanciar la clase
		public static float suma(float a, float b){		
			return a+b;
		}
			
	}


