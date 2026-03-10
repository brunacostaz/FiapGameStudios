package ui;

import application.GameEngine;
import domain.Mission;
import domain.Player;
import service.*;

public class GameUI {

    public static void main(String[] args) {

        Player salatiel = new Player("Salatiel", 10);
        Mission logicaDeProgramacao = new Mission("Lógica de programacao nível I", 1);
        Mission aplicacaoJavaPuro = new Mission("Aplicação com Java Puro", 3);
        Mission arquiteturaMicroservico = new Mission("Arquitetura de Microserviços", 6);
        Mission mensageriaKafka = new Mission("Mensageriacom Kafka", 10);
        Mission podsK8S = new Mission("Pods do Kubernetes", 9);

        MissionValidatorService basicMission = new BasicMissionValidatorService();
        MissionValidatorService advancedMission = new AdvancedMissionValidatorService();

        ScoreCalculationService basicCalculate = new BasicScoreCalculationService();
        ScoreCalculationService advancedCalculate = new AdvancedScoreCalculationService();

        GameEngine gameBasic = new GameEngine(basicMission, basicCalculate);
        gameBasic.executeMission(salatiel, aplicacaoJavaPuro);

        GameEngine gameWrong = new GameEngine(advancedMission, basicCalculate);
        gameWrong.executeMission(salatiel, aplicacaoJavaPuro);

        GameEngine gameAdvanced = new GameEngine(advancedMission, advancedCalculate);
        gameAdvanced.executeMission(salatiel, mensageriaKafka);

    }
}
