package com.PartidaDados.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Players")
public class Player {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pk_PlayerId")
    private Long idPlayer;
	
	private String name;
	private LocalDate date;
	private double PocentajeVictorias;
	private int PartidasGanadas;
	
	
	@OneToMany(mappedBy="player")
	private List<Game> games;




	public Long getIdPlayer() {
		return idPlayer;
	}


	public void setIdPlayer(Long idPlayer) {
		this.idPlayer = idPlayer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public double getPocenyajeVictorias() {
		return PocentajeVictorias;
	}


	public void setPocenyajeVictorias(double pocenyajeVictorias) {
		PocentajeVictorias = pocenyajeVictorias;
	}


	public int getPartidasGanadas() {
		return PartidasGanadas;
	}


	public void setPartidasGanadas(int partidasGanadas) {
		PartidasGanadas = partidasGanadas;
	}


	public List<Game> getGames() {
		return games;
	}


	public void setGames(List<Game> games) {
		this.games = games;
	} 
	
	
	

}
