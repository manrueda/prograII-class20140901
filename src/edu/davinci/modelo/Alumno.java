package edu.davinci.modelo;

import java.util.Date;

public class Alumno extends PersonaFisica {

	private int legajo;
	private Date fechaIngreso;
	private boolean regular;
	
	public Alumno(int pLegajo, Date pFechaIngreso, boolean pRegular){
		this.legajo = pLegajo;
		this.fechaIngreso = pFechaIngreso;
		this.regular = pRegular;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public boolean isRegular() {
		return regular;
	}
	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + legajo;
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
		Alumno other = (Alumno) obj;
		if (legajo != other.legajo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [legajo=" + legajo + ", fechaIngreso=" + fechaIngreso
				+ ", regular=" + regular + "]";
	}
	
}