
package GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;
import model.czyPoprawne;



public class JdcbTest {
    public static void main(String[] args) {
        Test b = new Test();

        List<Pytanie> pytania = b.selectPytania();
        List<Odpowiedzi> odpowiedzi = b.selectOdpowiedzi();
        List<czyPoprawne> czyPoprawne = b.selectczyPoprawne();
        int np;
        np = 9;
        String poprawnaOdpowiedz = "";

        for (int i = 0; i < czyPoprawne.size(); i++) {
            if (czyPoprawne.get(i).getIdQuestion() == np){
                if(czyPoprawne.get(i).getIsCorrect() == Boolean.TRUE) {
                    System.out.println(czyPoprawne.get(i).getAnswer_variant());
                }
            }

        }

        /*
        while(np<=7) {
            int score = 0;
            Scanner keyboardinput = new Scanner(System.in);

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

        /*
        while(myStartObj<5){
            System.out.println(pytania.get(np));
            System.out.println(odpowiedzi.get(np));
            myStartObj = myStartObj + 1;
            np = np + 1;
        }
        */
        /*
        b.insertPytanie(5,"Jakie miasto jest stolicš Polski?  ","Geografia");

        b.insertOdpowiedzi(5,"Malbork",false);
        b.insertOdpowiedzi(5,"Gniezno",false);
        b.insertOdpowiedzi(5,"Warszawa",true);
        b.insertOdpowiedzi(5,"Poznań",false);

        */

        //System.out.println(pytania.get(2));


        // Wszystkie pytania i odpowiedzi.



        /*
        for (int j = 0; j < pytania.size(); j++) {
            if (pytania.get(j).getQuestionId() == np
            )
                System.out.println(pytania.get(j));

        }
        for (int i = 0; i < odpowiedzi.size(); i++) {
            if (odpowiedzi.get(i).getIdQuestion() == np && odpowiedzi.get(i).getAnswer_variant().equals("A"))
                System.out.println(odpowiedzi.get(i));
        }
        */
        /*
        pytania.get(1).getQuestion();

        System.out.println(odpowiedzi.get(1).getIdQuestion());
        System.out.println(odpowiedzi.get(2).getIdQuestion());
        System.out.println(odpowiedzi.get(3).getIdQuestion());
        System.out.println(odpowiedzi.get(4).getIdQuestion());
        */



        b.closeConnection();
    }

}
