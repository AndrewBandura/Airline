package domain;

import lombok.Getter;

/**
 * @author Andrew Bandura
 */

@Getter
public abstract class Plane extends Aircraft {

    private final int engineAmount;

    public Plane(String name, int flightRange, int totalCapacity, int carryingCapacity, double fuelConsumption, int engineAmount) {
        super(name, flightRange, totalCapacity, carryingCapacity, fuelConsumption);
        this.engineAmount = engineAmount;
    }
}
