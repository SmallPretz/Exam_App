package GUI;

import PobierzZBazy.Test;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import model.Odpowiedzi;
import model.Pytanie;

import java.util.GregorianCalendar;
import java.util.List;


public class GUI_3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        Pane root = new Pane();
        Button btn1 = new Button();
        btn1.setText("Pobierz pytanie");
        Button btn2 = new Button();
        btn2.setText("Dodaj pytanie");
        Button btn3 = new Button();
        btn3.setText("Usuń pytanie");

        // btn1
        btn1.setLayoutX(200);
        btn1.setLayoutY(130);
        root.getChildren().add(btn1);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage dialog = new Stage(); // new stage
                dialog.initModality(Modality.APPLICATION_MODAL);
                // Defines a modal window that blocks events from being
                // delivered to any other application window.
                dialog.initOwner(primaryStage);
                Label lbl1 = new Label();
                lbl1.setText("Ok");
                /*
                Scene dialogScene = new Scene(lbl1, 300, 200);

                dialog.setScene(dialogScene);
                dialog.show();
                */
                //JdcbTest.main(null);


                Test b = new Test();
                List<Pytanie> pytania = b.selectPytania();
                List<Odpowiedzi> odpowiedzi = b.selectOdpowiedzi();
                int np;
                np = 1;


                String textPytanie = pytania.get(1).getQuestion();
                int textOdpowiedz1 = odpowiedzi.get(1);
                int textOdpowiedz2 = odpowiedzi.get(2);
                int textOdpowiedz3 = odpowiedzi.get(3);
                int textOdpowiedz4 = odpowiedzi.get(4);

                String TextOdpowiedz1String = Integer.toString(textOdpowiedz1);
                String TextOdpowiedz2String = Integer.toString(textOdpowiedz2);
                String TextOdpowiedz3String = Integer.toString(textOdpowiedz3);
                String TextOdpowiedz4String = Integer.toString(textOdpowiedz4);


                Text pytanko = new Text();
                Text odpowiedz1 = new Text();
                Text odpowiedz2 = new Text();
                Text odpowiedz3 = new Text();
                Text odpowiedz4 = new Text();


                odpowiedz1.setText(TextOdpowiedz1String);
                odpowiedz2.setText(TextOdpowiedz1String);
                odpowiedz3.setText(TextOdpowiedz1String);
                odpowiedz4.setText(TextOdpowiedz1String);
                pytanko.setText(textPytanie);

                pytanko.setX(50);
                pytanko.setY(50);

                odpowiedz1.setY(80);
                odpowiedz1.setX(60);
                odpowiedz2.setY(100);
                odpowiedz2.setX(60);
                odpowiedz3.setY(120);
                odpowiedz3.setX(60);
                odpowiedz4.setY(140);
                odpowiedz4.setX(60);


                Group root = new Group(pytanko,odpowiedz1,odpowiedz2,odpowiedz3,odpowiedz4);
                Scene scene = new Scene(root, 600,300);
                dialog.setScene(scene);
                dialog.show();

                /*
                while(np<=4) {
                    for (int j = 0; j < pytania.size(); j++) {
                        if (pytania.get(j).getQuestionId() == np
                        )
                            System.out.println(pytania.get(j));

                    }

                    for (int i = 0; i < odpowiedzi.size(); i++) {
                        if (odpowiedzi.get(i).getIdQuestion() == np)
                            System.out.println(odpowiedzi.get(i));

                    }
                    np = np + 1;
                }
                */

                }



        });




        btn2.setLayoutX(200);
        btn2.setLayoutY(230);
        root.getChildren().add(btn2);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage dialog = new Stage(); // new stage
                dialog.initModality(Modality.APPLICATION_MODAL);
                // Defines a modal window that blocks events from being
                // delivered to any other application window.
                dialog.initOwner(primaryStage);
                Label lbl1 = new Label();
                lbl1.setText("Ok");
                Scene dialogScene = new Scene(lbl1, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();


            }
        });

        btn3.setLayoutX(200);
        btn3.setLayoutY(330);
        root.getChildren().add(btn3);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage dialog = new Stage(); // new stage
                dialog.initModality(Modality.APPLICATION_MODAL);
                // Defines a modal window that blocks events from being
                // delivered to any other application window.
                dialog.initOwner(primaryStage);
                Label lbl1 = new Label();
                lbl1.setText("Ok");
                Scene dialogScene = new Scene(lbl1, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();


            }
        });

        primaryStage.setWidth(1200);
        primaryStage.setHeight(700);
        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}