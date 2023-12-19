package gestion_terrain;

import java.util.Date;

public class Matchs {
	public int idMatch;
	public Date date;
	public Terrain terrain;
	public Equipe equipe1;
	public Equipe equipe2; 
	public static int NbreMatchs=0;
	
	
	public Matchs(Date date,Terrain terrain,Equipe equipe1,Equipe equipe2) {
		this.date=date;
		this.terrain=terrain;
		this.equipe1=equipe1;
		this.equipe2=equipe2;
		this.terrain=terrain;
		NbreMatchs++;
		this.idMatch=NbreMatchs;
		
	} 
	
	
	

}
