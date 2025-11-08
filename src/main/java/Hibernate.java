import entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.UUID;

public class Hibernate {
    public static void main(String[] args) {
/*        User user = new User();
        user.setUsername("User2");
        user.setFirstName("John2");
        user.setLastName("Doe2");
        user.setBirthDate(LocalDate.of(1980, 1, 1));*/
        Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
       // Transaction transaction = session.beginTransaction();
       // session.persist(user);

        User user = session.find(User.class, UUID.fromString("93463d02-381e-44be-b48c-faa9af351420"));
        System.out.println(user);
/*        transaction.commit();*/
        session.close();
        factory.close();


    }


}
