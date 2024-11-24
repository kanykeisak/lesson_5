package kg.geeks.les5.homework;
//Создание класа
public class Hero {
    //Приватные поля
    private int health;
    private int damage;
    private String superAbility;

    //Конструктор
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    //Конструктор
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    //Get
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
