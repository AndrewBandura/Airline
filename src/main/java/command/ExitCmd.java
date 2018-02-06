package command;

/**
 * @author Andrew Bandura
 */

public class ExitCmd implements Command {
    @Override
    public boolean execute(String... args) {
        System.out.println("Finishing command processor... done.");
        return false;
    }

    @Override
    public String getName() {
        return "EXIT";
    }

    @Override
    public String getDescription() {
        return "Exits from command factory";
    }
}
