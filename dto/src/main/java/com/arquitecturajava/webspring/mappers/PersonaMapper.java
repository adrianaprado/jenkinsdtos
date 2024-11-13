package com.arquitecturajava.webspring.mappers;

import com.arquitecturajava.webspring.dtos.PersonaDTO;
import com.arquitecturajava.webspring.models.Persona;

public class PersonaMapper {
	
	public static PersonaDTO toDTO(Persona persona) {
		return new PersonaDTO(persona.getNombre());
	}
	
	public static Persona toBO(PersonaDTO personaDTO) {
		return new Persona(personaDTO.getNombre());
	}
}
