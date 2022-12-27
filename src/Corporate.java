public class Corporate {
    private final int idCorporate;
    private final String name;
    private final double cost;
    private final String address;

    public Corporate(int idCorporate, String name, double cost, String address) {

        this.idCorporate = idCorporate;
        this.name = name;
        this.cost = cost;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nombre de la empresa= " + name + "| costo= " + cost + "| direccion= " + address;
    }
}
