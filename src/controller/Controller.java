package controller;

import character.Cat;
import character.*;
import weapon.*;

import java.util.Random;

/**
 * @author qanna
 */
public class Controller {
    private Cat cat;
    private Dog dog;
    private Player attacker;
    private Weapon weapon;
    private int wind;

    public Controller(){
        this.cat = new Cat();
        this.dog = new Dog();
        this.attacker = this.dog;
    }

    public void initiateWeapon(Player from, int mode){
        if(mode == Weapon.ORDINARY){
            this.weapon = new Ordinary();
        }
        else if (mode == Weapon.POWER_UP){
            this.weapon = new PowerUp();
        }
    }

    public boolean hit(Player to, int power, Wind wind){
        return true;
    }

    public boolean gameOver(Player player){
        return false;
//        return player.getBloodVolume() <= 0;
    }

    public int randomDistance(Wind w){
//        return new Random().nextInt(w.getWindRange() * 2)+w.getWindRange();
        return 0;
    }

    public Player opponent(){
        if(this.attacker instanceof Dog){ return this.cat; }
        return this.dog;
    }

    public String getAttackerName(){
        String name;
        if(this.attacker instanceof Dog){ name = Player.DOG; }
        else {name = Player.CAT;}
        return name;
    }

    public String getOpponentName(){
        String name;
        if(this.attacker instanceof Dog){ name = Player.CAT; }
        else {name = Player.DOG;}
        return name;
    }

    public void changeAttacker(){
        attacker = this.opponent();
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Player getAttacker() {
        return attacker;
    }

    public void setAttacker(Player attacker) {
        this.attacker = attacker;
    }

    public Cat getCat() {
        return cat;
    }
}
