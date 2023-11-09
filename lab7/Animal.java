public class Animal {

    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name :" + name + "\nAge :" + age + "\n";
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }
}