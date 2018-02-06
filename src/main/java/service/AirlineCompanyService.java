package service;

import domain.Aircraft;
import java.util.List;

/**
 * @author Andrew Bandura
 */


public interface AirlineCompanyService {

    int calculateTotalCapacity();

    int calculateCarryingCapacity();

    List<Aircraft> getSortedAircraftList();

    List<Aircraft> findByFuelConsumptionRange(double from, double to);

}
