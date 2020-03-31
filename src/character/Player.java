package character;

/**
 * @author qanna
 */
public class Player {
    private int bloodVolume;
    private int allVolume = 100;
    private int pos;
    private int playerDistance = 25;
    public static String DOG = "DOG";
    public static String CAT = "CAT";
    private String flag;


    private boolean isAutomatic = false;

    public Player(){
        this.bloodVolume = allVolume;
    }

    public void getHurt(int damage){
        this.bloodVolume -= damage;
    }


    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getAllVolume() {
        return allVolume;
    }

    public void setAllVolume(int allVolume) {
        this.allVolume = allVolume;
    }

    public int getPlayerDistance() {
        return playerDistance;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
