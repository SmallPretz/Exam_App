package GUI;

import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;



public class JdcbTest {
    public static void main(String[] args) {
        Test b = new Test();
        List<Pytanie> pytania = b.selectPytania();
        List<Odpowiedzi> odpowiedzi = b.selectOdpowiedzi();
        int np;
        np = 1;

        /*
        while(myStartObj<5){
            System.out.println(pytania.get(np));
            System.out.println(odpowiedzi.get(np));
            myStartObj = myStartObj + 1;
            np = np + 1;
        }
        */
        //b.insertPytanie(5,"Jakie miasto jest stolicš Polski?  ","Geografia");

        //b.insertOdpowiedzi(3,"1",false);
        //b.insertOdpowiedzi(3,"2",true);
        //b.insertOdpowiedzi(3,"7",false);




        //System.out.println(pytania.get(2));
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
        pytania.get(1).getQuestion();

        System.out.println(odpowiedzi.get(1));
        System.out.println(odpowiedzi.get(2));
        System.out.println(odpowiedzi.get(3));
        System.out.println(odpowiedzi.get(4));
        //System.out.println("Pytanie: ");
        //for(Pytanie c: pytania)
        //	System.out.println("\n" + c);

        //System.out.println("Odpowiedz: ");
        //for(Odpowiedzi k: odpowiedzi)
        //	System.out.println("\n"+ k);

        b.closeConnection();
    }

}