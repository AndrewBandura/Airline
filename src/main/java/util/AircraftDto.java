package util;

import com.google.gson.annotations.SerializedName;
import domain.Aircraft;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrew Bandura
 */

public class AircraftDto {

    @SerializedName("aircraft")
    private Stuff[] stuff;

    @Getter
    public static class Stuff {

        @SerializedName("type")
        public String type;

        @SerializedName("name")
        public String name;

        @SerializedName("flightRange")
        public int flightRange;

        @SerializedName("totalCapacity")
        public int totalCapacity;

        @SerializedName("carryingCapacity")
        public int carryingCapacity;

        @SerializedName("fuelConsumption")
        public double fuelConsumption;

    }

    public List<Aircraft> getAircraftList(){

        List<Aircraft> aircraftList = new ArrayList<>();

        for (Stuff currentStuff : stuff) {
            aircraftList.add(new Aircraft(
                    currentStuff.getName(),
                    currentStuff.getFlightRange(),
                    currentStuff.getTotalCapacity(),
                    currentStuff.getCarryingCapacity(),
                    currentStuff.getFuelConsumption()) {
            });

        }

        return aircraftList;
    }

}
