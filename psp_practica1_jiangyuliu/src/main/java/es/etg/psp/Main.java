package es.etg.psp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/es/etg/psp/vista/pantallaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1320, 858);
        stage.setTitle("Formulario de Datos");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}