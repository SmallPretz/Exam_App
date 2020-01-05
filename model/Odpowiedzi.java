package model;

public class Odpowiedzi{
    private int id_question;
    private String answer;
    private Boolean is_correct;

    public int getIdQuestion() {
        return id_question;
    }

    public void setIdQuestion(int id_question) {
        this.id_question = id_question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getIsCorrect() {
        return is_correct;
    }

    public void setIsCorrect(Boolean is_correct) {
        this.is_correct = is_correct;
    }

    public Odpowiedzi() {}
    public Odpowiedzi(int id_question, String answer, Boolean is_correct) {
        this.id_question = id_question;
        this.answer = answer;
        this.is_correct = is_correct;

    }
    @Override
    public String toString() {
        return "	" + answer;
    }
}