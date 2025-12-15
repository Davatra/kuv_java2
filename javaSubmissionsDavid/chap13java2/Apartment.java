package chap13java2;

public class Apartment implements Comparable<Apartment> {

    private String address;
    private int aptNumber;
    private double rent;
    private int bedrooms;

    public Apartment(String address, int aptNumber, double rent, int bedrooms) {
        this.address = address;
        this.aptNumber = aptNumber;
        this.rent = rent;
        this.bedrooms = bedrooms;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Apartment other) {
        return Double.compare(this.rent, other.rent);
    }

    @Override
    public String toString() {
        return address + " Apt " + aptNumber +
               " | Rent: $" + rent +
               " | Beds: " + bedrooms;
    }
}
