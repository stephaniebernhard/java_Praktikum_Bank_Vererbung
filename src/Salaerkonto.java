
public class Salaerkonto extends Bankkonto {
	
	private int ueberzugslimite;
	
	public Salaerkonto (String name, double betrag) {
		this(name, betrag, 10000);
	}
	
	public Salaerkonto (String name) {
		this(name, 0);
	}
	
	public Salaerkonto (String name, double betrag, double ueberzugslimite){
		super(name, betrag);
		this.ueberzugslimite = betragInRappen(ueberzugslimite);
	}
	
	public void abheben(double betrag){
		int rappen = betragInRappen(betrag);
		if (rappen>=0) {
			if ((kontostand - rappen) < -ueberzugslimite){
				rappen = kontostand + ueberzugslimite;
				System.out.println("Das Konto kann um maximal " + gibUeberzugslimite() + "�berzogen werden.");
				System.out.println("Es wurden daher nur " + betragInChf(rappen) + "CHF abgehoben.");
			}
			kontostand = kontostand - rappen;
		}
		else {
			System.out.println("Es k�nnen nur positive Betr�ge einbezahlt werden.");
		}
	}
	
	public double gibUeberzugslimite(){
		return betragInChf(ueberzugslimite);
	}
	
	public void zeigeUeberzugslimite(){
		System.out.println(gibUeberzugslimite());
	}
	
	public String gibKontoInfos(){
		return super.gibKontoInfos() + ", Ueberzugslimite: " + gibUeberzugslimite() + " CHF";
	}
	
	public void zeigeKontoInfos(){
		System.out.println(gibKontoInfos());
	}
}
