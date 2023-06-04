package GameRPG.Heroes;

import GameRPG.Hero;
import GameRPG.Weapon;
import GameRPG.Weapons.Sword;

public class Swordsman extends Hero {
    public Swordsman(String name, int health) {
        super(name, health);
    }

    @Override
    public void SetWeapon(Weapon weapon) {
        super.SetWeapon(weapon, weapon instanceof Sword, this);
    }
}