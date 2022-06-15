package com.PartidaDados.controller;

import java.util.Optional;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PartidaDados.entity.Jugador;
import com.PartidaDados.service.IJugadorService;
import com.PartidaDados.service.JugadorServiceImpl;

@RestController
@RequestMapping("/players")
public class JugadorController {

	@Autowired
	private IJugadorService jugadorService;
	
	@PostMapping
	public ResponseEntity<?> CrearJugador(@RequestBody Jugador jugador) {
		//Jugador jugador=new Jugador(name);
		return  ResponseEntity.status(HttpStatus.CREATED).body(jugadorService.save(jugador));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getJugadorById(@PathVariable  Long id){

		Optional<Jugador> ojugador=jugadorService.findById(id);
		
		if(! ojugador.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(ojugador);
	}
	
	/*@PutMapping("/players/{id}")
	public ResponseEntity<?> update(@RequestBody Jugador jugadorDetails ,@PathVariable (value="id") Long jugadorId) {
		
		Optional<Jugador> ojugador=jugadorService.findById(jugadorId);
		if(! ojugador.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		ojugador.get().setNombre(jugadorDetails.getNombre());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(jugadorService.save(ojugador.get()));
	}*/
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteJugador(@PathVariable (value="id") Long jugadorId){
		
		jugadorService.eliminarJugador(jugadorId);
				
		return ResponseEntity.status(HttpStatus.OK).body(jugadorService.findById(jugadorId));
		
	}
	
	
	
	
	
}
