package character;

import controller.Controller;

/**
 * @author qanna
 */
public class  Cat extends Player {

    public Cat(String name){
        super();
        this.setName(name);
    }


    /**
     *随机获得攻击工具的选择
     */
    @Override
    public int getWeaponChoice(){
        return Controller.randomDistance(0,2);
    }

    /**
     *随机获得攻击力度的选择
     */
    @Override
    public int getPowerByPlayer(){
        return Controller.randomDistance(0,50);
    }
}
