package util;

import domain.Aircraft;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class JsonUtilTest {

    @Before
    public void setUp() {}

    @Test
    public void parseShouldReturnNotEmptyList() {

        List<Aircraft> aircraftList = JsonUtil.parse();
        assertTrue(aircraftList.size()>0);

    }
}
