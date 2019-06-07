package Mi_agenda;

public class Agenda {	
		//Atributos
		private Contactos[] lista;	
		
		//Metodos Constructores
		public Agenda(int tamanio_agenda){
			this.lista= new Contactos[tamanio_agenda]; 
		}
		
		public Agenda(){
			this.lista= new Contactos[10]; 
		}	
		
		//Metodos
		
		//Metodo insertar contactos
		public void setContacto(Contactos c){		
			int indice=buscar_indice_vacio();
			
			if(indice<0){
				System.out.println("");
				System.out.println("Importante: Agenda llena!");
			}else{
				this.lista[indice]=c;	
			}								
		}
		private int buscar_indice_vacio() {		
			int indice=0;		
			while(this.lista[indice]!=null){			
				indice++;
				if(indice > (this.lista).length-1){
					return -1;
				}				
			}		
			return indice;				
		}
		//metodo editar contacto
		public void editarContacto(Agenda mi_agenda) {
			int indice=buscar_indice_vacio();
			System.out.println("Introduzca el valor a modificar");
			if(indice!=-1) {
				System.out.println("");
			}else {
				System.out.println("El contacto no se encuentra");
			}
			/*public boolean existeContacto( Contacto c) {
				for(int i=0;i<contactos.length;i++) {
					if(contactos[i]!=null && c.equals(contactos[i])) {
						return true;
					}
				}
				return false;
					}*/
		//metodo buscar contacto
		public void buscar_nombre(String nombre) {
			boolean encontrado=false;
			for(int i=0; i<this.lista.length && !encontrado; i++) {
				if( this.lista[i]!=null && this.lista[i].getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("El numero de celular es:" + this.lista[i].getTelefono());
					System.out.println("El correo electronico es:"+this.lista[i].getEmail());
					encontrado=true;
				}
			}
			if(!encontrado) {
				System.out.println("No se a encontrado el contacto");
			}
		}
		// metodo eliminar contacto
            public void eliminarContacto(Contactos c) {
		     boolean encontrado= false;
            	for(int i=0; i<this.lista.length && !encontrado;i++) {
			if(lista[i]!= null && lista[i].equals(c)) {
				lista[i]=null;
	            encontrado=true;
			}
            }
		     if(!encontrado){
		     
            System.out.println("No se a eliminado el contacto");				
			}
            }
}

