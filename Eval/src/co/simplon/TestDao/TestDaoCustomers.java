package co.simplon.TestDao;


public class TestDaoCustomers {

	public static void lancerTests() {
		// le principe de base d'un programme de tests, 
		// c'est qu'on doit passer par tous les chemins pour valider 
		// Comment faire ici ?
		
		TestDaoCustomers cd = new TestDaoCustomers();		
				
		TestDaoCustomers c1 = new TestDaoCustomers();
		
		if(cd.create(c1))	System.out.println("insertion ok de " + c1);
		else System.out.println("insertion impossible, client avec cet id existe déjà ");
				
		TestDaoCustomers c2 = cd.find(c1.getIdCust()); 		
		if(c2 == null)	System.out.println("ce client n'est pas contenu en base ");
		else System.out.println("client trouvé en base : " + c2);
		
		c1.setName("Vador");
		if(cd.update(c1)) System.out.println("ok mise à jour " + c1);
		else System.out.println("mise à jour impossible ");
		
		if(cd.delete(c1))	System.out.println("delete ok " + c1);
		else System.out.println("delete impossible ");				
	}

	private TestDaoCustomers find(Object idCust) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean update(TestDaoCustomers c1) {
		// TODO Auto-generated method stub
		return false;
	}

	private Object getIdCust() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private boolean delete(TestDaoCustomers c1) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean create(TestDaoCustomers c1) {
		// TODO Auto-generated method stub
		return false;
	}
}
