package character;

/**
 * @author qanna
 */
public class  Cat extends Player {
    private boolean isAutomatic;
    public Cat(){
        this.setFlag("CAT");
    }

    @Override
    public boolean isAutomatic() {
        return isAutomatic;
    }

    @Override
    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
