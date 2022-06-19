package com.PartidaDados.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PartidaDados.entity.Player;



@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	
	

}
