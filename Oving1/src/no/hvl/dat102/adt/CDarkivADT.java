package no.hvl.dat102.adt;

import no.hvl.dat102.CD;
import no.hvl.dat102.Sjanger;

public abstract interface CDarkivADT {
	
	abstract CD[] hentCdTabell();
	
	abstract void leggTilCd(CD nyCd);
	
	abstract boolean slettCd(int cdNr);
	
	abstract CD[] sokTittel(String delstreng);
	
	abstract CD[] sokArtist(String delstreng);
	
	abstract int antallSjanger(Sjanger sjanger);

}
