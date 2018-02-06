package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Andrew Bandura
 */

@AllArgsConstructor
@Getter
public abstract class Aircraft {

    private final String name;
    private final int flightRange;
    private final int totalCapacity;
    private final int carryingCapacity;
    private final double fuelConsumption;

    @Override
    public String toString() {
        return "Aircraft{" +
                "name='" + name + '\'' +
                ", flightRange=" + flightRange +
                ", totalCapacity=" + totalCapacity +
                ", carryingCapacity=" + carryingCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
