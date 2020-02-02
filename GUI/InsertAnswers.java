package GUI;
import java.util.List;
import java.sql.*;

import model.Pytanie;
import model.Odpowiedzi;
import PobierzZBazy.Test;

public class InsertAnswers {
    public static void main(String[] args){
        int id_question;
        String answer1;
        String answer2;
        String answer3;
        String answer4;
        String is_correct1;
        String is_correct2;
        String is_correct3;
        String is_correct4;

        id_question = 7;
        answer1 = "Bałtyckim";
        is_correct1 = "TRUE";
        answer2 = "Czarnym";
        is_correct2 = "FALSE";
        answer3 = "Azowskim";
        is_correct3 = "FALSE";
        answer4 = "Północnym";
        is_correct4 = "FALSE";


        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javaapp?user=root&password=Widzew123@");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO Exam_Answers( id_question, answer, is_correct)\n" +
                    "    values(" + id_question + ",\"" + answer1 + "\", " + is_correct1 + ");");
            st.executeUpdate("INSERT INTO Exam_Answers( id_question, answer, is_correct)\n" +
                    "    values(" + id_question + ",\"" + answer2 + "\", " + is_correct2 + ");");
            st.executeUpdate("INSERT INTO Exam_Answers( id_question, answer, is_correct)\n" +
                    "    values(" + id_question + ",\"" + answer3 + "\", " + is_correct3 + ");");
            st.executeUpdate("INSERT INTO Exam_Answers( id_question, answer, is_correct)\n" +
                    "    values(" + id_question + ",\"" + answer4 + "\", " + is_correct4 + ");");


            conn.close();
        }catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
