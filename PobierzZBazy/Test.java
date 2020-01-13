package PobierzZBazy;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


import model.Pytanie;

import model.Odpowiedzi;
class numer_pytania{
    int nr_pyt;
    numer_pytania(){
        nr_pyt = 2;
    }
}


public class Test{
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/javaapp?user=root&password=**********";

    private Connection conn;
    private Statement stat;

    public Test() {
        try {
            Class.forName(Test.DRIVER);
        }catch(ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        }catch(SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }

        createTables();

    }

    public boolean createTables() {
        String createPytanie = "CREATE TABLE if not exists Exam_Questions(question_id INT AUTO_Increment PRIMARY KEY, question varchar(255), subject varchar(255))";
        String createOdpowiedzi = "CREATE TABLE IF NOT EXISTS Exam_Answers(id_question INT, answer VARCHAR(255) NOT NULL, is_correct Boolean)";
        String createPobierzPytanieIOdpowiedzi = "CREATE TABLE IF NOT EXISTS Exam_Questions_And_Answers(id_Question_And_Answer INT, id_pytania int, id_odpowiedzi int)";
        try {
            stat.execute(createPytanie);
            stat.execute(createOdpowiedzi);
            stat.execute(createPobierzPytanieIOdpowiedzi);

        }catch(SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertPytanie(int question_id, String question, String subject) {
        try {
            String USEJAVAAPP = "USE javaapp;";
            stat.execute(USEJAVAAPP);
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO Exam_Questions values(?, ?, ?)");
            prepStmt.setInt(1, question_id);
            prepStmt.setString(2, question);
            prepStmt.setString(3, subject);

        }catch (SQLException e) {
            System.err.println("Blad przy wstawianiu pytania");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertOdpowiedzi(int id_question, String answer, Boolean is_correct) {
        try {
            String USEJAVAAPP = "USE javaapp;";
            stat.execute(USEJAVAAPP);
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO Exam_Answers values(NULL, ?, ?, ?);");
            prepStmt.setInt(1, id_question);
            prepStmt.setString(2, answer);
            prepStmt.setBoolean(3, is_correct);

        }catch (SQLException e) {
            System.err.println("Blad przy wstawianiu odpowiedzi");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertPobierzPytanieIOdpowiedzi(int id_Pytanie, int id_Odpowiedzi) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO Exam_Answers value(NULL, ?, ?;");
            prepStmt.setInt(1, id_Pytanie);
            prepStmt.setInt(2, id_Odpowiedzi);
        }catch (SQLException e) {
            System.err.println("Blad przy wstawianiu pyt i odp");
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public List<Pytanie> selectPytania(){
        numer_pytania nr_pytania = new numer_pytania();
        List<Pytanie> pytania = new LinkedList<Pytanie>();
        try {
            //ResultSet result = stat.executeQuery("Select * FROM Exam_Questions WHERE question_id = '" + nr_pytania.nr_pyt + "'");
            ResultSet result = stat.executeQuery("SELECT * FROM Exam_Questions");

            int id;
            String question, subject;
            while(result.next()) {
                id = result.getInt("question_id");
                question = result.getString("question");
                subject = result.getString("subject");
                pytania.add(new Pytanie(id, question, subject));
            }
        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
        return pytania;

    }




    public List<Odpowiedzi> selectOdpowiedzi(){
        numer_pytania nr_pytania = new numer_pytania();
        List<Odpowiedzi> odpowiedzi = new LinkedList<Odpowiedzi>();
        try {
            //ResultSet result = stat.executeQuery("Select * FROM Exam_Answers WHERE id_question = '" + nr_pytania.nr_pyt + "'");
            ResultSet result = stat.executeQuery("SELECT * FROM Exam_Answers");
            int id;
            String answer;
            Boolean is_correct;
            while(result.next()) {
                id = result.getInt("id_question");
                answer = result.getString("answer");
                is_correct = result.getBoolean("is_correct");
                odpowiedzi.add(new Odpowiedzi(id, answer, is_correct));
            }
        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
        return odpowiedzi;
    }

    public void closeConnection() {
        try {
            conn.close();
        }catch (SQLException e) {
            System.err.println("Problem z zamknięciem połączenia");
            e.printStackTrace();
        }
    }

}


