package gestion_terrain;

import java.util.ArrayList;

public class Equipe {
	public String NomEquipe;
	public ArrayList<Joueur> JoueursEquipe;
	public int nbreJoueurMax;
    public String type;
	
	public Equipe(String NomEquipe, String type){
		this.NomEquipe=NomEquipe;
		this.type=type;
		ArrayList<Joueur> JoueursEquipe= new ArrayList<Joueur>();}
		
	public void AjouterJoueur(Joueur joueur) throws EquipeCompleteException {
		if(!JoueursEquipe.contains(joueur) && !PosteExiste(joueur.getPoste())) {
			if (this.NombreJoueursManquant() > 0) {
                JoueursEquipe.add(joueur);
                
            } 
			else {
                throw new EquipeCompleteException("L'équipe est complète.");}
            
	}
	}
		  
	 
	
	public void SupprimerJoueur(Joueur joueur) {
		JoueursEquipe.remove(joueur); 
		
	} 

public int NombreJoueursManquant() {
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