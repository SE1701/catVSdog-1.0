package character;

/**
 * @author qanna
 */
public class Cat extends Player {
    private boolean isAutomatic;

    @Override
    public boolean isAutomatic() {
        return isAutomatic;
    }

    @Override
    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
