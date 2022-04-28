package Repository;

import Entity.Travel;
import lombok.var;

import java.util.List;

public class TravelRepository extends GenericRepositoryImpl<Travel, Integer> {
    public List<Travel> ticketSearch(String date, String origin, String destination) {
        var session = sessionFactory.openSession();
        String hql = " FROM Entity.Travel a " +
                " WHERE a.date = :date " +
                " AND a.origin = :origin " +
                " AND a.destination = :destination " +
                " AND a.capacity > 0 ";
        var query = session.createQuery(hql, Travel.class);
        query.setParameter("date", date);
        query.setParameter("origin", origin);
        query.setParameter("destination", destination);
        return query.getResultList();
    }

    public Travel findById(Integer id) {
        var session = sessionFactory.openSession();
        String hql = " FROM Entity.Travel a " +
                " WHERE a.id = :id " +
                " AND a.origin = :origin " +
                " AND a.destination = :destination " +
                " AND a.capacity > 0 ";
        var query = session.createQuery(hql, Travel.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}