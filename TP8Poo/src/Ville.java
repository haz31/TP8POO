
public class Ville {
	private String nom; //nom de la ville
	private String pays; // nom du pays
	private int nbHabitants; //nombre d'habitants
    
	private static int nbInstance = 0;
	
	public Ville() {
		
		nom = " ";
		pays = " ";
		nbHabitants = 0;
		nbInstance++;
		
	}
	
	public Ville(String n, String p, int nb) {
		nom = n ;
		pays = p ;
		nbHabitants = nb;
		nbInstance++;
		
	}
	
	public void setNom(String n) {
		nom = n;
	}
	public String getNom() {
		return nom;
	}
	public void setPays(String p) {
		pays = p;
	}
	public String getPays() {
		return pays;
	}
	public void setNbHabitants(int nb) {
		if(nb < 0 ) {
			nbHabitants = 0;
			System.out.println("Valeur érroné");
		}
		else nbHabitants = nb;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}

	public static int getNbInstance(){return nbInstance;}
	
	//public String display(String text) {
		// TODO Auto-generated method stub
	//	return text;
	 public void display() {
		 System.out.println("Ville de: "+ getNom() +" en "+ getPays() +" avec "+ getNbHabitants()+" habitants" );
			
        
	}
	 
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville v1 = new Ville("TOULOUSE","FRANCE",50000);
		Ville v2 = new Ville("Londre ,","UK :",5000);
		Ville v3 = new Ville("Niamey ,","Niger :",100000);
		
		
		System.out.println("ma ville est :" + v1.nom);
		System.out.println("mon pays est :" + v1.pays);
		System.out.println("nombre d'habitants :" + v1.nbHabitants);
		System.out.println("deuxieme ville -"+" Capital , " + v2.nom  +"Pays ,"+ v2.pays +"Nombres d'habitants : " + v2.nbHabitants);
		System.out.println("troisieme ville -"+" Capital , " + v3.nom  + "pays ,"+ v3.pays +"Nombres d'habitants: " + v3.nbHabitants);
	}
	*/
}
		
	
	
		

