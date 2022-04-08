package gui;
import algorithms.MiniMax;
import algorithms.MinimaxAlphaBeta;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.StateOperations;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        var v = MinimaxAlphaBeta.decision(-4496562564508441720l);
        System.out.println(v);
//        launch();

        var minmax = new MiniMax(10);

        var node = minmax.max(0, 0);
        System.out.println("Final state:-");
        System.out.println(node.getScore());
        StateOperations.printState(node.getState());

    }
}