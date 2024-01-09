package gestion_terrain;

import java.util.ArrayList;
import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Affichage extends Application{
	

	public static void main(String[] args) throws EquipeCompleteException, ExceptionEquipeIncomplete {
        launch(args);
       

    }
	

    @Override
    public void start(Stage primaryStage) throws Exception {
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
    	equipeBleu.AjouterJoueur(joueur1);
    	equipeBleu.AjouterJoueur(joueur2);
    	equipeBleu.AjouterJoueur(joueur3);
    	equipeBleu.AjouterJoueur(joueur4);
    	equipeBleu.AjouterJoueur(joueur5);
    	equipeBleu.AjouterJoueur(joueur6);
    	equipeRouge.AjouterJoueur(joueur7);
    	equipeRouge.AjouterJoueur(joueur8);
    	equipeRouge.AjouterJoueur(joueur9);
    	equipeRouge.AjouterJoueur(joueur10);
    	equipeRouge.AjouterJoueur(joueur11);
    	equipeRouge.AjouterJoueur(joueur12);
    	Matchs match1= new Matchs(new Date(),terrain1,equipeBleu,equipeRouge);
    	match1.But(equipeBleu);
    	Terrain terrain2= new Terrain("ASafae",22,"Rabat");
    	Equipe equipeVerte=new Equipe("EquipeVerte");
    	Equipe equipeJaune=new Equipe("EquipeJaune");
    	Joueur joueur13=new Joueur("Ahmed","Motawakil","Gardien",23);
    	Joueur joueur14=new Joueur("Mohammed","ElArabi","Defenseur1",24);
    	Joueur joueur15=new Joueur("Reda","Lazrak","Defenseur2",28);
    	Joueur joueur16=new Joueur("Amine","Rami","Attaquant",20);
    	Joueur joueur17=new Joueur("Yassine","Benabbou","Milieu1",22);
    	Joueur joueur18=new Joueur("Salmane","Alami","Milieu2",25);
    	Joueur joueur19=new Joueur("Charaf","Said","Gardien",23);
    	Joueur joueur20=new Joueur("Hamza","Zair","Defenseur1",24);
    	Joueur joueur21=new Joueur("Abdellah","Bouslama","Defenseur2",28);
    	Joueur joueur22=new Joueur("Aymane","Nacer","Attaquant",20);
    	Joueur joueur23=new Joueur("Ibrahim","Salmi","Milieu1",22);
    	Joueur joueur24=new Joueur("Samir","Saadani","Milieu2",25);
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
    	Matchs match2= new Matchs(new Date(),terrain2,equipeJaune,equipeVerte);
    	match2.But(equipeJaune);
        primaryStage.setTitle("Matchs en cours");

        VBox vbox = new VBox(); 
        Scene scene = new Scene(vbox, 300, 200);
     
        

                for (Matchs match : Matchs.historique) {
                	if(match.MatchStatut()==0) {
              
                Label idLabel = new Label("ID du match: " + Integer.toString(match.idMatch));
                Label scoreLabel = new Label("Score: " + match.Score());
                Label dureeJoueeLabel = new Label("Durée jouée: " + match.getDureeJouee());
                Label dureeRestanteLabel = new Label("Durée restante: " + match.getDureeRestante());

               
                vbox.getChildren().addAll(idLabel, scoreLabel, dureeJoueeLabel, dureeRestanteLabel);
                }
                	
                }
        
                primaryStage.setScene(scene);
                primaryStage.show();

    }

}