package character;

import weapon.Ordinary;
import weapon.PowerUp;
import weapon.Weapon;

/**
 * @author qanna
 */
public class Player {
    /**
     * allVolume：满血血量
     * bloodVolume：当前的血量
     *playerPosition：当前的位置
     * weaponMode：当前所持有的工具类型
     * name：玩家的称呼
     */
    private int allVolume = 100;
    private int bloodVolume;
    private int playerPosition = 25;
    private int weaponMode;
    private String name;

    public static String DOG = "DOG";
    public static String CAT = "CAT";
    private String flag;

    public Player(){
        this.bloodVolume = allVolume;
    }

    public Player( String name){
        this.bloodVolume = allVolume;
        this.name = name;
    }



    /*此函数执行的先决条件是weaponMode有效，所以getWeaponChoice()返回的一定是个有效值*/
    public Weapon getWeaponByPlayer(){
        /*！！！to testers:setWeaponMode()，然后判断weapon是否返回正确，用instanceof*/
        this.setWeaponMode(getWeaponChoice());
        Weapon wp = getWeaponByMode();
        return wp;

    }

    public int getWeaponChoice(){
        return 0;
    }

    public int getPowerByPlayer(){
        return 0;
    }

    public Weapon getWeaponByMode(){
        /*！！！to testers:这里可以测试Weapon是否是按mode给定的，用instanceof*/
        Weapon wp;
        switch (this.getWeaponMode()){
            case Weapon.ORDINARY:
                wp = new Ordinary();
                break;
            case Weapon.POWER_UP:
                wp = new PowerUp();
                break;
            default:
                wp = null;
        }
        return wp;
    }

    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public int getAllVolume() {
        return allVolume;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public int getWeaponMode() {
        return weaponMode;
    }

    public void setWeaponMode(int weaponMode) {
        this.weaponMode = weaponMode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

}
