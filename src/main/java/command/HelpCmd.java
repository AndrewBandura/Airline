package command;

import lombok.AllArgsConstructor;
import java.util.Map;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
public class HelpCmd implements Command {

    final Map<String, Command> commands;

    @Override
    public boolean execute(String... args) {
        System.out.println("List of commands:");

        commands.forEach((k,v)->{
            System.out.printf("%-15s",k);
            System.out.print(": "+v.getDescription());
            System.out.println();

        });

       return true;
    }

    @Override
    public String getName() {
        return "HELP";
    }

    @Override
    public String getDescription() {
        return "Displays help info";
    }
}
