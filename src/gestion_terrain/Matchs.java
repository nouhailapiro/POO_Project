package gestion_terrain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Calendar;


public class Matchs {
	public int idMatch;
	
	public Date date;
	public Terrain terrain;
	public Equipe equipe1;
	public Equipe equipe2; 
	public static int NbreMatchs=0;
	public HashMap<Equipe,Integer> score;
	public Equipe EquipeGagnante=null;
	public static List<Matchs> historique=new ArrayList<>(); //pour enregistrer chaque match instancié
	
	
	public Matchs(Date date,Terrain terrain,Equipe equipe1, Equipe equipe2)throws ExceptionEquipeIncomplete {
		this.date=date;
		this.terrain=terrain;
	
		
		NbreMatchs++;
		this.idMatch=NbreMatchs;
		
		if (equipe1.NombreJoueursManquant()==0 && equipe2.NombreJoueursManquant()==0) {
			this.equipe1=equipe1;
			this.equipe2=equipe2;
		}
		else {
			throw new ExceptionEquipeIncomplete("L'équipe est incomplète.");
		}
		score= new HashMap<Equipe,Integer>();
		score.put(equipe1, 0);
		score.put(equipe2, 0);
		historique.add(this);
		
		
	}  
	
	public String Score() {
	    StringBuilder scoreString = new StringBuilder();

	    for (Equipe equipe : this.score.keySet()) {
	        scoreString.append(equipe.NomEquipe).append(":").append(Integer.toString(this.score.get(equipe))).append(" ");
	    }

	    return scoreString.toString();
	}
		


		
	public void But(Equipe equipe) {
		if( score.containsKey(equipe)){
			score.put(equipe,score.get(equipe)+1);}
		
		
			if(score.get(equipe1)<score.get(equipe2)) {
				EquipeGagnante=equipe2;
			}
			if(score.get(equipe2)<score.get(equipe1)) {
				EquipeGagnante=equipe1;
			}
			else { EquipeGagnante=null;}
			}
		
		
	

 
	public int MatchStatut() {
	    Date datedebutmatch = this.date;
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(datedebutmatch);

	    calendar.add(Calendar.HOUR_OF_DAY, 1);
	    calendar.add(Calendar.MINUTE, 30);

	    Date finmatch = calendar.getTime();

	    Date currentDate = new Date();
	    if (currentDate.after(datedebutmatch) && currentDate.before(finmatch)) {
	        return 0;
	    } else if (finmatch.before(currentDate)) {
	        return -1;
	    } else {
	        return 1;
	    }
	}
public static void Historique(Path cheminPath) throws IOException {

         for (Matchs match : historique) {
        	 if(match.MatchStatut()==-1) {
        		 String texte="ID du match: " + Integer.toString(match.idMatch)+"\nDate du match: " + 
        		 		match.date.toString()+"\nTerrain: " + 
        				 match.terrain.nomTerrain+"\nScore: " + match.Score()+"\n";
             Files.write(cheminPath, texte.getBytes(),StandardOpenOption.APPEND,StandardOpenOption.CREATE,
            		 StandardOpenOption.WRITE);
         }
         }

         
     }
 
public String getDureeRestante() {
	if (this.MatchStatut()==0) {
		Date datedebutmatch=this.date;
		Date currentDate = new Date();
		long dureeTotale = 1 * 60 * 60 * 1000 + 30 * 60 * 1000;
		long dureeRestante= dureeTotale-(currentDate.getTime()-datedebutmatch.getTime());
		long secondes = (dureeRestante / 1000) % 60;
	    long minutes = (dureeRestante / (1000 * 60)) % 60;
	    long heures = dureeRestante / (1000 * 60 * 60);

	    String dureeRestanteString = String.format("%02d:%02d:%02d", heures, minutes, secondes);
	    return dureeRestanteString;

		
		
	}
	return null;
}
	
public String getDureeJouee() {
	if (this.MatchStatut()==0) {
		Date datedebutmatch=this.date;
		Date currentDate = new Date();
		
		long dureeJouee= currentDate.getTime()-datedebutmatch.getTime();
		long secondes = (dureeJouee / 1000) % 60;
	    long minutes = (dureeJouee / (1000 * 60)) % 60;
	    long heures = dureeJouee / (1000 * 60 * 60);

	    String dureeJoueeString = String.format("%02d:%02d:%02d", heures, minutes, secondes);
	    return dureeJoueeString;

		
		
	}
	return null;
}

	
	
	
	

	
	
	
	
	
	
	
	

}