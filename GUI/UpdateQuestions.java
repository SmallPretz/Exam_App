package GUI;
import java.sql.*;
// Zmiana treści pytania


import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;

public class UpdateQuestions {
    public static void main(String[] args){
        int question_id;
        String newQuestion;
        String subject;
        subject = "matematyka";
        question_id = 7;
        newQuestion = "Jaki będzie wynik działania 5 - 1 ?";

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
    }
}
