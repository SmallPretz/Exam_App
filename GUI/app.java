package GUI;

import java.util.Scanner;

public class app {
    public static void main(String [] args) {
        String q1 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
        String q2 = "What color are bananas?\n" + "(a)red/green\n(b)Yellow\n(c)Blue\n";
        Questions [] questions = {
                new Questions(q1, "a"),
                new Questions(q2, "b")
        };
        takeTest(questions);


    }
    public static void takeTest(Questions [] questions){
        int score = 0;
        Scanner keyboardinput = new Scanner(System.in);
        for(int q = 0; q < questions.length; q++){
            System.out.println(questions[q].prompt);
            String answer = keyboardinput.nextLine();
            if(answer.equals(questions[q].answer)){
                score ++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length + " points");
    }
}
