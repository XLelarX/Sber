package com.company;

import java.util.List;
import java.util.Map;

public class StatisticsUiHandler {
    private final Map<Candidate, List<Voter>> votersByCandidates;

    StatisticsUiHandler(Map<Candidate, List<Voter>> votersByCandidates) {
        this.votersByCandidates = votersByCandidates;
    }

    public void start() {
        // ToDo:
    }
}
