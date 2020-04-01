package character;

import weapon.Weapon;

import java.util.Scanner;

/**
 * @author qanna
 */
public class Dog extends Player {
    public Dog(String name){
        super(name);
        this.setFlag("DOG");
    }

    /*从控制台输入获得攻击工具的选择*/
    @Override
    public int getWeaponChoice(){
        /*！！！to testers:这里可以测试控制台输入，返回值只能是0，1*/
        int choise = -1;
        System.out.println("请选择工具   0：普通攻击工具  1：补血工具");
        Scanner scanner = new Scanner(System.in);
        try {
            choise = scanner.nextInt();
        }
        catch (Exception e){
            choise = Weapon.INPUT_ERROR;
        }
        if (choise!=Weapon.ORDINARY && choise!=Weapon.POWER_UP){
            System.out.println("请输入0或1进行选择");
            choise = getWeaponChoice();
        }
        return choise;
    }

    /*从控制台输入获得攻击力度的选择*/
    @Override
    public int getPowerByPlayer(){
        /*！！！to testers:这里可以测试控制台输入，返回值有个范围，用assertTrue*/
        int power = -1;
        System.out.println("请选择发射攻击的力度  [0，50)内的整数");
        Scanner scanner = new Scanner(System.in);
        try {
            power = scanner.nextInt();
        }
        catch (Exception e){
            power = Weapon.INPUT_ERROR;
        }
        if (power < 0 || power >= 50){
            System.out.println("请正确输入");
            power = getPowerByPlayer();
        }
        return power;
    }


}
