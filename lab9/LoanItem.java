public interface LoanItem {
    public static double calcultatePrice(LibraryItem item, int weeks) {
        if (item instanceof CD) {
            return 2.5 * weeks;
        } else
            return 1.75 * weeks;
    }
}