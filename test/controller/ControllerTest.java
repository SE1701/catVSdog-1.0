package controller;

import character.Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weapon.Wind;


import static org.junit.Assert.*;

public class ControllerTest {
    private Controller controller;

    @Before
    public void setUp() throws Exception {
        controller = new Controller();
    }

    @After
    public void tearDown() throws Exception {
        controller = null;
    }

    @Test
    public void initiateWeapon_ByOrdinary() {
//        fail();
        Player player1 = new Player();
        int mode = 1;
        controller.initiateWeapon(player1,mode);
        int expected = 1;
        int actual = controller.getWeapon().getFlag();
        assertEquals(expected, actual,0.01);

    }

    @Test
    public void initiateWeapon_ByPowerUp() {
//        fail();
        Player player2 = new Player();
        int mode = 0;
        controller.initiateWeapon(player2,mode);
        int expected = 0;
        int actual = controller.getWeapon().getFlag();
        assertEquals(expected, actual,0.01);

    }


    //等价类测试
    @Test
    public void hit_withInDistAndFollowingWind() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(15);
        assertEquals(true,controller.hit(player,10,wind));

    }

    @Test
    public void hit_withInDistAndAgainstTheWind() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(-14);
        assertEquals(true,controller.hit(player,30,wind));

    }

    @Test
    public void hit_withoutDist() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(30);
        assertEquals(true,controller.hit(player,40,wind));

    }


    //边界值测试
    @Test
    public void hit_littlePower() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(10);
        assertEquals(false,controller.hit(player,5,wind));

    }

    @Test
    public void hit_littlePower1() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(10);
        assertEquals(false,controller.hit(player,5,wind));

    }

    @Test
    public void hit_littlePower2() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(10);
        assertEquals(false,controller.hit(player,6,wind));

    }

    @Test
    public void hit_maxPower1() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(10);
        assertEquals(false,controller.hit(player,49,wind));

    }

    @Test
    public void hit_maxPower2() {
//        fail();
        Player player = new Player();
        Wind wind = new Wind();
        wind.setWindSpeed(10);
        assertEquals(false,controller.hit(player,50,wind));

    }



    //等价类测试
    @Test
    public void gameOver_normalBlood() {
//        fail();
        Player player = new Player();
        player.setBloodVolume(40);
        boolean actual = controller.gameOver(player);
        assertTrue(actual == false);
    }

    @Test
    public void gameOver_invalidBlood() {
//        fail();
        Player player = new Player();
        player.setBloodVolume(-10);
        boolean actual = controller.gameOver(player);
        assertTrue(actual == true);
    }



    //边界值测试
    @Test
    public void gameOver_zeroBlood() {
//        fail();
        Player player = new Player();
        player.setBloodVolume(0);
        boolean actual = controller.gameOver(player);
        assertTrue(actual == true);
    }

    @Test
    public void gameOver_oneBlood() {
//        fail();
        Player player = new Player();
        player.setBloodVolume(1);
        boolean actual = controller.gameOver(player);
        assertTrue(actual == false);
    }




    @Test
    public void randomDistance() {
//        fail();

    }

    @Test
    public void opponent_testCat() {
//        fail();
        Player cat = controller.getCat();
        Player dog = controller.getDog();
        controller.setAttacker(cat);
        Player actual = controller.opponent();
        assertEquals(dog,actual);

    }

    @Test
    public void opponent_testDog() {
//        fail();
        Player cat = controller.getCat();
        Player dog = controller.getDog();
        controller.setAttacker(dog);
        Player actual = controller.opponent();
        assertEquals(cat,actual);

    }


    @Test
    public void getAttackerName_testCat() {
//        fail();
        Player cat = controller.getCat();
        controller.setAttacker(cat);
        String expected = "CAT";
        String actual = controller.getAttackerName();
        assertEquals(expected,actual);
    }

    @Test
    public void getAttackerName_testDog() {
//        fail();
        Player dog = controller.getDog();
        controller.setAttacker(dog);
        String expected = "DOG";
        String actual = controller.getAttackerName();
        assertEquals(expected,actual);
    }

    @Test
    public void getOpponentName_testCat() {
//        fail();
        Player cat = controller.getCat();
        controller.setAttacker(cat);
        String expected = "DOG";
        String actual = controller.getOpponentName();
        assertEquals(expected,actual);
    }

    @Test
    public void getOpponentName_testDog() {
//        fail();
        Player dog = controller.getDog();
        controller.setAttacker(dog);
        String expected = "CAT";
        String actual = controller.getOpponentName();
        assertEquals(expected,actual);
    }

    @Test
    public void changeAttacker_DogToCat() {
//        fail();
        Player dog = controller.getDog();
        controller.setAttacker(dog);
        controller.changeAttacker();
        Player expected = controller.getCat();
        Player actual = controller.getAttacker();
        assertEquals(expected,actual);
    }

    @Test
    public void changeAttacker_CatToDog() {
//        fail();
        Player cat = controller.getCat();
        controller.setAttacker(cat);
        controller.changeAttacker();
        Player expected = controller.getDog();
        Player actual = controller.getAttacker();
        assertEquals(expected,actual);
    }

}