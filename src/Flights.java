import java.util.List;
import java.util.stream.Collectors;

public class Flights {
    private final int idFlights;
    private final String flightOrigin;
    private final String flightDestination;
    private final int travelPrice;
    private final int maximumPassengers;
    private final int reservedSeats;
    private final List<Passengers> passengers;

    public Flights(int idFlights, String flightOrigin, String flightDestination, int travelPrice, int maximumPassengers, int reservedSeats,
                   List<Passengers> passengers) {
        this.idFlights = idFlights;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.travelPrice = travelPrice;
        this.maximumPassengers = maximumPassengers;
        this.reservedSeats = reservedSeats;
        this.passengers =  passengers;
    }

    public int getIdFlights() {
        return idFlights;
    }

    public String getFlightDestination() {
        return flightDestination;
    }


    //public void showFlightPrice(String destination, String Company){
    //}
    public String toString() {
        return "Origen del vuelo: " + this.flightOrigin + "| Destino del vuelo: " + this.flightDestination + "| Precio del viaje: "
                + this.travelPrice + "| Capacidad maxima: " + this.maximumPassengers
                + "| Numero de asientos ocupados: " + this.reservedSeats + "\nPasajeros del vuelo "
                + this.passengers.stream().map(passengers -> passengers + "\n").collect(Collectors.joining());
    }

    public String toStringNotPassengers() {
        return "Origen del vuelo: " + this.flightOrigin + "| Destino del vuelo: " + this.flightDestination + "| Precio del viaje: "
                + this.travelPrice + "| Capacidad maxima: " + this.maximumPassengers
                + "| Numero de asientos ocupados: " + this.reservedSeats + "\n";
    }
}
