package GameRPG;

import java.util.Random;

public abstract class Weapon {
    static int number;
    private static Random r;

    {
        number = 0;
        r = new Random();
    }
    private int damage;
    private String name;

    public Weapon() {
        ++Weapon.number;
        this.damage = 10 + r.nextInt(10);
    }

    public Integer Damage() {
        return this.damage;
        // return this.damage + r.nextInt(5);
    }

    public String Name() {
        return this.name;
    }

}