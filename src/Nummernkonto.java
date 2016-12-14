
public class Nummernkonto extends Bankkonto {

	private int kontonummer;
	private static int anzahlkonten = 0;
	
	public Nummernkonto(String name, double betrag) {
		super(name, betrag);
		kontonummer = 1000 + anzahlkonten;
		anzahlkonten++;
	}
	
	public Nummernkonto(String name){
		this(name, 0);
	}
	
	public int gibKontonummer(){
		return kontonummer;
	}
	
	public void zeigeKontonummer(){
		System.out.println(kontonummer);
	}
	
	public String gibKontoInfos(){
		return "Inhaber: " + kontonummer + ", Kontostand: " + super.gibKontostand() + " CHF";
	}
	public void zeigeKontosInfos(){
		System.out.println(gibKontostand());
	}
}
