
public class Personne {
	String nom ;
	String prenom ;
	int age ;
	String adresse ;
	Ville VilleNaissance ;

	public void personne() {
		nom = " ";
		prenom = " ";
		age = 0 ;
		adresse = " ";  
		VilleNaissance = new Ville("rien","rien",0) ;
	}

	public Personne(String n, String p , int a , String adr, Ville vdn) {
		nom = n ;
		prenom = p ;
		age = a ;
		adresse = adr ;
		VilleNaissance = vdn ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne("dupont","henri",51,"3 rue des rosiers à Nice",new Ville("Lille :","france :",1978));
		p1.display();
		
	} 
	public void display() {
		System.out.println("<"+nom+" "+prenom+" "+age+"ans"+" "+"habitant"+" "+
	adresse);
		VilleNaissance.display();
		
	}
}
