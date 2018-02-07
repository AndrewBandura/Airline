package util;

import com.google.gson.Gson;
import domain.Aircraft;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class JsonUtil {

    public static List<Aircraft> parse(){

        final String path = new File("src/main/resources/aircrafts.json").getAbsolutePath();

        StringBuilder sb = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(sb::append);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        AircraftDto aircraftDto = gson.fromJson(sb.toString(), AircraftDto.class);

        return aircraftDto.getAircraftList();

    }
}
