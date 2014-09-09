package edu.davinci.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.davinci.modelo.Alumno;
import edu.davinci.modelo.Documento;
import edu.davinci.modelo.Persona;
import edu.davinci.modelo.PersonaFisica;
import edu.davinci.modelo.PersonaJuridica;
import edu.davinci.modelo.TipoDocumento;

public class Prueba {

	public static void main(String[] args) {
		Persona pers = null;
		List<Persona> personas = new ArrayList<Persona>();
		pers = new Alumno(10, new Date(), true);
		
		((PersonaFisica)pers).setNombre("Pedro");
		((PersonaFisica)pers).setApellido("Picapiedra");
		pers.setDocumentos(new Documento(TipoDocumento.CUIL,"20376814905"));
		
		personas.add(pers);
		
		pers = null;
		pers = new PersonaJuridica();
		((PersonaJuridica)pers).setRazonSocial("Google");
		pers.setDocumentos(new Documento(TipoDocumento.CUIT,"30376814905"));
		personas.add(pers);
		
		for (Persona persona : personas){
			System.out.println(persona);
			if (persona.validarDocumento()){
				System.out.println("Documento valido");
			}else{
				System.out.println("Documento invalido");
			}
		}
		

	}

}

