package Repository;

import Entity.Gender;
import Entity.Ticket;
import Entity.Travel;
import Entity.Users;
import lombok.var;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConnection {
    private SessionFactoryConnection(){}
    private static class LazyHolder{
        static SessionFactory INSTANCE;

        static {
            var registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();

            INSTANCE = new MetadataSources(registry)
                    .addAnnotatedClass(Ticket.class)
                    .addAnnotatedClass(Travel.class)
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Gender.class)
                    .buildMetadata()
                    .buildSessionFactory();
        }
    }
    public static SessionFactory getInstance(){
        return LazyHolder.INSTANCE;
    }
}
