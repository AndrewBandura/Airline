package command;

import lombok.AllArgsConstructor;
import service.AirlineCompanyService;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
public class FindByRangeOfFuelConsumptionCmd implements Command {

    AirlineCompanyService airlineCompanyService;

    @Override
    public boolean execute(String... args) {
        System.out.println("Searching by fuel consumption range.. done.");
        double from, to;
        try {
            from = Double.parseDouble(args[0]);
            to = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Illegal parameters");
            return true;
        }
        airlineCompanyService.findByFuelConsumptionRange(from, to).forEach(System.out::println);
        return true;
    }

    @Override
    public String getName() {
        return "FIND";
    }

    @Override
    public String getDescription() {
        return "Finds aircraft by range of fuel consumption. Example: \"find 100 1000 \"";
    }
}
