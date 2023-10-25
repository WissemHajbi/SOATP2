package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	double montant;
	public BanqueService(double montant){
		this.montant=montant;
	}
	public double conversion(double montant) {
		return montant * 3.36;
	}
	
	public List<Compte> getComptes(){
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1, 0, new Date()));
		comptes.add(new Compte(2, 0, new Date()));
		comptes.add(new Compte(3, 0, new Date()));
		return comptes;
	}
	public Compte getCompte (int x) {
		return new Compte(x, 0, new Date());
		
	}
}