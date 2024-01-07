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
		//creation d'un tableau multi-dimentionnel ou chaque ligne représente un tour de la compétition
		tours = new Equipe[][] {
			new Equipe[8], //Tour 1 , 8 équipes
			new Equipe[4], //Tour 2 , 4 équipes
			new Equipe[2], //Tour 3 , 2 équipes
		};
		
		matchsCompétition = new Matchs[][] {
			new Matchs[4],
			new Matchs[2],
			new Matchs[1]
		};
	}
			
		
		
		
		
	//ajouter une equipe a la compétition
	public void ajouterEquipe(Equipe equipe)throws ExceptionEquipeIncomplete {
		if(equipe.NombreJoueursManquant()==0) {
		tours[0][t]= equipe;
		equipe.participer_competition=true;
		t++;
		}
		else {
			throw new ExceptionEquipeIncomplete("l'équipe est incomplète");
		}
	}
	
	public void organiserMatchTour (int numTour, Date date, Terrain terrain)throws  ExceptionEquipeIncomplete{
		int i=0, j=1, k=0;
		while(i<=tours[numTour].length-2 & j<=tours[numTour].length-1) {
			Matchs nouveauMatch = new Matchs (date, terrain, tours[numTour-1][i],tours[numTour-1][j]);
			
			matchsCompétition[numTour-1][k]=nouveauMatch;
			i+=2;
			j+=2;
			k++;
		}
	}
	
	public void passerTourSuivant() {
		Matchs [] tab = matchsCompétition[numTourActuel-1];
		for(int i=0; i<tab.length; i++ ) {
			tours[numTourActuel][i]=tab[i].EquipeGagnante;
		}
		numTourActuel++;
	}
	
	
	
	
			
	
	
			
	
		
		
	
	
	
	

}
