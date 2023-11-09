public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal) {
        if (animal instanceof Dog) {
            System.out.printf("%s is vaccinating %n", name);
            System.out.println("Dog has been vaccinated");
            System.out.println(animal.toString());
        } else {
            System.out.printf("%s is vaccinating %n", name);
            System.out.println("Cat has been vaccinated");
            System.out.println(animal.toString());
        }
    }
}
