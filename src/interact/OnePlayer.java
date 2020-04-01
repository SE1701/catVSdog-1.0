package interact;

import character.Cat;
import character.Dog;

/**
 * @author qanna
 */
public class OnePlayer extends Game {
    public static int  flag;
    public OnePlayer(){
        super();
        this.controller.setAttacker(new Dog("小狗"));
        this.controller.setVictim(new Cat("小猫"));

    }

    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    // To be considered twice...
//    public static int verround(){
//        OnePlayer player=new OnePlayer();
//        try{
//            player.round();
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        return flag;
//    }

    // ！！！！！！！！！！
    // round 函数被移到Game类里了
    //！！！！！！！！！！！
}
