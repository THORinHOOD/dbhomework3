package com.thorinhood.heroes;

public class Knight extends RandomHero {

    private static final int START_MIN_HP = 2;
    private static final int START_MAX_HP = 12;
    private static final int START_MIN_POWER = 2;
    private static final int START_MAX_POWER = 12;

    public Knight(String name) {
        super(name, START_MIN_HP, START_MAX_HP, START_MIN_POWER, START_MAX_POWER);
    }

}
