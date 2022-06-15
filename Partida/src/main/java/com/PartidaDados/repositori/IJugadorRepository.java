package com.PartidaDados.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PartidaDados.entity.Jugador;

@Repository
public interface IJugadorRepository extends JpaRepository<Jugador, Long> {
	
	

}
