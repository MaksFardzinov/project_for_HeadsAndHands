package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Creature implements Attack  {
    private int protection;
    private int attack;
    private int health;
    private Range damage;
    public Creature(int protection, int attack, int health, Range damage){
        if((protection<0 || protection >30) || (attack<0 || attack>30)){
            throw new IllegalArgumentException();
        }else {
            this.protection = protection;
            this.attack = attack;
            this.health = health;
            this.damage = damage;
        }
    }

    public int getProtection() {
        return protection;
    }

    public int getAttack() {
        return attack;
    }

    public void setProtection(int new_protection) {
        if (protection<0 || protection >30){
            throw  new IllegalArgumentException();
        }
        else{
            protection = new_protection;
        }

    }

    public void setAttack(int new_attack) {
        if(attack<0 || attack > 30){
            throw new IllegalArgumentException();
        }
        else {
            attack = new_attack;
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(Range damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public Range getDamage() {
        return damage;
    }

    public boolean is_dead(){
        return health <= 0;
    }

    @Override
    public void attack( Creature protecting) {
        int mod_attack = getAttack() - protecting.getProtection()+ 1;
        int count=0;
        Dice dice = new Dice();
        do {
            int value = dice.roll();
            if(value>=5){
                count++;
            }
            mod_attack --;
        }while (mod_attack>0);
        if(count>0){
            int damage = ThreadLocalRandom.current().nextInt(getDamage().getLow(),
                    getDamage().getHigh());
            protecting.setHealth(protecting.getHealth()-damage);
        }
    }
}
