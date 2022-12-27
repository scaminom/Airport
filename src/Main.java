public class Main {
    public static void main(String[] args) {

        //Passengers
        var Juan = new Passenger("Juan", "23423414", "Italian");
        var Elian = new Passenger("Elian", "923424", "Chinese");
        var Pedro = new Passenger("Pedro", "920384234", "Ecuadorian");
        var Joaquin = new Passenger("Joaquin", "920384234", "Estonia");
        var Sebastian = new Passenger("Sebastian", "920384234", "Dutch");
        var Fernanda = new Passenger("Fernanda", "920384234", "American");
        var Maria = new Passenger("Maria", "920384234", "Mexican");


        // Flights

        var colombiaPanama = new Flight(1, "Colombia", "Panama", 678, 345,
                4);
        colombiaPanama.addPassenger(Juan);
        colombiaPanama.addPassenger(Elian);
        colombiaPanama.addPassenger(Pedro);

        var venezuelaEcuador = new Flight(2, "Venezuela", "Ecuador", 234, 123,
                112);
        venezuelaEcuador.addPassenger(Joaquin);
        venezuelaEcuador.addPassenger(Sebastian);
        venezuelaEcuador.addPassenger(Fernanda);

        var argentinaChile = new Flight(3, "Argentina", "Chile", 286, 243,
                            214);
        argentinaChile.addPassenger(Maria);


        //Airports
        var Tababela = new PrivateAirport(1, "Tababela", "Quito", "Ecuador");
        var Felisco = new PublicAirport(2, "Felisco", "Guadalajara", "Mexico", 2123323.2);
            //Companies
            var Avianca = new Company("Avianca");
            Avianca.addFlight(colombiaPanama);
            Avianca.addFlight(venezuelaEcuador);

            var Emirates = new Company("Emirates");
            Emirates.addFlight(argentinaChile);

            //Corporates
            var centryfigth = new Corporate(1, "Centry", 2323.12, "Quito y Rumichaca");
            var ovniman = new Corporate(2, "Ovniman", 4294.2, "Amazonas y 2 de Mayo");

        Tababela.addCompany(Avianca);
        Felisco.addCompany(Emirates);

        Tababela.addCorporate(centryfigth);
        Tababela.addCorporate(ovniman);

        // Manage Airports
        var AirportManager = new AirportManager();
        AirportManager.addAirport(Tababela);
        AirportManager.addAirport(Felisco);

        System.out.println(AirportManager.showCorporates());
        System.out.println();
        System.out.println(AirportManager.consultAirport("publico"));
        System.out.println();
        System.out.println(AirportManager.listFlightsByCompanyName("Emirates"));
        System.out.println();
        System.out.println(AirportManager.showCompaniesByAirportName("Tababela"));
        System.out.println();
        System.out.println(Avianca.showFlightsById(1));
        System.out.println();
        System.out.println(Avianca.showDestinations());
    }
}