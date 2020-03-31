package interact;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoPlayerTest {
    TwoPlayer player=new TwoPlayer();
    @Test
    public void round() {
        int expect=0;
        int actual=player.verround();
        assertEquals(expect,actual);
    }
}