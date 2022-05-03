package garage.model.base;

import garage.model.factories.TankFactory;
import garage.model.factories.WheelsFactory;

public abstract class MotorCycle extends Vehicle {

    public MotorCycle(String modelName, String licenseNumber, int maxTirePressure, boolean isElectric) {
        super(modelName, licenseNumber, WheelsFactory.createWheels(2, maxTirePressure), maxTirePressure, TankFactory.createTank(isElectric));
    }
}
