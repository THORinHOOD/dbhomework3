package com.thorinhood.heroes;

import com.thorinhood.Utils;
import com.thorinhood.data.ActionInfo;

public abstract class RandomHero extends Hero {

    public RandomHero(String name, int minHp, int maxHp, int minPower, int maxPower) {
        super(name, Utils.randomInRange(minHp, maxHp), Utils.randomInRange(minPower, maxPower));
    }

    @Override
    public ActionInfo kick(Hero hero) {
        int damage = Utils.randomInRange(0, getPower());
        hero.setHp(hero.getHp() - damage);
        return ActionInfo.builder()
                .action("decreased hp by %d to a")
                .doneBy(this)
                .value(damage)
                .doneTo(hero)
                .build();
    }

}
