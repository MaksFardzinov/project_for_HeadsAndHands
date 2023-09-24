package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

public class CreatureTest extends TestCase {

    public void testIs_dead() {
        Player player = new Player(10,20,100,new Range(10,20));
        boolean answer;
        answer = player.getHealth() < 0;
        Assert.assertEquals(player.is_dead(),answer);
    }

    public void testRegenerate() {
        Player player = new Player(0,10,100,new Range(10,100));
        Monster monster = new Monster(10,20,50,new Range(10,20));
        monster.attack(player);
        int hp_after_attack = player.getHealth();
        player.regenerate();
        int hp_after_regeneration = player.getHealth();
        assertTrue(hp_after_regeneration > hp_after_attack);
    }
}