package service;

import domain.Mission;

public class BasicMissionValidatorService implements MissionValidatorService {

    public BasicMissionValidatorService() {}


    @Override
    public boolean validate(Mission mission) {

        System.out.println("\nIniciando o BasicMissionValidatorService");
        return mission.getDifficulty() <= 5;
    }
}
