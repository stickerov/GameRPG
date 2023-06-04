package GameRPG.Heroes;

import GameRPG.Hero;
import GameRPG.Weapon;
import GameRPG.Weapons.Dagger;

public class Rogue extends Hero {
    public Rogue(String name, int health) {
        super(name, health);
    }

    @Override
    public void SetWeapon(Weapon weapon) {
        super.SetWeapon(weapon, weapon instanceof Dagger, this);
    }
}