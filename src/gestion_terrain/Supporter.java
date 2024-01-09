package gestion_terrain;

import java.util.ArrayList;
import java.util.List;

public class Supporter extends Personne {
	       public List<Equipe> EquipesFavorites= new ArrayList<>();
           public Supporter(String nom, String prenom, int age) {
        	   super(nom,prenom,age);
        	   
           }
           
           public void AjouterEquipeFavorite(Equipe equipe) {
        	   this.EquipesFavorites.add(equipe);
           }
           public static <T> void OffrirCadeau(T cadeau, Equipe equipe) {
        	   equipe.Cadeaux.add((Object) cadeau);
        	   
        	   
           }
           public static void NoterPerformance(Joueur joueur,int notesur5) {
        	   if (notesur5<=5) {
        		   joueur.performance=joueur.performance+notesur5;
        	   }
        	   else {
        		   System.out.println("la note doit etre sur 5.");
        	   }
           }
}
