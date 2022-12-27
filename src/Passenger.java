public class Passenger {
    private final String name;
    private final String passportNumber;
    private final String nationality;

    public Passenger(String name, String passportNumber, String nationality) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "Nombre : " + this.name + " Passaporte: " + this.passportNumber + " Nacionalidad: " + this.nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Passenger other = (Passenger) o;
        return this.passportNumber.equals(other.getPassportNumber());
    }
}
