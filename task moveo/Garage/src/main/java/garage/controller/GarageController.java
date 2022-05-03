package garage.controller;

import garage.model.Garage;
import garage.model.base.Vehicle;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/garage")
public class GarageController {


    @RequestMapping(value = "/add", method = GET)
    @ResponseBody
    public String addVehicle(@RequestParam("type") String type,
                             @RequestParam("modelName") String modelName,
                             @RequestParam("licenseNumber") String licenseNumber,
                             @RequestParam("maxTirePressure") int maxTirePressure,
                             @RequestParam("isElectric") boolean isElectric
    ) {
        //localhost:8080/add?type=car&modelName=tesla&licenseNumber=1234&maxTirePressure=20&isElectric=true
        boolean isSucsses = Garage.getInstance().addVehicle(type, modelName, licenseNumber, maxTirePressure, isElectric);
        JSONObject res = new JSONObject();
        res.put("successes_add_vehicle", isSucsses);
        return res.toString();
    }

    @RequestMapping(value = "/getVehicle", method = GET)
    @ResponseBody
    public String getVehicle(@RequestParam("licenseNumber") String licenseNumber) {
        //localhost:8080/getVehicle?licenseNumber=1234
        JSONObject res = new JSONObject();
        Vehicle vehicle = Garage.getInstance().getVehicleByLicenseNumber(licenseNumber);
        if (vehicle != null) {
            res.put("vehicle", vehicle.toString());
        } else {
            res.put("error", "vehicle_not_found");
        }
        return res.toString();
    }

    @RequestMapping(value = "/getAll", method = GET)
    @ResponseBody
    public String getAllVehicles(@RequestParam(value = "sort") Optional<String> sort) {
        //localhost:8080/getAll
        JSONObject res = new JSONObject();
        List<Vehicle> list = Garage.getInstance().getAllVehicles(sort.orElse(null));
        if (list.size() > 0) {
            JSONArray jsonArray = new JSONArray();
            for (Vehicle vehicle : list) {
                jsonArray.put(vehicle.toString());
            }
            res.put("vehicles", jsonArray);
        } else {
            res.put("vehicles", "no vehicles in the garge");
        }
        return res.toString();
    }

    @RequestMapping(value = "/inflate", method = GET)
    @ResponseBody
    public String inflateVehicleTires(@RequestParam("licenseNumber") String licenseNumber) {
        //localhost:8080/inflate?licenseNumber=1234
        boolean isSucsses = Garage.getInstance().inflateVehicleTires(licenseNumber);
        JSONObject res = new JSONObject();
        res.put("successes_inflate", isSucsses);
        return res.toString();
    }

    @RequestMapping(value = "/addenergy", method = GET)
    @ResponseBody
    public String addEnergy(@RequestParam("licenseNumber") String licenseNumber) {
        //localhost:8080/addenergy?licenseNumber=1234
        boolean isSucsses = Garage.getInstance().addEnergy(licenseNumber);
        JSONObject res = new JSONObject();
        res.put("successes_energy", isSucsses);
        return res.toString();
    }


}
