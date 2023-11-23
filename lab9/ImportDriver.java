public class ImportDriver implements ImportDuty {

    public static void main(String args[]) {
        RoadVehicle car = new Car("Audi", 4, 5);
        RoadVehicle hgv = new Hgv(10000, 6, 2);

        System.out.println(car.toString() + "\nTax Rate - " + ImportDuty.calculateDuty("car"));
        System.out.println("");
        System.out.println(hgv.toString() + "\nTax Rate - " + ImportDuty.calculateDuty("hgv"));

    }
}
