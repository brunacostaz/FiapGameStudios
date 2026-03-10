package service;

import domain.Mission;

public class AdvancedMissionValidatorService implements MissionValidatorService{

    public AdvancedMissionValidatorService() {}

    @Override
    public boolean validate(Mission mission) {
        System.out.println("\nIniciando o AdvancedMissionValidatorService");
        return mission.getDifficulty() % 2 == 0;
    }
}
