package garage.model.vechiles;

import garage.model.base.MotorCycle;

public class RegularMotorcycle extends MotorCycle {

    public RegularMotorcycle(String modelName, String licenseNumber, int maxTirePressure) {
        super(modelName, licenseNumber, maxTirePressure, false);
    }
}
