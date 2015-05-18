package es.consejeria.bbdd;


public class GestorEducacion {
	// crear un colegio
	//elimina un colegio
	// modificar el nombre
	
	// matricular un alumno en un determinado colegio
	// expulsar un alumno
	private TablaColegio colegiosMadrid;
	 
	public GestorEducacion() {
		super();
        colegiosMadrid= new TablaColegio();// base de datos
	}

	public void crearColegio(Colegio colegioNuevo){
	  	// guardar en base datos este colegio
		colegiosMadrid.setColegio(colegioNuevo);
	}
	
	public void eliminarColegio(String nomColegio){
		
		// delegar el proceso de eliminación a la capa TablaColegio.
		// podria validar si el usuario solictante teien permiso para 
		// borra colegio.
		colegiosMadrid.deleteColegio(nomColegio);
		
	}
	
	
	
	
	


}



































