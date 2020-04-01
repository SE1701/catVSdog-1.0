package controller;

import character.*;
import weapon.*;

import java.util.Random;

/**
 * @author qanna
 */
public class Controller {

    /*当前的攻击方*/
    private Player attacker;
    /*当前的被攻击方*/
    private Player victim;


    public Wind generateWind(){
        /*！！！to testers:此函数可判断风速是否在指定的范围内*/
        Wind wind = new Wind();
        wind.setWindSpeed(randomDistance(-wind.getWindRange(),wind.getWindRange()));
        return wind;
    }

    public String throwWeapon(Weapon wp, Wind wd, Player attacker, Player victim){
        /*！！！to testers:这里有两类武器：攻击/补血，可以测试判断血量是否增减，至于数值变化多少，放在其它函数测，或者测试返回的内容是否正确*/
        String attackResult = "";
        if(wp instanceof PowerUp){  //补血工具，attacker给自己补血
            addBlood(wp,attacker);
            attackResult += "攻击者血量回升";
        }
        else{   //攻击工具，victim受到weapon的攻击
            int power = attacker.getPowerByPlayer();
            wp.setPosition(power);
            attackResult += "发射武器的力度为";
            attackResult += power;
            if(getHurt(wp, wd, victim)){
                attackResult += "，武器击中对方";
            }
            else{
                attackResult += "，武器未击中对方";
            }
        }
        return attackResult;

    }

    public void addBlood(Weapon wp, Player attacker){
        /*！！！to testers:这里可以 new一个Player和一个补血Weapon，作用之后判断Player的血量变化是否正确*/
        int afterBlood = attacker.getBloodVolume()-wp.getDamage();
        attacker.setBloodVolume(afterBlood > attacker.getAllVolume()?attacker.getAllVolume(): afterBlood);
    }

    public boolean getHurt(Weapon wp, Wind wd, Player victim){
        /* ！！！to testers:这里可以测很多用例，判断是否击中、击中后的血量变化*/
        boolean isHit = true;
        wp.setPosition(wp.getPosition()+ wd.getWindSpeed());
        if(Math.abs(victim.getPlayerPosition() - wp.getPosition()) > wp.getRange()){ //超出武器攻击范围
            isHit = false;
        }
        else {  //被击中
            int afterBlood = victim.getBloodVolume() - wp.getDamage();
            victim.setBloodVolume(afterBlood < 0 ? 0: afterBlood);
        }
        return isHit;
    }


    public boolean gameOver(Player player){
        /* ！！！to testers:你懂的*/
        return player.getBloodVolume() <= 0;
    }

    /* 随机生成两个数之间的整数，包含最小值，但不包含最大值*/
    public static int randomDistance(int min, int max){
        /* ！！！to testers:你懂的*/
        return new Random().nextInt(max- min)+ min;
    }


    public void changeAttacker(){
        /* ！！！to testers:这里不要用instanceof，可以使用Player的name这一属性判断是否更换攻击方*/
        Player p = this.attacker;
        this.attacker = this.victim;
        this.victim = p;
    }



    public Player getAttacker() {
        return attacker;
    }

    public void setAttacker(Player attacker) {
        this.attacker = attacker;
    }

    public Player getVictim() {
        return victim;
    }

    public void setVictim(Player victim) {
        this.victim = victim;
    }
}
