package interact;

import controller.Controller;

import java.util.Scanner;

/**
 * @author qanna
 */
public class NewGame {
    private Controller controller;
    private Game game;
     /*游戏模式，单人模式0  双人模式1*/
    private int mode;
    public static int flag;

    public void start(){
        /*！！！to testers:这里可以 ...可以琢磨琢磨*/
        int count =0;

        /*mode只能为0或1*/
        this.setMode(chooseMode());
        /* 通过用户的输入选择mode来获取游戏模式*/
        this.game = getGamebyMode();

        System.out.println("。。。。。。。。。。游戏开始。。。。。。。。。。");
        this.controller = this.game.getController();
        while(!this.controller.gameOver(this.controller.getAttacker())){
            System.out.println(this.controller.getAttacker().getName()+"的血量:"+this.controller.getAttacker().getBloodVolume());
            System.out.println(this.controller.getVictim().getName()+"的血量:"+this.controller.getVictim().getBloodVolume()+"\n");
            System.out.println("===================第" + (++count) + "轮攻击开始==================");
            System.out.println("【现在轮到"+this.controller.getAttacker().getName()+"攻击】");
            if(!this.game.round()){
                System.out.println("游戏出现故障，请稍后重启");
                break;
            }

            this.controller.changeAttacker();
        }
        System.out.println("【游戏结束】");
        System.out.println("胜："+this.controller.getVictim().getName() + "\t当前血量为" +  this.controller.getVictim().getBloodVolume());
        System.out.println("负："+this.controller.getAttacker().getName() + "\t当前血量为" + this.controller.getAttacker().getBloodVolume() );


    }

    private Game getGamebyMode() {
        /*！！！to testers:这里可以测试game是否是按mode给定的 用instanceof*/
        Game gm;
        if (this.mode == Game.ONE){
            System.out.println("现在是单人模式");
            gm = new OnePlayer();
        }
        else {
            System.out.println("现在是双人模式");
            gm = new TwoPlayer();
        }
        return gm;
    }

    /**
     * 选择游戏模式
     */
    public int chooseMode(){
        /*！！！to testers:这里可以测试控制台输入，返回值只能是1，2*/
        int md = -1;
        System.out.println("请选择模式   0：单人模式  1：双人模式");
        Scanner scanner = new Scanner(System.in);
        try {
            md = scanner.nextInt();
        }
        catch (Exception e){
            md = Game.INPUT_ERROR;
        }
        if (mode!=Game.ONE && mode!=Game.TWO){
            System.out.println("请输入0或1进行选择");
            md = chooseMode();
        }
        return md;
    }

    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    // To be considered twice...
//    public static int verChooseMode(int choose){
//        NewGame player=new NewGame();
//        try{
//            player.chooseMode2(choose);
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        return flag;
//    }

    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    // To be considered twice...
//    public void chooseMode2(int mode){
//        while (mode!=Game.ONE && mode!=Game.TWO){
//            System.out.println("请输入0或1进行选择");
//            mode = getModeInput();
//            flag=0;
//        }
//        if (mode == Game.ONE){
//            System.out.println("现在是单人模式");
//            this.game = new OnePlayer();
//            flag=1;
//        }
//        else {
//            System.out.println("现在是双人模式");
//            this.game = new TwoPlayer();
//            flag=2;
//        }
//    }


    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }


}
