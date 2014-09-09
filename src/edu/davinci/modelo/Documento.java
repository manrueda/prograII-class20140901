package edu.davinci.modelo;

import org.apache.commons.lang3.StringUtils;

public class Documento {
	
	private TipoDocumento tipo;
	private Integer numero;
	/**
	 * @param tipo
	 * @param numero
	 */
	public Documento(TipoDocumento tipo, Integer numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}
	public TipoDocumento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}
	
	
	//Method
	public boolean isCuitOrCuil(){
		return (StringUtils.length(this.numero.toString()) == 11);
	}
	
	public Integer getPrefijo(){
		Integer result = null;
		String prefijoStr = null;
		prefijoStr = StringUtils.substring(this.numero.toString(), 1, 2);
		result = Integer.parseInt(prefijoStr);
		return result;
	}

}