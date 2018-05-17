package com.company;

public enum Gender {
    MALE,
    FEMALE
}
//
//class GenderFake {
//    private static final GenderFake[] VALUES;
//    public static final GenderFake MALE;
//    public static final GenderFake FEMALE;
//
//    static {
//        VALUES = new GenderFake[2];
//        VALUES[0] = MALE = new GenderFake(0, "MALE");
//        VALUES[1] = FEMALE = new GenderFake(1, "FEMALE");
//    }
//
//    private final int ordinal;
//    private final String name;
//
//    private GenderFake(int ordinal, String name) {
//        this.ordinal = ordinal;
//        this.name = name;
//    }
//
//    public int ordinal() {
//        return ordinal;
//    }
//
//    public String name() {
//        return name;
//    }
//
//    public static GenderFake valueOf(String value) {
//        for (GenderFake genderFake : values()) {
//            if (genderFake.name.equals(value)) {
//                return genderFake;
//            }
//        }
//        throw new IllegalArgumentException();
//    }
//
//    public static GenderFake[] values() {
//        return VALUES.clone();
//    }
//}
