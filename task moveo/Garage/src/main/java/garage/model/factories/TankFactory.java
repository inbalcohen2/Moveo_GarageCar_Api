package garage.model.factories;

import garage.model.parts.ElectricTank;
import garage.model.parts.FuelTank;
import garage.model.parts.Tank;

public class TankFactory {

    public static Tank createTank(boolean isElectric) {
        return isElectric ? new ElectricTank() : new FuelTank();
    }
}
