
public class Bankkonto {
	
	protected String name;
	protected int kontostand;
	protected static final int maximalbetrag = 10000000;
	
	public Bankkonto(String name, double betrag){
		this.name = name;
		this.kontostand = betragInRappen(betrag);
	}
	
	public Bankkonto(String name){
		this(name, 0);
	}
	
	public void einzahlen(double betrag){
		int rappen = betragInRappen(betrag);
		if (rappen >= 0) {
			if ((kontostand + rappen) > maximalbetrag){
				rappen = maximalbetrag - kontostand;
				System.out.println("Maximalbetrag des Kontos = " + betragInChf(maximalbetrag) + " CHF");
				System.out.println("Es wurden daher nur " + betragInChf(rappen) + " CHF einbezahlt.");
			}
			kontostand = kontostand + rappen;
		}
		else {
			System.out.println("Es k�nnen nur positive Betr�ge einbezahlt werden.");
		}
	}
	
	public void abheben(double betrag){
		int rappen = betragInRappen(betrag);
		if (rappen>=0) {
			if ((kontostand - rappen) < 0){
				rappen = kontostand;
				System.out.println("Es sind nur noch " + betragInChf(rappen) + " CHF auf dem Konto vorhanden.");
				System.out.println("Es wurden daher nur " + betragInChf(rappen) + "CHF abgehoben.");
			}
			kontostand = kontostand - rappen;
		}
		else {
			System.out.println("Es k�nnen nur positive Betr�ge abgehoben werden.");
		}
	}
	
	public double betragInChf(int betrag){
		return (double) (betrag / 100.0);
	}
	
	public int betragInRappen(double betrag){
		return (int) (betrag * 100);
	}
	
	public double gibKontostand(){
		return betragInChf(kontostand);
	}
	
	public void zeigeKontostand(){
		System.out.println(gibKontostand());
	}
	
	public String gibName(){
		return name;
	}
	
	public void zeigeName(){
		System.out.println(gibName());
	}
	
	public String gibKontoInfos(){
		return "Inhaber: " + gibName() + ", Kontostand: " + gibKontostand() + " CHF";
	}
	public void zeigeKontoInfos(){
		System.out.println(gibKontoInfos());
	}
	
}