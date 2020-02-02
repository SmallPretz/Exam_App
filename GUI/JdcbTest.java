
package GUI;

import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
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
        while(np<=7) {
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
        for (int j = 0; j < pytania.size(); j++) {
            if (pytania.get(j).getQuestionId() == np
            )
                System.out.println(pytania.get(j));

        }
        for (int i = 0; i < odpowiedzi.size(); i++) {
            if (odpowiedzi.get(i).getIdQuestion() == np && odpowiedzi.get(i).getAnswer_variant().equals("A"))
                System.out.println(odpowiedzi.get(i));
        }
        /*
        pytania.get(1).getQuestion();

        System.out.println(odpowiedzi.get(1).getIdQuestion());
        System.out.println(odpowiedzi.get(2).getIdQuestion());
        System.out.println(odpowiedzi.get(3).getIdQuestion());
        System.out.println(odpowiedzi.get(4).getIdQuestion());
        */

        //System.out.println("Pytanie: ");
        //for(Pytanie c: pytania)
        //	System.out.println("\n" + c);

        //System.out.println("Odpowiedz: ");
        //for(Odpowiedzi k: odpowiedzi)
        //	System.out.println("\n"+ k);

        b.closeConnection();
    }

}
