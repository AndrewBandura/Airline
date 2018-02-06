package service;

import domain.Aircraft;
import domain.AirlineCompany;
import domain.JetPlane;
import domain.TurboPropPlane;
import org.junit.Before;
import org.junit.Test;
import service.AirlineCompanyService;
import service.AirlineCompanyServiceImpl;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * @author Andrew Bandura
 */

public class AirlineCompanyServiceTest {

    private AirlineCompanyService airlineService;

    @Before
    public void setUp() {

        Aircraft turboPlane = new TurboPropPlane("AN-22",1000, 55, 50, 300.7, 2);
        Aircraft jetPlane1 = new JetPlane("Boeing-737",4000, 155, 150, 1000, 2);
        Aircraft jetPlane2 = new JetPlane("Airbus-180",2000, 100, 95, 700.2, 1);

        List<Aircraft> aircraftList = Arrays.asList(turboPlane, jetPlane1, jetPlane2);
        airlineService = new AirlineCompanyServiceImpl(new AirlineCompany(aircraftList));

    }

    @Test
    public void calculateTotalCapacity(){
        final int expected = 310;
        int actual = airlineService.calculateTotalCapacity();
        assertEquals(expected, actual);
    }

    @Test
    public void calculateCarryingCapacity(){
        final int expected = 295;
        int actual = airlineService.calculateCarryingCapacity();
        assertEquals(expected, actual);
    }

    @Test
    public void getSortedAircraftList(){
        final int expectedMin = 1000;
        final int expectedMax = 4000;
        List<Aircraft> sortedList = airlineService.getSortedAircraftList();
        assertEquals(expectedMin, sortedList.get(0).getFlightRange());
        assertEquals(expectedMax, sortedList.get(2).getFlightRange());
    }

    @Test
    public void findByFuelConsumptionRangeShouldReturnOneItem(){
        final double from = 100;
        final double to = 500;
        int expectedSize = 1;
        List<Aircraft> foundList = airlineService.findByFuelConsumptionRange(from, to);
        assertEquals(expectedSize, foundList.size());
    }
}
