package GameRPG;

import static GameRPG.io.TermPrint;

public abstract class Hero {
    static int number;

    {
        Hero.number = 0;
    }

    private String name;
    private int health;
    public Weapon weapon;
    public Armor armor;

    public Hero(String name, int health) {
        ++Hero.number;
        this.name = name;
        this.health = health;
        TermPrint(GetStat());
    }

    public void SetArmor(Armor armor) {
        this.armor = armor;
    }

    public void Attack(Hero opponent) {
        int damage = this.weapon.Damage();
        opponent.TakeDamage(damage, opponent);
        TermPrint(String.format("%s получил %d урона от %s, осталось %d HP.", opponent.name, damage, this.name,
                opponent.health));
    }

    private void TakeDamage(int damage, Hero hero) {
        hero.health -= damage;

        if (hero.health <= 0) {
            hero.health = 0;

            TermPrint();
            TermPrint("\u001B[31m YOU DIED \u001B[0m");
            TermPrint();

        }
    }

    public String GetStat() {
        return String.format("Имя: %s \t Здоровье: %d HP", this.name, this.health);
    }

    public String GetHP() {
        return String.format("Здоровье: %d", this.health);
    }

    public void SetWeapon(Weapon weapon, Boolean ability, Hero hero) {
        if (ability) {
            hero.weapon = weapon;
            TermPrint(String.format("%s поднял %s c %d ед.урона.", hero.name, weapon.Name(), weapon.Damage()));
        } else {
            TermPrint(String.format("%s пытался, но не смог поднять %s.", hero.name, weapon.Name()));
        }
    }

    public abstract void SetWeapon(Weapon weapon);

}