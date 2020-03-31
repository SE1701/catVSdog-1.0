package interact;

import weapon.Wind;

/**
 * @author qanna
 */
public class OnePlayer extends Game {
    public static int  flag;
    public OnePlayer(){
        super();
        this.controller.getCat().setAutomatic(true);
    }
    public static int verround(){
        OnePlayer player=new OnePlayer();
        try{
            player.round();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return flag;
    }

    @Override
    public void round(){
        //随机风速
        Wind wind = new Wind();
        wind.setWindSpeed(this.controller.randomDistance(wind));
        System.out.println("===================一轮攻击开始==================");
        System.out.println("当前风速大小及方向:"+wind.getWindSpeed());
        if(!controller.getAttacker().isAutomatic()){
            flag= 0;
            this.getWeaponMode2(this.controller.getAttacker(),1);
            this.selectPower2(this.controller.opponent(),wind,20);
        }else{
            flag=1;
            this.generateWeapon(this.controller.getAttacker());
            this.generatePower(this.controller.opponent(),wind);

        }
    }

}
