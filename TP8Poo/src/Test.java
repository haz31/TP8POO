
public class Test {
	
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 
		 	System.out.println("nombre d'instance = " + Ville.getNbInstance());
			
			Ville v1 = new Ville("TOULOUSE","FRANCE",50000);
			Ville v2 = new Ville("Londre ,","UK :",5000);
			Ville v3 = new Ville("Niamey ,","Niger :",100000);
			
			//v1.nom = "toulouse";
			v1.setNom("toulouse");
			v1.setPays("france");
			v1.setNbHabitants(200);
			
			
			
			System.out.println("nombre d'instance = " + Ville.getNbInstance());
			
			
			//System.out.println("Ville de: "+v1.display(v1.getNom() +" en "+ v1.getPays() +" avec "+ v1.getNbHabitants()+" habitants"));
			
			//System.out.println("v1 : " + v1.getNom() +" " + v1.getPays() + " " + v1.getNbHabitants());
			
			/*System.out.println("ma ville est :" + v1.nom);
			System.out.println("mon pays est :" + v1.pays);
			System.out.println("nombre d'habitants :" + v1.nbHabitants);
			System.out.println("deuxieme ville -"+" Capital , " + v2.nom  +"Pays ,"+ v2.pays +"Nombres d'habitants : " + v2.nbHabitants);
			System.out.println("troisieme ville -"+" Capital , " + v3.nom  + "pays ,"+ v3.pays +"Nombres d'habitants: " + v3.nbHabitants);*/
	}

}
