package Repository;

import Entity.Users;
import lombok.var;

public class UserRepository extends GenericRepositoryImpl<Users, Integer> {

    public Users login(String username, String password) {
        var session = sessionFactory.openSession();
        String hql = " FROM Entity.Users a " +
                " WHERE a.username = :username " +
                " AND a.password = :password ";
        var query = session.createQuery(hql, Users.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        var x = query.getSingleResult().getName();
        System.out.println("*******");
        return query.getSingleResult();
    }
    public Users findById(Integer id) {
        var session = sessionFactory.openSession();
        String hql = " FROM Entity.Users a " +
                " WHERE a.id = :id ";
        var query = session.createQuery(hql, Users.class);
        query.setParameter("id", id);
        System.out.println(query.getSingleResult());
        return query.getSingleResult();
    }
}
