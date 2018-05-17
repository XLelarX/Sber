package com.company;

public enum Candidate {
    FIRST("Trump"),
    SECOND("Putin"),
    THIRD("In");

    private final String surname;

    Candidate(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}
