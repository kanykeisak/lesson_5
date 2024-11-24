package kg.geeks.les5.homework;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Magic");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth() +
                ", Damage: " + boss.getDamage() +
                ", Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Super Ability: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 50, "Physical");
        Hero hero2 = new Hero(400, 70);
        Hero hero3 = new Hero(250, 40, "Kinetic");

        return new Hero[]{hero1, hero2, hero3};
    }


}
