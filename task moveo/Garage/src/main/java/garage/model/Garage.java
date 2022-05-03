package garage.model;

import garage.model.base.Vehicle;
import garage.model.factories.VechileFactory;

import java.util.*;

public class Garage {

    //Licsene number -> Vechile
    private final HashMap<String, Vehicle> mVehicles = new HashMap<>();

    private static Garage inst;

    private Garage() {

    }

    //Singleton
    public static Garage getInstance() {
        if (inst == null) {
            inst = new Garage();
        }
        return inst;
    }

    //add vechile
    // return true if sucsses otherwise false
    public boolean addVehicle(String type, String modelName, String licenseNumber, int maxTirePressure, boolean isElectric) {
        if (mVehicles.containsKey(licenseNumber)) {
            return false;
        }
        Vehicle vehicle = VechileFactory.createVehicle(type, modelName, licenseNumber, maxTirePressure, isElectric);
        if (vehicle != null) {
            mVehicles.put(vehicle.getLicenseNumber(), vehicle);
        }
        return vehicle != null;
    }

    //get vechile by licsene number
    //null if not exsits
    public Vehicle getVehicleByLicenseNumber(String licenseNumber) {
        return mVehicles.get(licenseNumber);
    }


    //get all vehicles
    public List<Vehicle> getAllVehicles(String sort) {
        List<Vehicle> list = new ArrayList<>(mVehicles.values());
        if (sort != null) {
            if (sort.equals("licenseNumber")) {
                Collections.sort(list, Comparator.comparing(Vehicle::getLicenseNumber));
            } else if (sort.equals("modelName")) {
                Collections.sort(list, Comparator.comparing(Vehicle::getModelName));
            }
        }
        return list;
    }

    public boolean inflateVehicleTires(String licenseNumber) {
        Vehicle vehicle = getVehicleByLicenseNumber(licenseNumber);
        if (vehicle != null) {
            vehicle.inflateTires();
        }
        return vehicle != null;
    }

    public boolean addEnergy(String licenseNumber) {
        Vehicle vehicle = getVehicleByLicenseNumber(licenseNumber);
        if (vehicle != null) {
            vehicle.addEnergy();
        }
        return vehicle != null;
    }

}
