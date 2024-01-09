package gestion_terrain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Joueur extends Personne implements Comparable<Joueur>{
	
	public int idJoueur; 
	public String poste;
	private static int nbreJoueurs=0;
	public int performance=0; 
	public static List<Joueur> Classement=new ArrayList<>();
	
	public Joueur(String nom,String prenom,String poste,int age) {
		super(nom,prenom,age);
		this.poste=poste;
		
		nbreJoueurs++;
		this.idJoueur=nbreJoueurs;
		Classement.add(this);
		
	}
	
	
	
	
	
	
	public void changePoste(String poste) {
		this.poste = poste;
	}






	@Override
	public int compareTo(Joueur autreJoueur) {
       
        return Integer.compare( autreJoueur.performance, this.performance);
    }
	
	
	
	
	
	
}
	


