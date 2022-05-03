package garage.model.factories;

import garage.model.base.Vehicle;
import garage.model.vechiles.*;

public class VechileFactory {

    private static final String CAR = "car";
    private static final String MOTORCYCLE = "motorcycle";
    private static final String TRUCK = "truck";

    public static Vehicle createVehicle(String type, String modelName, String licenseNumber, int maxTirePressure, boolean isElectric) {
        switch (type) {
            case CAR: {
                if (isElectric) {
                    return new ElectricCar(modelName, licenseNumber, maxTirePressure);
                } else {
                    return new RegularCar(modelName, licenseNumber, maxTirePressure);
                }
            }
            case MOTORCYCLE: {
                if (isElectric) {
                    return new ElectricMotorcycle(modelName, licenseNumber, maxTirePressure);
                } else {
                    return new RegularMotorcycle(modelName, licenseNumber, maxTirePressure);
                }
            }
            case TRUCK: {
                return new Truck(modelName, licenseNumber, maxTirePressure);
            }
        }
        return null;
    }
}
