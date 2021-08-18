package com.thorinhood;

import com.thorinhood.factories.HeroFactory;
import com.thorinhood.heroes.Hero;
import com.thorinhood.managers.GameManager;


public class Main {

    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();

        Hero hero1 = heroFactory.createHero();
        Hero hero2 = heroFactory.createHero();
        gameManager.fight(hero1, hero2);

    }

}
