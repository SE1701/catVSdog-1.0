package weapon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//同时测试set和get
public class WindTest {
    Wind testgame=new Wind();
    @Test
    public void getWindSpeed() {
        testgame.setWindSpeed(400);
        int expected=400;
        int actual=testgame.getWindSpeed();
        assertEquals(expected,actual);
    }

    @Test
    public void getWindRange() {
        testgame.setWindRange(400);
        int expected=400;
        int actual=testgame.getWindRange();
        assertEquals(expected,actual);
    }
}