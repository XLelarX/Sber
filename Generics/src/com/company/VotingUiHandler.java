package com.company;

import java.util.List;
import java.util.Map;

public class VotingUiHandler {
    private final Map<Candidate, List<Voter>> votersByCandidates;

    VotingUiHandler(Map<Candidate, List<Voter>> votersByCandidates) {
        this.votersByCandidates = votersByCandidates;
    }

    public void start() {
        // ToDo:
    }
}
