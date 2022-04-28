package Service;

import Entity.Travel;
import Repository.TravelRepository;

import java.util.List;

public class TravelService {
    TravelRepository travelRepository = new TravelRepository();

    public void save(Travel travel) {
        travelRepository.save(travel);
    }

    public void deleteById(Integer id) {
        travelRepository.deleteById(id);
    }

    public void update(Travel travel) {
        travelRepository.update(travel);
    }

    public List<Travel> ticketSearch(String date, String origin, String destination) {
        return travelRepository.ticketSearch(date, origin, destination);
    }
    public Travel findById(Integer id) {
        return travelRepository.findById(id);
    }


}
