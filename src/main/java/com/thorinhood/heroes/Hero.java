package com.thorinhood.heroes;


import com.thorinhood.data.ActionInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Hero {

    private final String name;
    private int hp;
    private int power;

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getName() + " {" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    public abstract ActionInfo kick(Hero hero);

}
