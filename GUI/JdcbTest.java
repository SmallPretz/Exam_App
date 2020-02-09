
package GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
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
        np = 1;
        String poprawnaOdpowiedz = "";
        int score = 0;
        while(np<=9) {

        Scanner keyboardinput = new Scanner(System.in);

            for (int j = 0; j < pytania.size(); j++) {
                if (pytania.get(j).getQuestionId() == np)
                    System.out.println(pytania.get(j));
            }

            for (int i = 0; i < odpowiedzi.size(); i++) {
                if (odpowiedzi.get(i).getIdQuestion() == np)
                    System.out.println(odpowiedzi.get(i));
            }

            for (int q = 0; q < czyPoprawne.size(); q++) {
                if (czyPoprawne.get(q).getIdQuestion() == np){
                    if(czyPoprawne.get(q).getIsCorrect() == Boolean.TRUE) {
                        poprawnaOdpowiedz = czyPoprawne.get(q).getAnswer_variant();
                        System.out.println(poprawnaOdpowiedz);
                    }
                }

            }
            String answer = keyboardinput.nextLine();
            if(answer.equals(poprawnaOdpowiedz)){
                score ++;
            }

            np = np + 1;
        }
        //
        System.out.println("You got " + score + "/" + (np - 1));



        b.closeConnection();
    }


}
