package model;

public class Odpowiedzi{
    private int id_question;
    private String answer;
    private Boolean is_correct;
    private String answer_variant;

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

    public String getAnswer_variant() {
        return answer_variant;
    }

    public void setAnswerVariant(String answer_variant) {
        this.answer_variant = answer_variant;
    }

    public Boolean getIsCorrect() {
        return is_correct;
    }

    public void setIsCorrect(Boolean is_correct) {
        this.is_correct = is_correct;
    }

    public Odpowiedzi() {}
    public Odpowiedzi(int id_question, String answer, String answer_variant, Boolean is_correct) {
        this.id_question = id_question;
        this.answer = answer;
        this.answer_variant = answer_variant;
        this.is_correct = is_correct;

    }
    @Override
    public String toString() {
        return "	" + answer_variant + " " +  answer;
    }
}