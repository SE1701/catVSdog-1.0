package character;

import controller.Controller;

/**
 * @author qanna
 */
public class  Cat extends Player {

    public Cat(){
        super();
    }

    public Cat(String name){
        super(name);
        this.setFlag("CAT");
    }


    /*随机获得攻击工具的选择*/
    @Override
    public int getWeaponChoice(){
        /*！！！to testers:返回值为[0，2)之间的整数*/
        return Controller.randomDistance(0,2);
    }

    /*随机获得攻击力度的选择*/
    @Override
    public int getPowerByPlayer(){
        /*！！！to testers:返回值为[0，50)之间的整数*/
        return Controller.randomDistance(0,50);
    }
}
