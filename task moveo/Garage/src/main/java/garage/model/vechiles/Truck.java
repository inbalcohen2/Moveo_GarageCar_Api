package garage.model.vechiles;

import garage.model.base.Car;

public class Truck extends Car {

    public Truck(String modelName, String licenseNumber, int maxTirePressure) {
        super(modelName, licenseNumber, maxTirePressure, 16, false);
    }
}
