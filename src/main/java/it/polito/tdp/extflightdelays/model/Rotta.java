package it.polito.tdp.extflightdelays.model;


/**
 * Classe di aiuto che viene utilizzata per rappresentare l'informazione
 * per gli archi del grafo
 * @author carlo
 *
 */
public class Rotta {

	private Airport origin;
	private Airport destination;
	private int nVoli;		//numero di voli sulla rotta da origin a destination 
	
	
	public Rotta(Airport origin, Airport destination, int n) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.nVoli = n;
	}


	public Airport getOrigin() {
		return origin;
	}


	public void setOrigin(Airport origin) {
		this.origin = origin;
	}


	public Airport getDestination() {
		return destination;
	}


	public void setDestination(Airport destination) {
		this.destination = destination;
	}


	public int getNVoli() {
		return this.nVoli;
	}


	public void setNVoli(int n) {
		this.nVoli = n;
	}
	
	
	
}
