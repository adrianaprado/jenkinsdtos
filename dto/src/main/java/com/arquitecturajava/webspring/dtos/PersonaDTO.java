package com.arquitecturajava.webspring.dtos;

public class PersonaDTO {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PersonaDTO(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public PersonaDTO() {
		super();
	}
}
