package edu.davinci.modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Comision {
	enum diasDeLaSemana {
		L,
		M,
		Mx,
		J,
		V,
		S,
	}
	
	
	private int codigo;
	private List<diasDeLaSemana> dias = new ArrayList<diasDeLaSemana>();
	private Instructor instructor;
	private Curso curso;
	private Aula aula;
	private Catalogo catalogo;
	private Date fechaInicio;
	private int horaInicio;
	private int horaFin;
	List<Alumno> alumnos = new ArrayList<Alumno>();
	
	
}
