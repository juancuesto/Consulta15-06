package com.PartidaDados.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Partidas")
public class Partida {
	
	@Id
	@Column(name = "PK_PartidaId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long partida_Id;
	@Column(name = "Dado1")
	private int dado1;
	@Column(name = "Dado2")
	private int dado2;
	
	private int win=7;
	
	public Partida(int dado1, int dado2) {
		this.dado1 = dado1;
		this.dado2 = dado2;
	}

	@JoinColumn(name = "PK_JugadorId")
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Jugador jugador;
	
	 public Partida generarPartida() {
	        int a = (int) (Math.random()*6+1);
	        int b = (int) Math.random()*6+1;

	        return new Partida(a, b);
	    }

	public Long getPartida_Id() {
		return partida_Id;
	}

	public void setPartida_Id(Long partida_Id) {
		this.partida_Id = partida_Id;
	}

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	
	

}
