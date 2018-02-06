package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Andrew Bandura
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AirlineCompany {

    private List<Aircraft> aircrafts;

    public void init(){
        Aircraft turboPlane = new TurboPropPlane("AN-22",1000, 55, 50, 300.7, 2);
        Aircraft jetPlane1 = new JetPlane("Boeing-737",4000, 155, 150, 1000, 2);
        Aircraft jetPlane2 = new JetPlane("Airbus-180",2000, 100, 95, 700.2, 1);

        this.aircrafts = Arrays.asList(turboPlane, jetPlane1, jetPlane2);

    }

}
