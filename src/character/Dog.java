package character;

import weapon.Weapon;

import java.util.Scanner;
/**
 * @author qanna
 */
public class Dog extends Player {

    public Dog(String name) {
        super(name);
        this.setName(name);
    }

    /**
     *从控制台输入获得攻击工具的选择
     */
    @Override
    public int getWeaponChoice() {
        System.out.println("请选择工具   0：普通攻击工具  1：补血工具");
        int choice = getUserInput();
        choice = getVerifiedWeaponChoice(choice);
        return choice;

    }

    /**
     * 验证输入是否正确。如果不正确则重新要求输入
     * 这样处理是为了方便测试
     */
    public int getVerifiedWeaponChoice(int choice) {
        int verifiedChoice = choice;
        while (verifiedChoice != Weapon.ORDINARY && verifiedChoice != Weapon.POWER_UP) {
            System.out.println("请正确输入：");
            verifiedChoice = getUserInput();
        }
        return verifiedChoice;
    }

    /**
     * 从控制台输入获得攻击力度的选择
     */
    @Override
    public int getPowerByPlayer() {
        System.out.println("请选择发射攻击的力度  [0，50)内的整数");
        int power = getUserInput();
        power = getVerifiedPower(power);
        return power;
    }

    /**
     *验证输入是否正确。如果不正确则重新要求输入
     * 这样处理是为了方便测试
     */
    public int getVerifiedPower(int power) {
        int verifiedPower = power;
        while (verifiedPower < 0 || verifiedPower >= this.getHalfBlood()) {
            System.out.println("请正确输入：");
            verifiedPower = getUserInput();
        }
        return verifiedPower;
    }

    public int getUserInput() {
        int num = -1;
        Scanner scanner = new Scanner(System.in);
        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            num = Weapon.INPUT_ERROR;
        }
        return num;
    }
}


