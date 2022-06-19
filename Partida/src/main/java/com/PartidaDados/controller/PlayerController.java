package com.PartidaDados.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PartidaDados.entity.Player;
import com.PartidaDados.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@PostMapping("/add")
	public ResponseEntity<?> savePlayer(@RequestBody Player player){
		return ResponseEntity.status(HttpStatus.CREATED).body(playerService.savePlayer(player));
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<?> getPlayerById(@PathVariable("id") Long id){
		
		Optional<Player> oPlayer=playerService.getPlayerById(id);
		
		if(! oPlayer.isPresent()) {
			ResponseEntity.notFound().build();
		}
		return ResponseEntity.of(oPlayer);
		}
		
	}

