package character;

import weapon.Weapon;

import java.util.Scanner;
/**
 * @author qanna
 */
public class Dog extends Player {

    public Dog(){
        super();
    }

    public Dog(String name){
        super(name);
        this.setFlag("DOG");
    }


    /*从控制台输入获得攻击工具的选择*/
    @Override
    public int getWeaponChoice(){
        System.out.println("请选择工具   0：普通攻击工具  1：补血工具");
        int choise = getUserInput();
        choise = getVerifiedWeaponChoise(choise);
        return choise;

    }

    /*
     *验证输入是否正确。如果不正确则重新要求输入
     * 这样处理是为了方便测试
     */
    public int getVerifiedWeaponChoise(int choise){
        int verifiedChoice = choise;
        while (verifiedChoice!=Weapon.ORDINARY && verifiedChoice!=Weapon.POWER_UP){
            System.out.println("请正确输入：");
            verifiedChoice = getUserInput();
        }
        return verifiedChoice;
    }

    /*从控制台输入获得攻击力度的选择*/
    @Override
    public int getPowerByPlayer(){
        System.out.println("请选择发射攻击的力度  [0，50)内的整数");
        int power = getUserInput();
        power = getVerifiedPower(power);
        return power;
    }

    /*
     *验证输入是否正确。如果不正确则重新要求输入
     * 这样处理是为了方便测试
     */
    public int getVerifiedPower(int power){
        int verifiedPower = power;
        while (verifiedPower < 0 || verifiedPower >= 50){
            System.out.println("请正确输入：");
            verifiedPower = getUserInput();
        }
        return verifiedPower;
    }

    public int getUserInput(){
        int num = -1;
        Scanner scanner = new Scanner(System.in);
        try {
            num = scanner.nextInt();
        }
        catch (Exception e){
            num = Weapon.INPUT_ERROR;
        }
        return num;
    }


//    /*从控制台输入获得攻击工具的选择*/
//    @Override
//    public int getWeaponChoice(){
//        /*！！！to testers:这里可以测试控制台输入，返回值只能是0，1*/
//        int choise = -1;
//        System.out.println("请选择工具   0：普通攻击工具  1：补血工具");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            choise = scanner.nextInt();
//        }
//        catch (Exception e){
//            choise = Weapon.INPUT_ERROR;
//        }
//        if (choise!=Weapon.ORDINARY && choise!=Weapon.POWER_UP){
//            System.out.println("请输入0或1进行选择");
//            choise = getWeaponChoice();
//        }
//        return choise;
//    }

//    /*从控制台输入获得攻击力度的选择*/
//    @Override
//    public int getPowerByPlayer(){
//        /*！！！to testers:这里可以测试控制台输入，返回值有个范围，用assertTrue*/
//        int power = -1;
//        System.out.println("请选择发射攻击的力度  [0，50)内的整数");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            power = scanner.nextInt();
//        }
//        catch (Exception e){
//            power = Weapon.INPUT_ERROR;
//        }
//        if (power < 0 || power >= 50){
//            System.out.println("请正确输入");
//            power = getPowerByPlayer();
//        }
//        return power;
//    }



}
