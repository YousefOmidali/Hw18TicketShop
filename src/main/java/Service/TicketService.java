package Service;

import Entity.Ticket;
import Repository.TicketRepository;

public class TicketService {
    TicketRepository ticketRepository = new TicketRepository();

    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void deleteById(Integer id) {
        ticketRepository.deleteById(id);
    }

    public void update(Ticket ticket) {
        ticketRepository.update(ticket);
    }


}
