package command;

import lombok.AllArgsConstructor;
import service.AirlineCompanyService;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
public class CalculateCarryingCapacityCmd implements Command {

    AirlineCompanyService airlineCompanyService;

    @Override
    public boolean execute(String... args) {
        System.out.println("Calculating carrying capacity... done.");
        int capacity = airlineCompanyService.calculateCarryingCapacity();
        System.out.println("Carrying capacity: "+capacity);
        return true;
    }

    @Override
    public String getName() {
        return "C_CAPACITY";
    }

    @Override
    public String getDescription() {
        return "Calculates carrying capacity of aircraft";
    }
}
