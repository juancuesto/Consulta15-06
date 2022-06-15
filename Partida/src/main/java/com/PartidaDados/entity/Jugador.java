package com.PartidaDados.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Jugadores")
public class Jugador {
	
		@Id
		@Column(name = "PK_JugadorId")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long Jugador_Id;

		@Column(name = "Nombre", unique = true, nullable = false)
		private String nombre;

		
		
		@OneToMany(mappedBy = "jugador") // Nombre del atributo jugador en la clase Partida.
		private List<Partida> partidas;

		public Jugador() {
		}


		public Jugador(String nombre) {
			this.nombre = nombre;
		}


		public long getJugador_Id() {
			return Jugador_Id;
		}


		public void setJugador_Id(long jugador_Id) {
			Jugador_Id = jugador_Id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public List<Partida> getPartidas() {
			return partidas;
		}


		public void setPartidas(List<Partida> partidas) {
			this.partidas = partidas;
		}
		
		

}
