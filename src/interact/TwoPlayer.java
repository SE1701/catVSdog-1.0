package interact;


import weapon.Wind;

/**
 * @author qanna
 */
public class TwoPlayer extends Game {
    public TwoPlayer(){
        super();
    }

    @Override
    public void round(){

        // 随机风速
        Wind wind = new Wind();
        wind.setWindSpeed(this.controller.randomDistance(wind));
        System.out.println("当前风速大小及方向:"+wind.getWindSpeed());

        this.getWeaponMode(this.controller.getAttacker());
        this.selectPower(controller.opponent(),wind);
    }

}
