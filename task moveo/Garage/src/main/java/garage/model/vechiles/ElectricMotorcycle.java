package garage.model.vechiles;

import garage.model.base.MotorCycle;

public class ElectricMotorcycle extends MotorCycle {

    public ElectricMotorcycle(String modelName, String licenseNumber, int maxTirePressure) {
        super(modelName, licenseNumber, maxTirePressure, true);
    }
}
