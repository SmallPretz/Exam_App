package GUI;
import java.sql.*;
// Zmiana treści pytania


import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;

public class UpdateAnswers {
    public static void main(String[] args){

        int question_id;
        String newQuestion;
        String subject;
        question_id = 4;
        newQuestion = "Jaki będzie wynik podniesienia liczby 2 do potęgi 3 ?";

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javaapp?user=root&password=Widzew123@");
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE Exam_Questions " +
                    "SET question = " + "'" + newQuestion + "'" +
                    "WHERE question_id = " + question_id +";");

            conn.close();
        }catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
