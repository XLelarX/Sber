package com.company;

public enum AgeCategory {
    YOUNG(18, 29),
    TEEN(30, 49),
    ADULT(50, 64),
    OLD(65, 100);

    private final int left;
    private final int right;

    AgeCategory(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategory valueOf(int age) {
        for (AgeCategory ageCategory : values()) {
            if ((age >= ageCategory.left) && (age <= ageCategory.right)) {
                return ageCategory;
            }
        }
        throw new IllegalArgumentException();
    }
}
