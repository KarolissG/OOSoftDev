public class LibraryItem {
    protected String type;
    protected String ID;
    protected LibraryItem item;

    public LibraryItem(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }

    public String toString() {
        return "--" + type + "--\nID: " + ID;
    }
}
