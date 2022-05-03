package garage.model.parts;

public abstract class Tank {
    private int mPercentage;

    public int getPercentage() {
        return mPercentage;
    }

    public void fillTank() {
        mPercentage = 100;
    }
}
