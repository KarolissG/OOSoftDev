public class VetDriver {
    public static void main(String args[]) {

        Animal animal1 = new Dog("Ben", 12);
        Animal animal2 = new Cat("Extafacus II(real cat)", 766);

        Vet vet1 = new Vet("Sarah");
        Vet vet2 = new Vet("Karen");

        vet1.vaccinate(animal2);
        vet2.vaccinate(animal1);
        vet2.vaccinate(animal2);
    }
}