package com.company;

public enum Rank {
    ENGINEER("Инженер"),
    SENIOR_ENGINEER("Старший инженер"),
    LEADING_ENGINEER("Ведущий инженер"),
    PROGRAMMER("Программист"),
    SENIOR_PROGRAMMER("Старший программист"),
    LEADING_PROGRAMMER("Ведущий программист"),
    TESTER("Тестировщик");
    private String name;

    Rank(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static boolean isRankExits(String rankName){
        for (Rank element : values()){
            if (rankName.equals(element.getName())){
                return true;
            }
        }
        return false;
    }

    public static Rank retRank(String rankName){
        for (Rank element : values()){
        if (rankName.equals(element.getName())){
            return element;
        }
    }
    return null;
}
}
