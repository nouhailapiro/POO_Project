package gestion_terrain;

import java.util.Date;
import java.util.Calendar;


public class Matchs {
	public int idMatch;
	public String type;
	public Date date;
	public Terrain terrain;
	public Equipe equipe1;
	public Equipe equipe2; 
	public static int NbreMatchs=0;
	public Equipe equipegagnante;
	
	
	public Matchs(Date date,Terrain terrain,String type) {
		this.date=date;
		this.terrain=terrain;
		this.type=type;
		NbreMatchs++;
		this.idMatch=NbreMatchs;
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
