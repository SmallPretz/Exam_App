package GUI;
import java.sql.*;

import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;

public class InsertQuestions {
    public static void main(String[] args){
        int question_id;
        String question;
        String subject;
        question_id = 7;
        question = "Nad jakim morzem leży Polska?";
        subject = "Geografia";
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javaapp?user=root&password=Widzew123@");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO Exam_Questions(question_id, question, subject)" +
                    "    values("+ question_id + ", \"" + question + "\", \"" + subject + "\");");

            conn.close();
        }catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
