package thisKeyword;

public class Hotel {
    String name;
    int countOfHalls;
    String HallId;
    int roomCount;

    Hotel(String name, int countOfHalls, String HallId, int roomCount){
        this.name = name;
        this.countOfHalls = countOfHalls;
        this.HallId = HallId;
        this.roomCount = roomCount;
    }

    public static void main(String args[]){
        Hotel hotel = new Hotel("Hilton", 20,"Lotus01", 200);
        System.out.println(hotel.name);
        System.out.println(hotel.countOfHalls);
        System.out.println(hotel.HallId);
        System.out.println(hotel.roomCount);
    }
}
