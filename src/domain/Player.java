package domain;

public class Player {

    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addScore(int points) {

        int newScore = 0;
        System.out.printf("Score atual: %d\n", newScore);
        if (points > 0) {
            newScore = points + getScore();
        } else if (points < 0 && getScore() - points >= 0){
            newScore = getScore() - points;
        } else {
            newScore = getScore();
        }

        System.out.printf("Novo score: %d\n", newScore);
        setScore(newScore);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
