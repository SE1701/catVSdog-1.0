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



    public Player(){
        this.bloodVolume = this.getAllVolume();
    }

    public Player( String name){
        this.bloodVolume = this.getAllVolume();
        this.name = name;
    }

    /**
     * 此函数执行的先决条件是weaponMode有效，所以getWeaponChoice()返回的一定是个有效值
     */
    public Weapon getWeaponByPlayer(){
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

    public int getHalfBlood(){
        return allVolume/2;
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


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
