package service;

public class AdvancedScoreCalculationService implements ScoreCalculationService {

    public AdvancedScoreCalculationService() {}

    @Override
    public int calculateScore(int score, boolean success, int difficulty) {

        System.out.println("Iniciando o AdvancedScoreCalculationService");
        int points;

        if (success) {
            points = difficulty * 10;
        } else {
            points = -7;
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
