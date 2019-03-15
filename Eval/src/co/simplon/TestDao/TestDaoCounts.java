package co.simplon.TestDao;

import co.simplon.entities.Counts;

public class TestDaoCounts {

	public static void lancerTests() {
		
		// le principe de base d'un programme de tests, 
		// c'est qu'on doit passer par tous les chemins pour valider
		// Comment faire ici ?

		Counts counts = new Counts(111,null, 2500,1);

		dao.CountsDao cod = new dao.CountsDao();

	
		
		if(cod.create(counts))	System.out.println("creation de compte ok " + counts);
		else System.out.println("création impossible ");

		Counts cpt2 = cod.find(((Counts) counts).getNumCounts());
		if(cpt2 == null)	System.out.println("Compte inexistant en base ");
		else System.out.println("Compte trouvé " + cpt2);

		((Counts) counts).setBalance(((Counts) counts).getBalance() + 5000);
		if(cod.update(counts))	System.out.println("mise à jour " + counts);
		else System.out.println("mise à jour impossible ");

		if(cod.delete(counts))	System.out.println("suppression ok de " + counts);
		else System.out.println("suppression impossible ! ");
	}
}

