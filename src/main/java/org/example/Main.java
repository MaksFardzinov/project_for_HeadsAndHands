package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(0,10,100,new Range(1,6));
        Monster monster = new Monster(0,10,100,new Range(10,50));
        monster.attack(player);
        System.out.println(player.getHealth());
        player.regenerate();
        System.out.println(player.getHealth());
    }
}