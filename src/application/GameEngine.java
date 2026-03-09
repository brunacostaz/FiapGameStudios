package application;

import domain.Mission;
import domain.Player;
import service.CalculateScoreService;
import service.MissionValidatorService;

public class GameEngine {

    private MissionValidatorService validator;
    private CalculateScoreService score;

    public GameEngine(MissionValidatorService validator, CalculateScoreService score) {
        this.validator = validator;
        this.score = score;
    }

    public boolean executeMission(Player player, Mission mission) {

        boolean success = validator.validate(mission);
        int newScore = score.calculateScore(player.getScore(), success, mission.getDifficulty());
        player.setScore(newScore);
        return success;
    }
}
