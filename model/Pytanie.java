package model;

public class Pytanie {
    private int question_id;
    private String question;
    private String subject;

    public int getQuestionId() {
        return question_id;
    }

    public void setQuestionId(int question_id) {
        this.question_id = question_id;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Pytanie() {}
    public Pytanie(int question_id, String question, String subject) {
        this.question_id = question_id;
        this.question = question;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "\n"+"Pytanie numer: "+question_id+ "\n" + "Pytanie: "+question;
    }
}

