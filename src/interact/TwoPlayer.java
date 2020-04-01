package interact;

import character.Dog;

/**
 * @author qanna
 */
public class TwoPlayer extends Game {
    private static  int flag;
    public TwoPlayer(){
        super();
        this.controller.setAttacker(new Dog("小狗"));
        this.controller.setVictim(new Dog("小猫"));
    }

    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    // To be considered twice...
//    public static int verround(){
////        TwoPlayer player=new TwoPlayer();
////        try{
////            player.round();
////        }catch (Exception e){
////            System.out.println(e.toString());
////        }
////        return flag;
////    }

    // ！！！！！！！！！！
    // round 函数被移到Game类里了
    //！！！！！！！！！！！

}
