package com.thorinhood.heroes;

public class King extends RandomHero {

    private static final int START_MIN_HP = 5;
    private static final int START_MAX_HP = 15;
    private static final int START_MIN_POWER = 5;
    private static final int START_MAX_POWER = 15;

    public King(String name) {
        super(name, START_MIN_HP, START_MAX_HP, START_MIN_POWER, START_MAX_POWER);
    }

}
