package garage.model.base;

import garage.model.parts.Tank;
import garage.model.parts.Wheel;

import java.util.List;

public abstract class Vehicle {
    private final Tank mTank;
    private final String mModelName;
    private final String mLicenseNumber;
    private final List<Wheel> mWheels;
    private final int mMaxTirePressure;

    public Vehicle(String modelName, String licenseNumber, List<Wheel> wheels, int maxTirePressure, Tank tank) {
        mModelName = modelName;
        mLicenseNumber = licenseNumber;
        mWheels = wheels;
        mMaxTirePressure = maxTirePressure;
        mTank = tank;
    }

    public String getModelName() {
        return mModelName;
    }


    public String getLicenseNumber() {
        return mLicenseNumber;
    }

    public void inflateTires() {
        for (Wheel wheel : mWheels) {
            wheel.setPressure(mMaxTirePressure);
        }
    }

    public void addEnergy() {
        mTank.fillTank();
    }

    @Override
    public String toString() {
        return "Tank Percentage=" + mTank.getPercentage() +
                ", Model ='" + mModelName + '\'' +
                ", LicenseNumber='" + mLicenseNumber + '\'' +
                ", Number Of Wheels=" + mWheels.size() +
                ", MaxTirePressure=" + mMaxTirePressure;
    }


}
