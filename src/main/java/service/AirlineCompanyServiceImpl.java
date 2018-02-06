package service;

import domain.Aircraft;
import domain.AirlineCompany;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
public class AirlineCompanyServiceImpl implements AirlineCompanyService {

    private AirlineCompany airlineCompany;

    public int calculateTotalCapacity() {

        int totalCapacity = 0;
        for (Aircraft aircraft : airlineCompany.getAircrafts()) {
            totalCapacity += aircraft.getTotalCapacity();
        }
        return totalCapacity;
    }

    public int calculateCarryingCapacity() {

        int carryingCapacity = 0;
        for (Aircraft aircraft : airlineCompany.getAircrafts()) {
            carryingCapacity += aircraft.getCarryingCapacity();
        }
        return carryingCapacity;
    }

    public List<Aircraft> getSortedAircraftList(){

        List<Aircraft> sortedAircrafts = new ArrayList<>(airlineCompany.getAircrafts());
        sortedAircrafts.sort(Comparator.comparingInt(Aircraft::getFlightRange));

        return sortedAircrafts;
    }

    public List<Aircraft> findByFuelConsumptionRange(double from, double to){

        return airlineCompany.getAircrafts().stream().filter((a)->a.getFuelConsumption()>=from && a.getFuelConsumption()<=to).collect(Collectors.toList());

    }
}
