package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final Scanner input = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> votersByCandidates = new HashMap<>();
    private final VotingUiHandler votingUiHandler = new VotingUiHandler(votersByCandidates);
    private final StatisticsUiHandler statisticsUiHandler = new StatisticsUiHandler(votersByCandidates);

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {
        while (true) {
            System.out.println("Введите номер операции : ");
            switch (input.nextByte()) {
                case 1:
                    votingUiHandler.start();
                    break;
                case 2:
                    statisticsUiHandler.start();
                    break;
                case 3:
                    return;
            }

        }
    }
}
