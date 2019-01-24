package no.hvl.dat102;

public class CD {
	private int cdNummer;
	private String artist;
	private String tittel;
	private int aarstall;
	private Sjanger sjanger;
	private String plateselskap;
	
	public CD(int cdNummer, String artist, String tittel, int aarstall, Sjanger sjanger, String plateselskap) {
		this.cdNummer = cdNummer;
		this.artist = artist;
		this.tittel = tittel;
		this.aarstall = aarstall;
		this.sjanger = sjanger;
		this.plateselskap = plateselskap;		
	}
	
	public CD() {
		this(0, "", "", 0, Sjanger.BLANK, "");
	}
	
	public int getCdNummer() {
		return cdNummer;
	}

	public void setCdNummer(int cdNummer) {
		this.cdNummer = cdNummer;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getAarstall() {
		return aarstall;
	}

	public void setAarstall(int aarstall) {
		this.aarstall = aarstall;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getPlateselskap() {
		return plateselskap;
	}

	public void setPlateselskap(String plateselskap) {
		this.plateselskap = plateselskap;
	}	

}
