package Entity;

import Service.TravelService;
import Service.UserService;

public class main {
    public static void main(String[] args) {
        TravelService travelService = new TravelService();
        travelService.ticketSearch("1401-02-20", "tehran", "kish")
                .forEach(System.out::println);

    }
}
