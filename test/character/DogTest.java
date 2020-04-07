package character;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog();
    }

    public void tearDown(){
        dog = null;
    }

    @Test
    public void getWeaponChoiceTest() {
        String input = "0";
        int mode;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            mode = dog.getWeaponChoice();
        } finally {
            System.setIn(stdin);
        }
        assertEquals(mode,0);
    }

    @Test
    public void getVerifiedWeaponChoiseTest(){
        // data = “1” 是为了使递归终止
        String data = "1";
        int input = -1;
        int output;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            output = dog.getVerifiedWeaponChoise(input);
        } finally {
            System.setIn(stdin);
        }
        assertTrue(output==0 || output==1);
    }

    @Test
    public void getUserInputTest(){
        // 如果输入不是整数，则会返回-1
        // 如何输入是整数，则令inputToInt为input的int形式即可
        String input = "s";
        int inputToInt = -1;
        int output;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            output = dog.getUserInput();
        } finally {
            System.setIn(stdin);
        }
        assertEquals(output,inputToInt);
    }

    @Test
    public void getPowerByPlayer() {
    }
}