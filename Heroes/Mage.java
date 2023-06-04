package GameRPG.Heroes;

import GameRPG.Hero;
import GameRPG.Weapon;
import GameRPG.Weapons.Staff;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void SetWeapon(Weapon weapon) {
        super.SetWeapon(weapon, weapon instanceof Staff, this);
    }
}