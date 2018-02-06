package command;

/**
 * @author Andrew Bandura
 */

public class HelpCmd implements Command {
    @Override
    public boolean execute(String... args) {
        System.out.println("Displaying hekp info... done.");
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
