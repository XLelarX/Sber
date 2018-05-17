package com.company;

public class Woman extends VoterBase {
    public Woman(int age) {
        super(age);
    }

    @Override
    public Gender getGender() {
        return Gender.FEMALE;
    }
}
