import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrivateAirport extends Airport {
    private final Set<Corporate> corporates;

    public PrivateAirport(int idAirport, String nameAirport, String cityLocated, String countryLocated) {
        super(idAirport, nameAirport, cityLocated, countryLocated);
        this.corporates = new HashSet<>();
    }

    public Set<Corporate> getCorporates() {
        return this.corporates;
    }

    public boolean addCorporate(Corporate corporate) {
        return this.corporates.add(corporate);
    }

    @Override
    public boolean matchCompanyByAirportName(String nameAirport) {
        return this.getNameAirport().contains(nameAirport);
    }

    @Override
    public String showCorporates() {
        return this.corporates.stream().map(corporate -> corporate + "\n").collect(Collectors.joining());
    }

    @Override
    public boolean addCompany(Company company) {
        return this.getCompanies().add(company);
    }

    @Override
    public String companiesByAirportName() {
        return "Nombre= " + this.getNameAirport()
                + "\nCompanias que cuenta la empresa:\n" + " -" + this.getCompanies().stream().map(Company::getCompanyName).collect(Collectors.joining());
    }

    @Override
    public boolean isPrivate() {
        return true;
    }

    @Override
    public String toString() {
        return "IdAeropuerto= " + this.getIdAirport() + "| Nombre= " + this.getNameAirport() + "| Ciudad localizada= "
                + this.getCityLocated() + "| Pais localizado= " + this.getCountryLocated()
                + "| Companias:\n" + this.getCompanies().stream().map(Company::toString).collect(Collectors.joining()) + "Empresas:\n "
                + this.getCorporates().stream().map(Corporate -> Corporate.toString()).collect(Collectors.joining());
    }
}
