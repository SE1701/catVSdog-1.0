package interact;

import controller.Controller;

import java.util.Scanner;

/**
 * @author qanna
 */
public class NewGame {
    private Controller controller;
    private Game game;
    public static int flag;

    public void start(){
        this.chooseMode();
        this.controller = this.game.getController();
        while(!this.controller.gameOver(this.controller.getAttacker())){
            System.out.println(this.controller.getAttackerName()+"的血量:"+this.controller.getAttacker().getBloodVolume());
            System.out.println(this.controller.getOpponentName()+"的血量:"+this.controller.opponent().getBloodVolume());
            System.out.println("【现在轮到"+this.controller.getAttackerName()+"攻击】\n");
            this.game.round();
            this.controller.changeAttacker();

        }
        System.out.println("胜："+this.controller.getOpponentName());
        System.out.println("负："+this.controller.getAttackerName());
        System.out.println("游戏结束");
    }
    public static int verChooseMode(int choose){
        NewGame player=new NewGame();
        try{
            player.chooseMode2(choose);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return flag;
    }

    /**
     * 选择游戏模式
     */
    public void chooseMode(){

        int mode = getModeInput();
        while (mode!=Game.ONE && mode!=Game.TWO){
            System.out.println("请输入0或1进行选择");
            mode = getModeInput();
        }

        if (mode == Game.ONE){
            System.out.println("现在是单人模式");
            this.game = new OnePlayer();
        }
        else {
            System.out.println("现在是双人模式");
            this.game = new TwoPlayer();
        }
    }
    public void chooseMode2(int mode){
        while (mode!=Game.ONE && mode!=Game.TWO){
            System.out.println("请输入0或1进行选择");
            mode = getModeInput();
            flag=0;
        }
        if (mode == Game.ONE){
            System.out.println("现在是单人模式");
            this.game = new OnePlayer();
            flag=1;
        }
        else {
            System.out.println("现在是双人模式");
            this.game = new TwoPlayer();
            flag=2;
        }
    }

    public int getModeInput(){
        int mode = -1;
        System.out.println("请选择模式   0：单人模式  1：双人模式");
        Scanner scanner = new Scanner(System.in);
        try {
            mode = scanner.nextInt();
        }
        catch (Exception e){
            mode = Game.INPUT_ERROR;
        }
        return mode;
    }

}
