package class11;

public class SoldierTester {
    public static void main(String[] args) {

        Soldier soldier = new Soldier();

        soldier.name = "Hermon";
        soldier.age = 19;
        soldier.race = "Asian";
        soldier.weight = 270;
        soldier.rank = "E5";
        soldier.military = false;

        soldier.shoot();
        soldier.crawl();
        soldier.march();
        soldier.salute();
    }
}
