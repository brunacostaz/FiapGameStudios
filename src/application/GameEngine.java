package application;

import domain.Mission;
import domain.Player;
import service.ScoreCalculationService;
import service.MissionValidatorService;

public class GameEngine {

    private MissionValidatorService validator;
    private ScoreCalculationService score;

    public GameEngine(MissionValidatorService validator, ScoreCalculationService score) {
        this.validator = validator;
        this.score = score;
    }

    public boolean executeMission(Player player, Mission mission) {

        System.out.printf("Iniciando a execução de executeMission\nPlayer=%s\nMission=%s", player.getName(), mission.getName());
        boolean success = validator.validate(mission);
        System.out.printf("Validando a dificuldade da missão:%s\n", success);
        int newScore = score.calculateScore(player.getScore(), success, mission.getDifficulty());
        player.setScore(newScore);
        return success;
    }
}
