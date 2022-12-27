import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private String companyName;
    private List<Flights> flights;

    public Company(String companyName, List<Flights> flights) {
        this.companyName = companyName;
        this.flights = flights;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String showFlightsById(int idFLights) {
        var possibleFlights = new ArrayList<Flights>();
        for (var flights : this.flights) {
            if (flights.getIdFlights() == idFLights) {
                possibleFlights.add(flights);
            }
        }
        return "Vuelos posibles:\n"
                + possibleFlights.stream().map(Flights -> Flights.toStringNotPassengers()).collect(Collectors.joining());
    }

    public String showDestinations() {
        String destinationsContainer = "";
        for (var flights : flights) {
             destinationsContainer += flights.getFlightDestination().concat("\n");
        }
        return "Los destinos de la compania " + getCompanyName() + " son:\n" + destinationsContainer;
    }

    public String toString() {
        return "Nombre de la compania= " + companyName + "| Vuelos disponibles: \n"
                + flights.stream().map(Flights -> Flights.toStringNotPassengers()).collect(Collectors.joining());
    }
}
