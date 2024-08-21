public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(550);
        boss.setDamage(60);
        boss.setDefenseType("Magic");


        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();
        System.out.println("Heroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Superpower: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 50, "Fireball");
        Hero hero2 = new Hero(250, 30);
        Hero hero3 = new Hero(350, 40, "Thunderstrike");
        return new Hero[]{hero1, hero2, hero3};
    }
}