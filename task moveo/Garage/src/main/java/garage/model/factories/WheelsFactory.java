package garage.model.factories;

import garage.model.parts.Wheel;

import java.util.ArrayList;
import java.util.List;

public class WheelsFactory {

    public static List<Wheel> createWheels(int number, int pressure) {
        List<Wheel> wheels = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            wheels.add(new Wheel(pressure));
        }
        return wheels;
    }
}
