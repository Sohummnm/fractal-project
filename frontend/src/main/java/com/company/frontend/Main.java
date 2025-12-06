package com.company.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage s) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/ui/main.fxml")));
        s.setScene(scene);
        s.setTitle("Employee Manager");
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
