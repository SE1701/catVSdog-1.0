package interact;

import weapon.Wind;

/**
 * @author qanna
 */
public class OnePlayer extends Game {
    public OnePlayer(){
        super();
        this.controller.getCat().setAutomatic(true);
    }

    @Override
    public void round(){
        //随机风速
        Wind wind = new Wind();
        wind.setWindSpeed(this.controller.randomDistance(wind));
        System.out.println("===================一轮攻击开始==================");
        System.out.println("当前风速大小及方向:"+wind.getWindSpeed());

        if(!controller.getAttacker().isAutomatic()){
            this.getWeaponMode(this.controller.getAttacker());
            this.selectPower(this.controller.opponent(),wind);
        }else{
            this.generateWeapon(this.controller.getAttacker());
            this.generatePower(this.controller.opponent(),wind);
        }
    }


}
