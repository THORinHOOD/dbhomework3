package com.thorinhood.managers;

import com.thorinhood.heroes.Hero;

public class GameManager {

    public void fight(Hero hero1, Hero hero2) {
        System.out.printf("Start fight between %s and %s%n", hero1, hero2);
        Hero whoHits = hero1;
        Hero whoGets = hero2;
        Hero tmp;
        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println(whoHits.kick(whoGets));
            tmp = whoHits;
            whoHits = whoGets;
            whoGets = tmp;
        }
        System.out.println((hero1.isAlive() ? hero1 : hero2) + " wins!!!");
    }

}
