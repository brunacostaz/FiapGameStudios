package service;

public class BasicCalculateScoreService implements CalculateScoreService {

    @Override
    public int calculateScore(int score, boolean success, int difficulty) {

        int points = 0;
        int newScore = 0;
        System.out.printf("Score atual: %d\n", score);

        if (success && difficulty <= 5) {
            points = score * 2;
        } else if (success && difficulty > 5){
            points = score * 7;
        } else {
            points = -5;
        }

        if (points < 0 && score + points >= 0) {
            newScore = score + points;
        } else if (points > 0) {
            newScore = score + points;
        }

        System.out.printf("Novo score: %d\n", newScore);
        return newScore;
    }
}
