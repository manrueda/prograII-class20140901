package edu.davinci.modelo;

import java.util.Date;


public class PersonaJuridica extends Persona {
	
	private String razonSocial;
	private Date fechaCreacion;
	
	public PersonaJuridica() {
		super();
	}

	
	@Override
	public boolean validarDocumento() {
		boolean result = false;
		for (Documento doc : this.getDocumentos()) {
			if (doc.getTipo().equals(TipoDocumento.CUIT)){
				//TODO validar que los 2 primeros digitos sean 
				//30 o 33
				if (doc.isCuitOrCuil()){
					if ( (doc.getPrefijo().equals(30))||
						 (doc.getPrefijo().equals(33))){
						result = true;		
					}
				}
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


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Override
	public String toString() {
		return "PersonaJuridica [razonSocial=" + razonSocial
				+ ", fechaCreacion=" + fechaCreacion + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result
				+ ((razonSocial == null) ? 0 : razonSocial.hashCode());
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
		PersonaJuridica other = (PersonaJuridica) obj;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		return true;
	}

}