import domain.Aircraft;
import domain.AirlineCompany;
import domain.JetPlane;
import domain.TurboPropPlane;
import command.CommandProcessor;
import service.AirlineCompanyService;
import service.AirlineCompanyServiceImpl;

import java.util.Arrays;
import java.util.List;

public class Airline {

    public static void main(String[] args) {

        AirlineCompany airlineCompany = new AirlineCompany();
        airlineCompany.init();

        AirlineCompanyService airlineCompanyService = new AirlineCompanyServiceImpl(airlineCompany);

        CommandProcessor commandProcessor = new CommandProcessor("Cp1251", airlineCompanyService);
        commandProcessor.execute();

    }
}
