package org.example;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            /*Person person1 = new Person("Test1", 30);
            Person person2 = new Person("Test2", 40);
            Person person3 = new Person("Test3", 50);

            session.save(person1);
            session.save(person2);
            session.save(person3);*/

            //update person
            /*Person person = session.get(Person.class, 2);
            person.setName("New name");*/

            //delete person
            /*Person person = session.get(Person.class, 2);
            session.delete(person);*/

            //get ID person
            Person person = new Person();
            session.save(person);
            session.getTransaction().commit();
            System.out.println(person.getId());


            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
