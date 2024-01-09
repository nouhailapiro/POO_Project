package gestion_terrain;

import java.util.Date;
import java.util.ArrayList;

public class Compétition {
	public String nomCompétition;
	public Equipe[][]tours;
	public Matchs[][]matchsCompétition;
	public static int t=0;  //utile pour incrementer l'indice lors de  l'ajout d'une equipe à un tour
	public static int numTourActuel=1;
	
	public Compétition(String nom) {
		this.nomCompétition=nom;
		//creation d'un tableau multi-dimentionnel où chaque ligne représente un tour de la compétition
		tours = new Equipe[][] {
			new Equipe[8], //Tour 1 , 8 équipes
			new Equipe[4], //Tour 2 , 4 équipes
			new Equipe[2], //Tour 3 , 2 équipes
		};
		
		// creation d'un tableau multi-dimentionnel où chaque ligne représente les matchs d'un tour
		matchsCompétition = new Matchs[][] {
			new Matchs[4],   //les matchs du premier tour  (4 matchs)
			new Matchs[2],	 // les matchs du deuxieme tour  (2 matchs)
			new Matchs[1]    // les matchs du dernier tour   (macth final)
		};
	}
			
		
		
		
		
	//ajouter une equipe a la compétition
	public void ajouterEquipe(Equipe equipe)throws ExceptionEquipeIncomplete {
		if(equipe.NombreJoueursManquant()==0) {
			if(t<tours[0].length) {
				tours[0][t]= equipe;   //l'equipe ajoutée est affectée au premier tour
				equipe.participer_competition=true;
				t++;
			}
			else {
				System.out.println("vous ne pouvez plus ajouter d'équipes à la compétition" );
			}
		
		}
		else {
			throw new ExceptionEquipeIncomplete("l'équipe est incomplète");
		}
	}
	
	public void organiserMatchTour (int numTour, Date date, Terrain terrain, String type)throws  ExceptionEquipeIncomplete{
		int i=0, j=1, k=0;
		while(i<=tours[numTour-1].length-2 & j<=tours[numTour-1].length-1) { //l'utilisation de numTour-1 est due au decalage des numero de tours et leur indice correspondant dans le tableau (Tour1 correspond a tours[0]
			Matchs nouveauMatch = new Matchs (date, terrain, tours[numTour-1][i],tours[numTour-1][j]);    // creation d'un nouveau match
			 //attribuer des equipes à ce match
			matchsCompétition[numTour-1][k]=nouveauMatch;  //ajouter ce match à la competition au tour correspondant 
			i+=2;
			j+=2;
			k++;
		}
	}
	
	//on fait passer les equipes qui ont gagné au tour suivant 
	public void passerTourSuivant() {
		Matchs [] tab = matchsCompétition[numTourActuel-1];
		for(int i=0; i<tab.length; i++ ) {
			tours[numTourActuel-1][i]=tab[i].EquipeGagnante;
		}
		numTourActuel++;
	}
	
	
	
	
			
	
	
			
	
		
		
	
	
	
	

}