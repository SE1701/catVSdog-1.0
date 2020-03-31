package interact;

import character.Player;
import controller.Controller;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weapon.Wind;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game testgame=new Game();
    public Controller controller;

    @Before
    public void setUp() throws Exception {
     //fail();
        Game testgame=new Game();
    }

    @After
    public void tearDown() throws Exception {
        //fail();
        testgame=null;
    }

    @Test
    public void getWeaponMode() {
        //fail();
        Player player=new Player();
      // String input="1";
        int mode=1;
       // InputStream stdin=System.in;
       // try{
          //  System.setIn(new ByteArrayInputStream(input.getBytes()));
           // mode=testgame.getWeaponModeInput();
       // }finally {
            //System.setIn(stdin);
        //}
       // System.out.println(mode);
        int expected=2;
        int actual = testgame.verGetWeaponMode(player,mode);
        System.out.println(actual);
        assertEquals( "U7777777777",expected,actual);

    }
    @Test
    public void getWeaponModeInput() {
        String data = "1";
        int mode;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            mode=testgame.getWeaponModeInput();
        } finally {
            System.setIn(stdin);
        }
        System.out.println("input is----" + mode);
        // fail();

    }
    @Test
    public void generateWeapon() {
       // fail();

    }

    @Test
    public void selectPower() {
        Player player=new Player();
        Wind wind=new Wind();
        int power=5;
        int expected=1;
        int actual = testgame.verselectPower(player,wind,power);
        System.out.println(actual);
        assertEquals( "力度出现错误",expected,actual);

       // fail();
    }
    @Test
    public void getPowerInput(){
        String data = "3";
        int power;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            power=testgame.getPowerInput();
        } finally {
            System.setIn(stdin);
        }
        System.out.println("input is----" + power);
        // fail();

    }
    @Test
    public void generatePower() {
        //fail();
        Player player=new Player();
        Wind wind=new Wind();
        int expected=0;
        int actual= testgame.verGeneratePower(player,wind);
        System.out.println(actual);
    }

    @Test
    public void getController() {
        testgame.setController(controller);
        Controller expected=controller;
        Controller actual=testgame.getController();
        assertEquals(expected,actual);

        //fail();
    }


}