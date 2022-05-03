package garage.model.base;

import garage.model.factories.TankFactory;
import garage.model.factories.WheelsFactory;

public abstract class Car extends Vehicle {

    public Car(String modelName, String licenseNumber, int maxTirePressure, int numberOfTires, boolean isElectric) {
        super(modelName, licenseNumber, WheelsFactory.createWheels(numberOfTires, maxTirePressure), maxTirePressure, TankFactory.createTank(isElectric));
    }
}
