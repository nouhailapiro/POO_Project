package gestion_terrain;


import java.util.ArrayList;
import java.util.List;

public class Equipe {
	
	public String NomEquipe;
	public List<Joueur> JoueursEquipe;
	public List<Object> Cadeaux;
	public int nbreJoueurMax=11;
  
    public boolean participer_competition;
    
	
	public Equipe(String NomEquipe){
		this.NomEquipe=NomEquipe;
		
		List<Joueur> JoueursEquipe = new ArrayList<Joueur>();}
		
	public void AjouterJoueur(Joueur joueur) throws EquipeCompleteException {
		if(!JoueursEquipe.contains(joueur) && !PosteExiste(joueur.poste)) {
			if (this.NombreJoueursManquant() > 0) {
                JoueursEquipe.add(joueur);
                
            } 
			else {
                throw new EquipeCompleteException("L'équipe est complète.");}
            
	}
	} 
	public void afficherCadeaux() {
        System.out.println("Liste des cadeaux de l'équipe:");
        for (Object cadeau : Cadeaux) {
            System.out.println(cadeau);
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
			if(j.poste.equals(Poste)) {
				return true;
			}
		}
		return false;
	}
	
	

	

		
		

	
	
	
	
	



}