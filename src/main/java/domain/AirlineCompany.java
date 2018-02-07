package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import util.JsonUtil;

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

        this.aircrafts = JsonUtil.parse();

    }

}
