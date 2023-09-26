class HotelRoom {

    private int roomNumber;
    private String roomType;
    private int occupied;
    private double nightRate;

    public HotelRoom() { // constructor without setters
    }

    public HotelRoom(int num, String type, int vacant, double rate) {
        roomNumber = num;
        roomType = type;
        occupied = vacant;
        nightRate = rate;
    }

    public void setRoomType(String type) { // setter and getter for type
        roomType = type;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomNum(int num) { // setter and getter for room num
        roomNumber = num;
    }

    public int getRoomNum() {
        return roomNumber;
    }

    public void setVacancy(int vacant) {// setter and getter for room vacancies
        occupied = vacant;
    }

    public int getVacancy() {
        return occupied;
    }

    public void setRate(double rate) {// setter and getter for night rate
        nightRate = rate;
    }

    public double getRate() {
        return nightRate;
    }

    public Boolean isOccupied() {
        if (occupied == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void setOccupied() {
        if (occupied == 0) {
            occupied = 1;
        }
    }
}