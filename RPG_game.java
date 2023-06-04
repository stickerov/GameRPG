package GameRPG;

import GameRPG.Heroes.*;
import GameRPG.Weapons.*;

import static GameRPG.io.TermPrint;

public class RPG_game {

    public static void main(String[] args) {

        Hero mage = new Mage("Gandalf", 90);
        Hero rogue = new Rogue("Frodo", 100);
        Hero archer = new Archer("Legolas", 95);
        Hero swordsman = new Swordsman("Aragorn", 110);

        Weapon bow = new Bow();
        Weapon sword = new Sword();
        Weapon dagger = new Dagger();
        Weapon staff = new Staff();

        TermPrint();

        archer.SetWeapon(sword);
        archer.SetWeapon(bow);

        TermPrint();

        mage.SetWeapon(staff);
        rogue.SetWeapon(dagger);
        swordsman.SetWeapon(sword);

        TermPrint();

        archer.Attack(swordsman);
        swordsman.Attack(archer);
        archer.Attack(swordsman);
        swordsman.Attack(archer);
        archer.Attack(swordsman);
        swordsman.Attack(archer);

        // TermPrint(swordsman.GetStat());
    }

}
