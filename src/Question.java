public class Question {
    String prompt;
    String answer;

    public Question(String prompt){
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return prompt;
    }
}
