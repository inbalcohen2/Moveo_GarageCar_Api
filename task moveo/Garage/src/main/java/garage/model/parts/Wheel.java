package garage.model.parts;

public class Wheel {
    public int mCurrentTirePressure;

    public Wheel(int pressure) {
        mCurrentTirePressure = pressure;
    }

    public int getCurrentTirePressure() {
        return mCurrentTirePressure;
    }

    public void setPressure(int pressure) {
        mCurrentTirePressure = pressure;
    }
}
