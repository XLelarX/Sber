package com.company;

public class Man extends VoterBase {
    public Man(int age) {
        super(age);
    }

    @Override
    public Gender getGender() {
        return Gender.MALE;
    }
}
