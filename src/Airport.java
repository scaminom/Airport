import java.util.HashSet;
import java.util.Set;

public abstract class Airport {
    private final int idAirport;
    private final String nameAirport;
    private final String cityLocated;
    private final String countryLocated;
    private final Set<Company> companies;

    public Airport(int idAirport, String nameAirport, String cityLocated, String countryLocated) {
        this.idAirport = idAirport;
        this.nameAirport = nameAirport;
        this.cityLocated = cityLocated;
        this.countryLocated = countryLocated;
        this.companies = new HashSet<>();
    }

    public int getIdAirport() {
        return idAirport;
    }

    public String getNameAirport() {
        return nameAirport;
    }

    public String getCityLocated() {
        return cityLocated;
    }

    public String getCountryLocated() {
        return countryLocated;
    }

    public Set<Company> getCompanies() {
        return this.companies;
    }

    public abstract boolean matchCompanyByAirportName(String nameAirport);

    public abstract String companiesByAirportName();

    public abstract boolean isPrivate();

    @Override
    public abstract String toString();

    public abstract String showCorporates();

    public abstract boolean addCompany(Company company);

}
