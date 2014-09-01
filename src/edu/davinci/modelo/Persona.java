package edu.davinci.modelo;

public abstract class Persona {
	private String nombre;
	private String documento;
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String pNombre) {
		this.nombre = pNombre;
	}
	
	public String getDocumento() {
		return this.documento;
	}
	public void setDocumento(String pDocumento) {
		this.documento = pDocumento;
	}
}
