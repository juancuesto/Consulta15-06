package com.PartidaDados.service;

import java.util.List;
import java.util.Optional;

import com.PartidaDados.entity.Jugador;

public interface IJugadorService {
	
	Jugador save(Jugador jugador);
	Optional<Jugador> findById(Long id);
	void eliminarJugador(Long id);
	/*List<Jugador> findAll();
	Jugador findByName(final String name);
	Jugador findByOrderByIdDesc();*/

}

