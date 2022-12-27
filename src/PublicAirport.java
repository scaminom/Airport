import java.util.stream.Collectors;

public class PublicAirport extends Airport {
    private final double subsidy;

    public PublicAirport(int idAirport, String nameAirport, String cityLocated, String countryLocated, Double subsidy) {
        super(idAirport, nameAirport, cityLocated, countryLocated);
        this.subsidy = subsidy;
    }

    public double getSubsidy() {
        return subsidy;
    }

    @Override
    public boolean matchCompanyByAirportName(String nameAirport) {
        return this.getNameAirport().contains(nameAirport);
    }

    @Override
    public String showCorporates() {
        return "Aeropuerto: " + getNameAirport() + "\nPertenece a la empresa del gobierno, con una subencion de: " + this.subsidy;
    }

    @Override
    public boolean addCompany(Company company) {
        return this.getCompanies().add(company);
    }

    @Override
    public String companiesByAirportName() {
        return "Nombre= " + this.getNameAirport()
                + "\n Companias:\n" + "Este aeropuerto pertenece al gobierno";
    }

    @Override
    public boolean isPrivate() {
        return false;
    }

    @Override
    public String toString() {
        return "IdAeropuerto= " + this.getIdAirport() + "| Nombre= " + this.getNameAirport() + "| Ciudad localizada= " + this.getCityLocated() + "| Pais localizado= " + this.getCountryLocated()
                + "| Companias:\n" + this.getCompanies().stream().map(Company::toString).collect(Collectors.joining()) + "Subsidio= "
                + this.getSubsidy();
    }
}
