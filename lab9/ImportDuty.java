public interface ImportDuty {
    final double CARTAXRATE = 0.10;
    final double HGVTAXRATE = 0.15;

    public static double calculateDuty(String type) {
        if (type.equalsIgnoreCase("car"))
            return CARTAXRATE;
        else
            return HGVTAXRATE;
    }
}
