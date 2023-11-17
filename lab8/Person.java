public abstract class Person {
    protected String name;

    public Person(String nameIn) {
        name = nameIn;
    }

    abstract String getDescription();

    public String getName() {
        return name;
    }
}
