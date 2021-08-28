package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(5) + 2;
        int criticalDamage = this.getDamage() * coeff;
        boss.setHealth(boss.getHealth() + this.getDamage() - criticalDamage);
        System.out.println("Warrior hits critically: "
                + this.getDamage() * coeff);
    }
}
