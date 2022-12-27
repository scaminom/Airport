import java.util.List;

public abstract class Airport {
    private final int idAirport;
    private final String nameAirport;
    private final String cityLocated;
    private final String countryLocated;
    private final List<Company> companies;

    public Airport(int idAirport, String nameAirport, String cityLocated, String countryLocated, List<Company> companies) {
        this.idAirport = idAirport;
        this.nameAirport = nameAirport;
        this.cityLocated = cityLocated;
        this.countryLocated = countryLocated;
        this.companies = companies;
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

    public List<Company> getCompanies() {
        return this.companies;
    }

    public abstract boolean matchCompanyByAirportName(String nameAirport);

    public abstract String companiesByAirportName();

    public abstract String toString();

    public abstract String showCorporates();
}
