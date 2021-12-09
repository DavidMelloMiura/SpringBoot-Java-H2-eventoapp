package com.eventoapp.SpringBoot_EventoApp;

import org.springframework.data.repository.CrudRepository;
import com.eventoapp.SpringBoot_EventoApp.models.Evento;


public interface EventoRepository extends CrudRepository<Evento, String>{
	
	Evento findByCodigo(long codigo);
	

}
