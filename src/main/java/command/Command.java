package command;

/**
 * @author Andrew Bandura
 */

public interface Command {
    boolean execute(String... args);

    String getName();

    String getDescription();
}
