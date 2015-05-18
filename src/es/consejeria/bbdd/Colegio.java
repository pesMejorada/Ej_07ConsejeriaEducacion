package es.consejeria.bbdd;


import java.io.Serializable;
import java.util.ArrayList;

public class Colegio implements Serializable {

	private String nombre;
	private String direccion;
	private int numAulas;
	private int capacidad;
	private ArrayList<Alumno> alumnos;
	public Colegio() {
		super();
		this.alumnos= new ArrayList<Alumno>();
	}
	public Colegio(String nombre, String direccion, int numAulas, int capacidad) {
		super();
		this.alumnos= new ArrayList<Alumno>();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numAulas = numAulas;
		this.capacidad = capacidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumAulas() {
		return numAulas;
	}
	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public void setAlumno(Alumno alumnoNuevo){
		this.alumnos.add(alumnoNuevo);
	}
	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", direccion=" + direccion
				+ ", numAulas=" + numAulas + ", capacidad=" + capacidad
				+ ", alumnos=" + alumnos + "]";
	}
	
	

}















