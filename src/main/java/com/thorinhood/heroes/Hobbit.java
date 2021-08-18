package com.thorinhood.heroes;

import com.thorinhood.data.ActionInfo;

public class Hobbit extends Hero {

    private static final int START_HP = 3;
    private static final int START_POWER = 0;

    private final ActionInfo CRY_ACTION = ActionInfo.builder()
            .doneBy(this)
            .action("is crying...")
            .build();

    public Hobbit(String name) {
        super(name, START_HP, START_POWER);
    }

    @Override
    public ActionInfo kick(Hero hero) {
        return toCry();
    }

    protected ActionInfo toCry() {
        return CRY_ACTION;
    }

}
