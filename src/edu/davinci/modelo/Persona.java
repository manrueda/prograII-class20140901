package edu.davinci.modelo;


import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	
	private int codigo;
	private List<String> direcciones;
	private List<Integer> telefonos;
	private List<String> mails;
	private List<Documento> documentos;
	//Constructor

	/**
	 * Costructor por defecto
	 */
	public Persona() {
		this.setDirecciones(new ArrayList<String>());
		this.telefonos = new ArrayList<Integer>();
		this.mails = new ArrayList<String>();
		this.documentos = new ArrayList<Documento>();
	}

	
	//Getters & Seters

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public List<String> getDirecciones() {
		return direcciones;
	}


	public void setDirecciones(List<String> direcciones) {
		this.direcciones = direcciones;
	}


	public List<Integer> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Integer> telefonos) {
		this.telefonos = telefonos;
	}

	public List<String> getMails() {
		return mails;
	}

	public void setMails(List<String> mails) {
		this.mails = mails;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	//Methods
	public boolean validarDocumento() {
		return false;
	}


	
	//Override


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}


	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", direcciones=" + direcciones
				+ ", telefonos=" + telefonos + ", mails=" + mails
				+ ", documentos=" + documentos + "]";
	}
	
	
	
}