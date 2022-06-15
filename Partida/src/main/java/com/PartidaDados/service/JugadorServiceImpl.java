package com.PartidaDados.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.PartidaDados.entity.Jugador;
import com.PartidaDados.repositori.IJugadorRepository;

@Service
public class JugadorServiceImpl implements IJugadorService {
	
	@Autowired
	private IJugadorRepository jugadorRepo;

	@Override
	@Transactional
	public Jugador save(Jugador jugador) {
		// TODO Auto-generated method stub
		return jugadorRepo.save(jugador);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Jugador> findById(Long id) {
		// TODO Auto-generated method stub
		return  jugadorRepo.findById(id);
	}

	@Override
	@Transactional
	public void eliminarJugador(Long id) {
		// TODO Auto-generated method stub
		
		   jugadorRepo.deleteById(id);
	}

	/*@Override
	public List<Jugador> findAll() {
		// TODO Auto-generated method stub
		return jugadorRepo.findAll();
	}

	@Override
	public Jugador findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jugador findByOrderByIdDesc() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
