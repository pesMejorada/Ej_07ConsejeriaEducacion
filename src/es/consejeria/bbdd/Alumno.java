package es.consejeria.bbdd;

import java.io.Serializable;

public class Alumno implements Serializable {
	private int numMatricula;
	private String nombre;
	private String apellidos;
	private String curso;
	public Alumno() {
		super();
	}
	public Alumno(int numMatricula, String nombre, String apellidos,
			String curso) {
		super();
		this.numMatricula = numMatricula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [numMatricula=" + numMatricula + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", curso=" + curso + "]";
	}
	
	
	

}
