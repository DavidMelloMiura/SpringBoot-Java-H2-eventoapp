package com.eventoapp.SpringBoot_EventoApp;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.SpringBoot_EventoApp.models.Convidado;
import com.eventoapp.SpringBoot_EventoApp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	
	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);
	
	

}
