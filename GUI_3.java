import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;


public class GUI_3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        // Buttony
        Button btn1 = new Button(("Btn1"));

        // Labele
        Label label = new Label("Hello World, JavaFX !");




        // wywołania
        GridPane gridPane = new GridPane();

        Scene scene = new Scene(label, 400, 200);
        Scene scene1 = new Scene(btn1, 300, 200 );
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}