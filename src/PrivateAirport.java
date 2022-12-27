import java.util.List;
import java.util.stream.Collectors;

public class PrivateAirport extends Airport {
    private final List<Corporates> corporates;

    public PrivateAirport(int idAirport, String nameAirport, String cityLocated, String countryLocated, List<Company> companies, List<Corporates> corporates) {
        super(idAirport, nameAirport, cityLocated, countryLocated, companies);
        this.corporates = corporates;
    }

    public List<Corporates> getCorporates() {
        return this.corporates;
    }

    @Override
    public boolean matchCompanyByAirportName(String nameAirport) {
        return this.getNameAirport().contains(nameAirport);
    }

    @Override
    public String showCorporates() {
        return this.corporates.stream().map(corporates -> corporates + "\n").collect(Collectors.joining());
    }

    @Override
    public String companiesByAirportName() {
        return "Nombre= " + this.getNameAirport()
                + "\nCompanias que cuenta la empresa:\n" + " -" + this.getCompanies().stream().map(Company::getCompanyName).collect(Collectors.joining());
    }

    @Override
    public String toString() {
        return "IdAeropuerto= " + this.getIdAirport() + "| Nombre= " + this.getNameAirport() + "| Ciudad localizada= "
                + this.getCityLocated() + "| Pais localizado= " + this.getCountryLocated()
                + "| Companias:\n" + this.getCompanies().stream().map(Company::toString).collect(Collectors.joining()) + "Empresas:\n "
                + this.getCorporates().stream().map(Corporates -> Corporates.toString()).collect(Collectors.joining());
    }
}
