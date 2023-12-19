package gestion_terrain;

public class Joueur {
	private String nom;
	private String prenom;
	private String poste;
	private int age;
	private int idJoueur; 
	private static int nbreJoueurs=0;
	
	public Joueur(String nom,String prenom,String poste,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.poste=poste;
		this.age=age;
		nbreJoueurs++;
		this.idJoueur=nbreJoueurs;
	}
	
	
	public int getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
