import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AirportManager {
    private final List<Airport> airports;

    public AirportManager() {
        this.airports = new ArrayList<>();
    }

    public void addAirport(Airport airport) {
         this.airports.add(airport);
    }

    public String consultAirport(String type) {
        boolean PublicAirport = List.of("Aeropuerto publico", "Publico", "aeropuerto publico", "publico").contains(type);
        var found = new ArrayList<Airport>();
        for (var airport : airports ) {
            if (PublicAirport) {
                if(airport.getClass().getName().equals("PublicAirport")) {
                    found.add(airport);
                }
            } else {
                if(airport.getClass().getName().equals("PrivateAirport")) {
                    found.add(airport);
                }
            }
        }
        return found.stream().map(Airport -> "Aeropuertos privados\n" + Airport.getNameAirport()).collect(Collectors.joining());
    }

    public String listFlightsByCompanyName(String companyName) {
        var companies = airports.stream().flatMap(Airport -> Airport.getCompanies().stream()).toList();
        var foundCompany = new ArrayList<Company>();
        for (var company : companies) {
            if (Objects.equals(companyName, company.getCompanyName())) {
                foundCompany.add(company);
            }
        }
        return foundCompany.stream().map(Company -> Company.toString() + "\n").collect(Collectors.joining());
    }

    public String showCompaniesByAirportName(String airport) {
        var companiesByAirportName = new ArrayList<Airport>();
        for (var companies : airports) {
            if (companies.matchCompanyByAirportName(airport)) {
                companiesByAirportName.add(companies);
            }
        }
        return companiesByAirportName.stream().map(Airport::companiesByAirportName).collect(Collectors.joining());
    }

    public String showCorporates() {
        var publicAirports = new ArrayList<Airport>();
        var privateAirports = new ArrayList<Airport>();

        for (var corporates : airports ) {
            if (corporates.getClass().getName().equals("PublicAirport")) {
                publicAirports.add(corporates);
            } else if (corporates.getClass().getName().equals("PrivateAirport")) {
                privateAirports.add(corporates);
            }
        }
        return  "Empresas privadas:\n" + privateAirports.stream().map(Airport::showCorporates).collect(Collectors.joining())
                + "\nEmpresas publicas:\n" + publicAirports.stream().map(Airport::showCorporates).collect(Collectors.joining());
    }
}
