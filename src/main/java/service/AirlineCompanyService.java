package service;

import domain.Aircraft;
import java.util.List;

/**
 * @author Andrew Bandura
 */


public interface AirlineCompanyService{

        /**
         * Returns a calculated total capacity of all aircraft.
         * @return an int value.
         */
        int calculateTotalCapacity();

        /**
         * Returns a calculated carrying capacity of all aircraft.
         * @return an int value.
         */
        int calculateCarryingCapacity();

        /**
         * Returns an aircraft list sorted by flight range.
         * @return a list of Aircraft.
         */
        List<Aircraft> getSortedAircraftList();

        /**
         * Returns an aircraft list filtered by fuel consumption range.
         *
         * @param from the double value, min in the range.
         * @param to   the double value, max in the range.
         * @return a list of Aircraft.
         */
        List<Aircraft> findByFuelConsumptionRange(double from, double to);

}
