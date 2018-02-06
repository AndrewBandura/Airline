package command;

import lombok.AllArgsConstructor;
import service.AirlineCompanyService;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
public class DisplayAircraftListCmd implements Command {

    AirlineCompanyService airlineCompanyService;

    @Override
    public boolean execute(String... args) {
        System.out.println("Displaying sorted aircraft...");
        airlineCompanyService.getSortedAircraftList().forEach(System.out::println);
        return true;
    }

    @Override
    public String getName() {
        return "DISPLAY";
    }

    @Override
    public String getDescription() {
        return "Displays aircraft sorted by flight range";
    }
}
