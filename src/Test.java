
public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.bankkontoHinzufuegen("Haruka");
		bank.bankkontoHinzufuegen("Sakura", 200);
		bank.salaerkontoHinzufuegen("Hitori");
		bank.salaerkontoHinzufuegen("Shinpachi", -200);
		bank.salaerkontoHinzufuegen("Kisuke", 200, 500);
		bank.nummernkontoHinzufuegen("Gintama");
		bank.nummernkontoHinzufuegen("Totoro", 200);
		bank.alleKontiAusgeben();
		bank.geldAbheben(0, -20);
		bank.geldAbheben(1, 20);
		bank.geldEinzahlen(2,50);
		bank.geldEinzahlen(3, 200000);
		bank.geldAbheben(4, 600);
		bank.geldEinzahlen(5, 200);
		bank.geldEinzahlen(6, -20);
		bank.alleKontiAusgeben();
	}

}
