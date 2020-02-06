package GUI;
import java.sql.*;
import java.util.*;
// Zmiana treści pytania


import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;


public class UpdateQuestions {
    public static void main(String[] args){
        int question_id;
        String newQuestion;
        String subject;
        /*
        subject = "matematyka";
        question_id = 7;
        newQuestion = "Jaki będzie wynik działania 5 - 1 ?";
        */
        System.out.println("Które pytanie chcesz modyfikować? ");
        Scanner input = new Scanner(System.in);
        question_id = input.nextInt();

        System.out.println("Wprowadz nową treść pytania: ");
        Scanner input2 = new Scanner(System.in);
        newQuestion = input2.next();

        System.out.println("Wprowadź nazwe przedmiotu: ");
        Scanner input3 = new Scanner(System.in);
        subject = input3.next();


        /*
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javaapp?user=root&password=Widzew123@");
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE Exam_Questions " +
                                 "SET question = " + "'" + newQuestion + "'" + "," + "subject = " + "'" + subject + "'" +
                                 "WHERE question_id = " + question_id +";");

            conn.close();
        }catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

         */
    }
}
