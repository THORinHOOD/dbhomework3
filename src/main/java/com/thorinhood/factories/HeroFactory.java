package com.thorinhood.factories;

import com.github.javafaker.Faker;
import com.thorinhood.Utils;
import com.thorinhood.heroes.*;

import java.util.List;
import java.util.function.Function;

public class HeroFactory {

    private static final List<Function<String, Hero>> heroesCreators = List.of(
        Hobbit::new,
        Elf::new,
        King::new,
        Knight::new
    );

    private final Faker faker;

    public HeroFactory() {
        faker = new Faker();
    }

    public Hero createHero() {
        String name = faker.gameOfThrones().character();
        return heroesCreators.get(Utils.randomInRange(0, heroesCreators.size() - 1)).apply(name);
    }

}
