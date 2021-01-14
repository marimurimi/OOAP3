package sample;

public class Main {
    public static void main(String[] args) {

        ArmyFactory armyFactory = new ArmyFactory("ork");
        armyFactory.myArmy();

        System.out.println("                           ");

        armyFactory = new ArmyFactory("elf");
        armyFactory.myArmy();
    }
}
