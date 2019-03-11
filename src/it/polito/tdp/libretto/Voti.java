package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voti {
	private int voto ;
	private String corso ;
	private LocalDate data;  //Date e Calendar erano gli unici modi per gestire le date fino a java 6, da java 7 esiste la libreria java time che contiene local date
	
	public Voti(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}
	
	//facciamo in modo di portare questo progetto sottoforma di version
	//clicco con il tasto destro sul progetto e vado su team e poi su share project e seleziono le spunte.
	//clicco di nuovo con il tasto destro sul progetto, vado su team e poi su commit che mi permette di vedere le ultime modifiche del file
	
	
}
