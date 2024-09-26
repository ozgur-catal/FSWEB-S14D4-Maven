package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Monster creature1 = new Troll("GreenTroll" ,2,10.5);

        System.out.println(creature1.attack());
    }
}
