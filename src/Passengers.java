public class Passengers {
    private String name;
    private String passportNumber;
    private String nationality;

    public Passengers(String name, String passportNumber, String nationality) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String toString() {
        return "Nombre : " + this.name + " Passaporte: " + this.passportNumber + " Nacionalidad: " + this.nationality;
    }
}
