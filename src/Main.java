import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        

        //Passengers
        var Juan = new Passengers("Juan", "23423414", "Italian");
        var Elian = new Passengers("Elian", "923424", "Chinese");
        var Pedro = new Passengers("Pedro", "920384234", "Ecuadorian");
        var Joaquin = new Passengers("Joaquin", "920384234", "Estonia");
        var Sebastian = new Passengers("Sebastian", "920384234", "Dutch");
        var Fernanda = new Passengers("Fernanda", "920384234", "American");
        var Maria = new Passengers("Maria", "920384234", "Mexican");

        ArrayList<Passengers> passengersId1 = new ArrayList<>();
        passengersId1.add(Maria);


        ArrayList<Passengers> passengersId2 = new ArrayList<>();
        passengersId2.add(Juan);
        passengersId2.add(Elian);
        passengersId2.add(Pedro);
        passengersId2.add(Fernanda);

        ArrayList<Passengers> passengersId3 = new ArrayList<>();
        passengersId3.add(Joaquin);
        passengersId3.add(Sebastian);
        passengersId3.add(Maria);

        //Flights
        var Colombia = new Flights(1, "Colombia", "Panama", 678, 345,
                4,passengersId1);
        var Venezuela = new Flights(2, "Venezuela", "Ecuador", 234, 123,
                112,passengersId2);
        var Argentina = new Flights(3, "Argentina", "Chile", 286, 243,
                            214, passengersId3);

        //Companies
        var Avianca = new ArrayList<Flights>();
        Avianca.add(Colombia);
        Avianca.add(Venezuela);
        
        var Emirates = new ArrayList<Flights>();
        Emirates.add(Argentina);

        var companyAvianca = new Company("Avianca", Avianca);
        var companyEmirates = new Company("Emirates", Emirates);

        var companiesOfTababela = new ArrayList<Company>();
        companiesOfTababela.add(companyAvianca);

        var companiesOfFelisco = new ArrayList<Company>();
        companiesOfFelisco.add(companyEmirates);

        //Corporates
        var centryfigth = new Corporates(1, "Centry", 2323.12, "Quito y Rumichaca");

        var corporates = new ArrayList<Corporates>();
        corporates.add(centryfigth);

        //Airports
        var Tababela = new PrivateAirport(1, "Tababela", "Quito", "Ecuador", companiesOfTababela, corporates);
        var Felisco = new PublicAirport(2, "Felisco", "Guadalajara", "Mexico", companiesOfFelisco, 2123323.2);

        //Manage Airports
        var AirportManager = new AirportManager();
        AirportManager.addAirport(Tababela);
        AirportManager.addAirport(Felisco);

//        System.out.println(AirportManager.showCorporates());
//        System.out.println();
//        System.out.println(AirportManager.consultAirport("publico"));
//        System.out.println();
//        System.out.println(AirportManager.listFlightsByCompanyName("Emirates"));
//        System.out.println();
//        System.out.println(AirportManager.showCompaniesByAirportName("Tababela"));
//        System.out.println();
//        System.out.println(companyAvianca.showFlightsById(1));
//        System.out.println();
        System.out.println(companyAvianca.showDestinations());
    }
}