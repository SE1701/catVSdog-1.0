package weapon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon testgame=new Weapon();
    //同时测试get和set
    @Test
    public void getDamage() {
        testgame.setDamage(400);
        int expected=400;
        int actual=testgame.getDamage();
        assertEquals(expected,actual);
    }

    @Test
    public void getRange() {
        testgame.setRange(100);
        int expected=100;
        int actual=testgame.getRange();
        assertEquals(expected,actual);
    }

    @Test
    public void getPosition() {
        testgame.setPosition(100);
        int expected=100;
        int actual=testgame.getPosition();
        assertEquals(expected,actual);

    }

    @Test
    public void getDistance() {
        testgame.setDistance(100);
        int expected=100;
        int actual=testgame.getDistance();
        assertEquals(expected,actual);

    }
}