package character;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player();
    }

    @After
    public void tearDown() throws Exception {
        player = null;
    }


    @Test
    public void getHurt() {
//        fail();
        int initBloodVolume = player.getBloodVolume();
        int damage = 5;
        player.getHurt(damage);
        int expected = initBloodVolume - damage;
        int actual = player.getBloodVolume();
        assertEquals(expected, actual, 0.01);
        player.setBloodVolume(initBloodVolume);
    }

}

