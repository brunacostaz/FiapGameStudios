package application;

import domain.Mission;
import domain.Player;
import service.BasicMissionValidatorService;

public class GameEngine {

    private BasicMissionValidatorService validator;

    public GameEngine() {
        this.validator = new BasicMissionValidatorService();
    }

    public boolean executeMission(Player player, Mission mission) {

        boolean success = validator.validate(mission);

        if (success) {
            player.addScore(mission.getDifficulty() * 10);
        } else {
            player.addScore(-5);
        }

        return success;
    }
}
