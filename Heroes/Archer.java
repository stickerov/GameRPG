package GameRPG.Heroes;

import GameRPG.Hero;
import GameRPG.Weapon;
import GameRPG.Weapons.Bow;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void SetWeapon(Weapon weapon) {
        super.SetWeapon(weapon, weapon instanceof Bow, this);
    }
}