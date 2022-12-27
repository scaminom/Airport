import java.util.HashSet;
import java.util.Set;

public class Flight {
    private final int idFlights;
    private final String flightOrigin;
    private final String flightDestination;
    private final int travelPrice;
    private final int maximumPassengers;
    private final int reservedSeats;
    private final Set<Passenger> passengers;

    public Flight(int idFlights, String flightOrigin, String flightDestination, int travelPrice, int maximumPassengers, int reservedSeats) {
        this.idFlights = idFlights;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.travelPrice = travelPrice;
        this.maximumPassengers = maximumPassengers;
        this.reservedSeats = reservedSeats;
        this.passengers = new HashSet<>();
    }

    public int getIdFlights() {
        return idFlights;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public boolean addPassenger(Passenger passenger) {
        return this.passengers.add(passenger);
    }

    @Override
    public String toString() {
        return "Origen del vuelo: " + this.flightOrigin + "| Destino del vuelo: " + this.flightDestination + "| Precio del viaje: " + this.travelPrice + "| Capacidad maxima: " + this.maximumPassengers + "| Numero de asientos ocupados: " + this.reservedSeats;
    }
}
