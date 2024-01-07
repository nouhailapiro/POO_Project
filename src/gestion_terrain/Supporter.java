package gestion_terrain;

import java.util.List;

public class Supporter extends Personne {
	       public List<Equipe> EquipesFavorites;
           public Supporter(String nom, String prenom, int age) {
        	   super(nom,prenom,age);
        	   
           }
           
           public void AjouterEquipeFavorite(Equipe equipe) {
        	   this.EquipesFavorites.add(equipe);
           }
           public<T> void OffrirCadeau(T cadeau, Equipe equipe) {
        	   equipe.Cadeaux.add((Object) cadeau);
        	   
        	   
           }
}
