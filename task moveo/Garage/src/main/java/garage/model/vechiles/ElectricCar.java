package garage.model.vechiles;

import garage.model.base.Car;

public class ElectricCar extends Car {

    public ElectricCar(String modelName, String licenseNumber, int maxTirePressure) {
        super(modelName, licenseNumber, maxTirePressure, 4, true);
    }
}
