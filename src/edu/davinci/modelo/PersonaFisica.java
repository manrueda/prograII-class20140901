package edu.davinci.modelo;

import java.util.Date;

public abstract class PersonaFisica extends Persona {
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	
	public PersonaFisica() {
		super();
	}

	@Override
	public boolean validarDocumento() {
		boolean result = false;
		for (Documento doc : this.getDocumentos()) {
			//TODO pasar el tipo documento a enum
			if (doc.getTipo().equals(TipoDocumento.DNI)){
				result = true;
			}
			if (doc.getTipo().equals(TipoDocumento.PAS)){
				result = true;
			}
			if (doc.getTipo().equals(TipoDocumento.CUIL)){
				//TODO validar que los 2 primeros digitos sean 
				//20 o 27 o 23 o 24 
				if (doc.isCuitOrCuil()){
					if ( (doc.getPrefijo().equals(20))||
						 (doc.getPrefijo().equals(27))||
						 (doc.getPrefijo().equals(23))||
						 (doc.getPrefijo().equals(24))){
						result = true;		
					}
				}
			}
		}
		return result;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((apellido == null) ? 0 : apellido.hashCode());
		result = prime
				* result
				+ ((fechaDeNacimiento == null) ? 0 : fechaDeNacimiento
						.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaFisica other = (PersonaFisica) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (fechaDeNacimiento == null) {
			if (other.fechaDeNacimiento != null)
				return false;
		} else if (!fechaDeNacimiento.equals(other.fechaDeNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonaFisica [nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}

}