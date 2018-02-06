package command;

/**
 * @author Andrew Bandura
 */

import service.AirlineCompanyService;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CommandProcessor {
    private static final String MSG_UNSUPPORTED_COMMAND = "Unsupported command";

    private Map<String, Command> commands;
    private String consoleEncoding;

    public CommandProcessor(String consoleEncoding, AirlineCompanyService airlineCompanyService) {

        this.consoleEncoding = consoleEncoding;

        commands = new TreeMap<>();

        Command cmd = new DisplayAircraftListCmd(airlineCompanyService);
        commands.put(cmd.getName(), cmd);

        cmd = new CalculateCarryingCapacityCmd(airlineCompanyService);
        commands.put(cmd.getName(), cmd);

        cmd = new CalculateTotalCapacityCmd(airlineCompanyService);
        commands.put(cmd.getName(), cmd);

        cmd = new FindByRangeOfFuelConsumptionCmd(airlineCompanyService);
        commands.put(cmd.getName(), cmd);

        cmd = new HelpCmd(commands);
        commands.put(cmd.getName(), cmd);

        cmd = new ExitCmd();
        commands.put(cmd.getName(), cmd);

    }

    public void execute(){

        boolean result = true;
        Scanner scanner = new Scanner(System.in, consoleEncoding);
        System.out.println("Welcome to airline terminal! Print \"help\" to learn more.");
        do {
            System.out.print(">");
            String fullCommand = scanner.nextLine();
            ConsoleCommand consoleCommand = new ConsoleCommand(fullCommand);
            if (consoleCommand.command == null || "".equals(consoleCommand.command)) {
                continue;
            }
            Command cmd = commands.get(consoleCommand.command.toUpperCase());
            if (cmd == null) {
                System.out.println(MSG_UNSUPPORTED_COMMAND);
                continue;
            }
            result = cmd.execute(consoleCommand.args);
        } while (result);
    }
}
