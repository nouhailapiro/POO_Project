package gestion_terrain;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import java.io.*;


public class test {
	public static void main(String[] args) throws IOException {
		Calendar calendar = Calendar.getInstance();

	   
	    calendar.set(Calendar.YEAR, 2024);
	    calendar.set(Calendar.MONTH, Calendar.JANUARY); 
	    calendar.set(Calendar.DAY_OF_MONTH, 8);
	    calendar.set(Calendar.HOUR_OF_DAY, 19);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);

	    
	    Date dateMatch1 = calendar.getTime();
	    Terrain terrain1= new Terrain("AlWifaq",22,"Rabat");
	    Equipe equipeBleu=new Equipe("EquipeBleu");
	    Equipe equipeRouge=new Equipe("EquipeRouge");
	    Joueur joueur1=new Joueur("Ahmed","Motawakil","Gardien",23);
	    Joueur joueur2=new Joueur("Mohammed","ElArabi","Defenseur1",24);
	    Joueur joueur3=new Joueur("Reda","Lazrak","Defenseur2",28);
	    Joueur joueur4=new Joueur("Amine","Rami","Attaquant",20);
	    Joueur joueur5=new Joueur("Yassine","Benabbou","Milieu1",22);
	    Joueur joueur6=new Joueur("Salmane","Alami","Milieu2",25);
	    Joueur joueur7=new Joueur("Charaf","Said","Gardien",23);
	    Joueur joueur8=new Joueur("Hamza","Zair","Defenseur1",24);
	    Joueur joueur9=new Joueur("Abdellah","Bouslama","Defenseur2",28);
	    Joueur joueur10=new Joueur("Aymane","Nacer","Attaquant",20);
	    Joueur joueur11=new Joueur("Ibrahim","Salmi","Milieu1",22);
	    Joueur joueur12=new Joueur("Samir","Saadani","Milieu2",25);
	    try {
			equipeBleu.AjouterJoueur(joueur1);
			equipeBleu.AjouterJoueur(joueur2);
			equipeBleu.AjouterJoueur(joueur3);
			equipeBleu.AjouterJoueur(joueur4);
			equipeBleu.AjouterJoueur(joueur5);
			equipeBleu.AjouterJoueur(joueur6);
			
		} catch (EquipeCompleteException e) {
			
			e.printStackTrace();
		}
	    try {
			equipeRouge.AjouterJoueur(joueur7);
			equipeRouge.AjouterJoueur(joueur8);
			equipeRouge.AjouterJoueur(joueur9);
			equipeRouge.AjouterJoueur(joueur10);
			equipeRouge.AjouterJoueur(joueur11);
			equipeRouge.AjouterJoueur(joueur12);
			
		} catch (EquipeCompleteException e) {
			
			e.printStackTrace();
		}
	    try {
			Matchs match1= new Matchs(dateMatch1,terrain1,equipeBleu,equipeRouge);
			 match1.But(equipeBleu);
			
			
			 
			
			
		} catch (ExceptionEquipeIncomplete e) {
		
			e.printStackTrace();
		}

	    
	    
	    
	    
	    
	  
        
    
      Terrain terrain2= new Terrain("ASafae",22,"Rabat");
	    Equipe equipeVerte=new Equipe("EquipeVerte");
	    Equipe equipeJaune=new Equipe("EquipeJaune");
	    Joueur joueur13=new Joueur("Ahmed","Zaki","Gardien",23);
	    Joueur joueur14=new Joueur("Achraf","Ouzakri","Defenseur1",24);
	    Joueur joueur15=new Joueur("Said","Radi","Defenseur2",28);
	    Joueur joueur16=new Joueur("Karim","Karaoui","Attaquant",20);
	    Joueur joueur17=new Joueur("Fahd","Alaoui","Milieu1",22);
	    Joueur joueur18=new Joueur("Charif","Seghir","Milieu2",25);
	    Joueur joueur19=new Joueur("Mohammed","Benddo","Gardien",23);
	    Joueur joueur20=new Joueur("Aziz","Elwahabi","Defenseur1",24);
	    Joueur joueur21=new Joueur("Abdellah","Samie","Defenseur2",28);
	    Joueur joueur22=new Joueur("Sami","Saidi","Attaquant",20);
	    Joueur joueur23=new Joueur("Mbarek","Salmi","Milieu1",22);
	    Joueur joueur24=new Joueur("Othmane","Mbarki","Milieu2",25);
		try {
			equipeJaune.AjouterJoueur(joueur1);
			equipeJaune.AjouterJoueur(joueur2);
			equipeJaune.AjouterJoueur(joueur3);
			equipeJaune.AjouterJoueur(joueur4);
			equipeJaune.AjouterJoueur(joueur5);
			equipeJaune.AjouterJoueur(joueur6);
			equipeVerte.AjouterJoueur(joueur7);
			equipeVerte.AjouterJoueur(joueur8);
			equipeVerte.AjouterJoueur(joueur9);
			equipeVerte.AjouterJoueur(joueur10);
			equipeVerte.AjouterJoueur(joueur11);
			equipeVerte.AjouterJoueur(joueur12);
		} catch (EquipeCompleteException e) {
		
			e.printStackTrace();
		}
		
		try {
			Matchs match2 = new Matchs(new Date(),terrain2,equipeJaune,equipeVerte);
			match2.But(equipeJaune);
		} catch (ExceptionEquipeIncomplete e) {
		
			e.printStackTrace();
		}

     
	    String cheminString = "files/file.txt";
        Path cheminPath = Paths.get(cheminString);
    	 		
		  Matchs.Historique(cheminPath) ;
		  
	      
	      
		    Supporter.NoterPerformance(joueur1,4);
		    Supporter.NoterPerformance(joueur2,2);
		    Supporter.NoterPerformance(joueur4,5);
		    Supporter.NoterPerformance(joueur12,3);
		    Supporter.NoterPerformance(joueur5,1);
		    Supporter.NoterPerformance(joueur5,3);
		    Supporter.NoterPerformance(joueur8,5);
		    Supporter.NoterPerformance(joueur12,2);
		    Supporter.NoterPerformance(joueur24,3);
		    Supporter.NoterPerformance(joueur13,4);
		    Supporter.NoterPerformance(joueur11,2);
		    Supporter.NoterPerformance(joueur13,5);
		    Supporter.NoterPerformance(joueur2,5);
		    Collections.sort(Joueur.Classement);
		  int  d=0;
		    for(Joueur joueur: Joueur.Classement) {
		    	d=d+1;
		    	System.out.println(d+" "+joueur.getNom()+" "+joueur.getPrenom()+" "+joueur.performance);
		    	
		    }
        
	   
		    String messageEncouragement= "Vous etes talentueux!";
		    int argent= 500;
		    		 Supporter.OffrirCadeau(messageEncouragement, equipeBleu);
		    		 Supporter.OffrirCadeau(argent, equipeBleu);
		    		 equipeBleu.afficherCadeaux();
		    
	}
  

}