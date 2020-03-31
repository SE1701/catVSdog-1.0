package interact;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NewGameTest {
    NewGame testgame=new NewGame();
    @Before
    public void setUp() throws Exception {
       // fail();
    }

    @After
    public void tearDown() throws Exception {
        //fail();
    }

    @Test
    public void start() {
        fail();
    }

    @Test
    public void chooseMode() {
       // fail();
       int expected=2;
       int choose=1;
       int actual=testgame.verChooseMode(choose);
       assertEquals(expected,actual);
    }


    @Test
    public void getModeInput() {
       // fail();
        String data = "1";
        int mode;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            mode=testgame.getModeInput();
        } finally {
            System.setIn(stdin);
        }
        System.out.println("input is----" + mode);
    }
}