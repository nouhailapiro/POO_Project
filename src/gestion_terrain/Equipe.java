package gestion_terrain;

import java.util.ArrayList;

public class Equipe {
	public String NomEquipe;
	public ArrayList<Joueur> JoueursEquipe;
	public int nbreJoueurMax;
	
	public Equipe(String NomEquipe){
		this.NomEquipe=NomEquipe;
		ArrayList<Joueur> JoueursEquipe= new ArrayList<Joueur>();}
		
	public void AjouterJoueur(Joueur joueur) {
		if(!JoueursEquipe.contains(joueur) & !PosteExiste(joueur.getPoste())) {
			JoueursEquipe.add(joueur);}
	}
		  
	 
	
	public void SupprimerJoueur(Joueur joueur) {
		JoueursEquipe.remove(joueur); 
		
	} 

public int NombreJoueurManquants() {
	return nbreJoueurMax-JoueursEquipe.size() ;
}
 
public boolean PosteExiste(String Poste) { 
	for (Joueur j : JoueursEquipe) {
		if(j.getPoste().equals(Poste)) {
			return true;
		}
	}
	return false;
}

	

		
		

	
	
	
	
	



}