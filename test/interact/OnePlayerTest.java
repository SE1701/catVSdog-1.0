package interact;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnePlayerTest {
    OnePlayer player=new OnePlayer();
    @Test
    public void round() {
        int expected=0;
        System.out.println(expected);
        int actual=player.verround();
        System.out.println(actual);
        assertEquals(expected,actual);

    }
}