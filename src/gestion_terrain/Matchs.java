package gestion_terrain;

import java.util.Date;
import java.util.HashMap;
import java.util.Calendar;


public class Matchs {
	public int idMatch;
	public String type;
	public Date date;
	public Terrain terrain;
	public Equipe equipe1;
	public Equipe equipe2; 
	public static int NbreMatchs=0;
	public HashMap<Equipe,Integer> Score;
	public static Equipe EquipeGagnante=null;
	
	
	public Matchs(Date date,Terrain terrain,String type) {
		this.date=date;
		this.terrain=terrain;
		this.type=type;
		NbreMatchs++;
		this.idMatch=NbreMatchs;
	 Score= new HashMap<Equipe,Integer>();
	 Score.put(equipe1, 0);
    Score.put(equipe2, 0);
		
		
	}  
	public void But(Equipe equipe) {
		if( Score.containsKey(equipe)){
			Score.put(equipe,Score.get(equipe)+1);}
		
		
			if(Score.get(equipe1)<Score.get(equipe2)) {
				EquipeGagnante=equipe2;
			}
			if(Score.get(equipe2)<Score.get(equipe1)) {
				EquipeGagnante=equipe1;
			}
			else { EquipeGagnante=null;}
			}
		
		
	
public void AjouterEquipesParticipantes(Equipe equipe1, Equipe equipe2) throws ExceptionEquipeIncomplete, ExceptionEquipesIncompatibles {
	if(equipe1.type.equals(this.type) && equipe2.type.equals(this.type)) {
	if (equipe1.NombreJoueursManquant()==0 && equipe2.NombreJoueursManquant()==0) {
		this.equipe1=equipe1;
		this.equipe2=equipe2;
	}
	else {
		throw new ExceptionEquipeIncomplete("L'équipe est incomplète.");
	}}
	

else {
	throw new ExceptionEquipesIncompatibles("Equipes Incompatibles.");
} 

	} 
 
public void MatchStatut() {
	Date datedebutmatch=this.date;
	Calendar calendar = Calendar.getInstance();
    calendar.setTime(datedebutmatch);

  
    calendar.add(Calendar.HOUR_OF_DAY, 1);
    calendar.add(Calendar.MINUTE, 30);

    Date finmatch = calendar.getTime();

    
	 Date currentDate = new Date();
	 int result2 =finmatch.compareTo(currentDate);
	 int result1=this.date.compareTo(currentDate);
	 if (result2<0) {
         System.out.println("Le match a déja été joué.");
     } else if (result1 > 0) {
         System.out.println("Le match sera joué prochainement.");
     } else {
         System.out.println("Le match est en cours");
     }
}
		
		
	

	
	
	
	
	
	
	
	

}
