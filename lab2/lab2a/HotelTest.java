public class HotelTest {
    public static void main(String args[]) {

        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom(); // create two instances for rooms a and b
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90.0);

        roomA.setRoomNum(200);
        roomA.setRoomType("Single"); //set room num and typer for room a and b
        roomA.setVacancy(1);
        roomA.setRate(100.0);

        roomB.setRoomNum(201);
        roomB.setRoomType("Double");
        roomB.setVacancy(0);
        roomB.setRate(80.0);

        System.out.println("Room A is number " + roomA.getRoomNum() + " and it is a " + roomA.getRoomType()+" The night rate is "+roomA.getRate()+" is the room occupied : "+roomA.isOccupied());
        System.out.println("Room B is number " + roomB.getRoomNum() + " and it is a " + roomB.getRoomType()+" The night rate is "+roomB.getRate()+" is the room occupied : "+roomB.isOccupied()); //get info on room a and b
        System.out.println("Room C is number " + roomC.getRoomNum() + " and it is a " + roomC.getRoomType()+" The night rate is "+roomC.getRate()+" is the room occupied : "+roomC.isOccupied());
    }
}
