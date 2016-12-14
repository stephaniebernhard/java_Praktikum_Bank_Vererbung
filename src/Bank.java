import java.util.*;

public class Bank {
	
	ArrayList<Bankkonto> verwalteteKonti = new ArrayList<Bankkonto>();
	
	public Bank(){
	
	}
	
	public void alleKontiAusgeben(){
		for (Bankkonto konto : verwalteteKonti){
			konto.zeigeKontoInfos();
		}
	}
	
	public void bankkontoHinzufuegen(String name){
		verwalteteKonti.add(new Bankkonto(name));
	}
	
	public void bankkontoHinzufuegen(String name, double betrag){
		verwalteteKonti.add(new Bankkonto(name, betrag));
	}
	
	public void salaerkontoHinzufuegen(String name){
		verwalteteKonti.add(new Salaerkonto(name));
	}
	
	public void salaerkontoHinzufuegen(String name, double betrag){
		verwalteteKonti.add(new Salaerkonto(name, betrag));
	}
	
	public void salaerkontoHinzufuegen(String name, double betrag, double ueberzugslimite ){
		verwalteteKonti.add(new Salaerkonto(name, betrag, ueberzugslimite));
	}
	
	public void nummernkontoHinzufuegen(String name){
		verwalteteKonti.add(new Nummernkonto(name));
	}
	
	public void nummernkontoHinzufuegen(String name, double betrag){
		verwalteteKonti.add(new Nummernkonto(name, betrag));
	}
	
	public void geldAbheben(int index, double betrag){
		verwalteteKonti.get(index).abheben(betrag);
	}
	
	public void geldEinzahlen(int index, double betrag){
		verwalteteKonti.get(index).einzahlen(betrag);
	}
}
