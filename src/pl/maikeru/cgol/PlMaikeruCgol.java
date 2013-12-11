package pl.maikeru.cgol;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author maikeru
 */
public class PlMaikeruCgol extends Application {

    @Override
    public void start(Stage stage) {
        Visualisation.startGame(stage, PlayableAdapter.createPlayable());
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
    