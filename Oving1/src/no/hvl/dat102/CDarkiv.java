package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;;

public class CDarkiv implements CDarkivADT {
	private CD[] cdTabell;
	private int antall;
	
	public CDarkiv(int antall) {
		CD[] cdTabell = new CD[antall];
		this.antall = 0;
	}

	@Override
	public CD[] hentCdTabell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leggTilCd(CD nyCd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean slettCd(int cdNr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CD[] sokTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CD[] sokArtist(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antallSjanger(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}

}
