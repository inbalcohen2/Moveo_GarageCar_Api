package garage.model.vechiles;

import garage.model.base.Car;

public class RegularCar extends Car {

    public RegularCar(String modelName, String licenseNumber, int maxTirePressure) {
        super(modelName, licenseNumber, maxTirePressure, 4, false);
    }
}
