package gestion_terrain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Affichage extends Application{

	public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Matchs en cours");

        VBox vbox = new VBox(); 
        Scene scene = new Scene(vbox, 300, 200);

        boolean matchEnCours = false;

        for (Matchs match : Matchs.historique) {
            if (match.MatchStatut().equals("match en cours")) {
                matchEnCours = true;
                
                Label idLabel = new Label("ID du match: " + match.idMatch);
                Label scoreLabel = new Label("Score: " + match.Score());
                Label dureeJoueeLabel = new Label("Durée jouée: " + match.getDureeJouee());
                Label dureeRestanteLabel = new Label("Durée restante: " + match.getDureeRestante());

               
                vbox.getChildren().addAll(idLabel, scoreLabel, dureeJoueeLabel, dureeRestanteLabel);
            }
        }

        if (!matchEnCours) {
            Label aucunMatchLabel = new Label("Aucun match en cours.");
            vbox.getChildren().add(aucunMatchLabel);
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}