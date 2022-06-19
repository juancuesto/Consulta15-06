package com.PartidaDados.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PartidaDados.entity.Player;
import com.PartidaDados.repositori.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepository;
	
	
	public Player savePlayer(Player player) {
		
		return playerRepository.save(player);
	}
	
	public Optional<Player> getPlayerById(Long id){
		
		return playerRepository.findById(id);
	}

}
