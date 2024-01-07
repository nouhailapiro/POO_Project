package gestion_terrain;

public class Joueur extends Personne{
	
	public int idJoueur; 
	public String poste;
	private static int nbreJoueurs=0;
	
	public Joueur(String nom,String prenom,String poste,int age) {
		super(nom,prenom,age);
		this.poste=poste;
		
		nbreJoueurs++;
		this.idJoueur=nbreJoueurs;
	}
	
	
	
	
	
	
	public void changePoste(String poste) {
		this.poste = poste;
	}
}
	


