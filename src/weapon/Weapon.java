package weapon;

/**
 * @author qanna
 */
public class Weapon {
    /**
     * damage:伤害大小
     * range:伤害范围
     * alpha:伤害值与距离的比值
     * position:物体现在所在的位置
     * distance:物体落下的位置
     */
    protected int damage;
    protected int range;
    private int position;
    private int distance;

    public static int INPUT_ERROR = -1;
    public static int POWER_UP = 0;
    public static int ORDINARY = 1;

    public Weapon(){
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
