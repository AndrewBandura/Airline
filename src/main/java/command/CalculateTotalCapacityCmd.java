package command;

import lombok.AllArgsConstructor;
import service.AirlineCompanyService;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
public class CalculateTotalCapacityCmd implements Command {

    AirlineCompanyService airlineCompanyService;

    @Override
    public boolean execute(String... args) {
        int capacity = airlineCompanyService.calculateTotalCapacity();
        System.out.println("Calculating total capacity... done.");
        System.out.println("Total capacity: "+capacity);
        return true;
    }

    @Override
    public String getName() {
        return "T_CAPACITY";
    }

    @Override
    public String getDescription() {
        return "Calculates total capacity of aircraft";
    }
}
