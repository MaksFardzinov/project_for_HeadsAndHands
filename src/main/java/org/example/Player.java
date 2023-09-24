package org.example;

public class Player extends Creature implements Regenerate{
    public Player(int protection, int attack, int health, Range damage) {
        super(protection, attack, health, damage);
    }
    private final int max_heath = getHealth();
    private int count =0;

    public int getCount() {
        return count;
    }

    @Override
    public void regenerate() {
        if(count < 4){
            int health = (int) (getHealth() +  max_heath*0.3);
            if(health > max_heath){
                health = max_heath;
            }
            setHealth(health);
            count++;
        }
    }
}