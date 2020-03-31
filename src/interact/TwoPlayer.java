package interact;


import weapon.Wind;

/**
 * @author qanna
 */
public class TwoPlayer extends Game {
    private static  int flag;
    public TwoPlayer(){
        super();
    }
    public static int verround(){
        TwoPlayer player=new TwoPlayer();
        try{
            player.round();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return flag;
    }
    @Override
    public void round(){

        // 随机风速
        Wind wind = new Wind();
        wind.setWindSpeed(this.controller.randomDistance(wind));
        System.out.println("当前风速大小及方向:"+wind.getWindSpeed());

        this.getWeaponMode2(this.controller.getAttacker(),1);
        this.selectPower2(controller.opponent(),wind,20);
    }
    public static void main(String[] args){
    }


}
