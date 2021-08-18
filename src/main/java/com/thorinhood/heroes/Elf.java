package com.thorinhood.heroes;

import com.thorinhood.data.ActionInfo;

public class Elf extends Hero {

    private static final int START_HP = 10;
    private static final int START_POWER = 10;

    public Elf(String name) {
        super(name, START_HP, START_POWER);
    }

    @Override
    public ActionInfo kick(Hero hero) {
        if (hero.getPower() < getPower()) {
            hero.setHp(0);
            return ActionInfo.builder()
                    .action("murder")
                    .doneBy(this)
                    .doneTo(hero)
                    .build();
        }
        hero.setPower(hero.getPower() - 1);
        return ActionInfo.builder()
                .value(1)
                .doneBy(this)
                .doneTo(hero)
                .action("decreases power by %d of a")
                .build();
    }
}
