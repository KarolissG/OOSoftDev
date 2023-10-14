import java.util.Scanner;

public class Address {
    private String street;
    private String city;
    private String county;

    public Address() {
        Scanner streetName = new Scanner(System.in);
        System.out.print("Enter street :");
        street = streetName.nextLine();
        Scanner cityName = new Scanner(System.in);
        System.out.print("Enter city :");
        city = cityName.nextLine();
        Scanner countyName = new Scanner(System.in);
        System.out.print("Enter county :");
        county = countyName.nextLine();
    }

    public String toString() {
        return (street + ",\n" + city + ",\n" + county);
    }
}
