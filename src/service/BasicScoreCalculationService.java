package service;

public class BasicScoreCalculationService implements ScoreCalculationService {

    public BasicScoreCalculationService() {}

    @Override
    public int calculateScore(int score, boolean success, int difficulty) {

        System.out.println("Iniciando o BasicScoreCalculationService");
        int points;

        if (success) {
            points = difficulty * 5;
        } else {
            points = -5;
        }
        int newScore = score + points;

        if (newScore < 0) {
            newScore = 0;
        }

        System.out.printf("Score atual: %d%n", score);
        System.out.printf("Pontos da missão: %d%n", points);
        System.out.printf("Novo score: %d%n", newScore);

        return newScore;
    }
}
