package persistence1;

// Start of user code for imports
import java.util.*;
// End of user code

/**
 * StudentInfo class definition.
 * Generated by the TouchCORE code generator.
 */
public class StudentInfo {
    
    private static int rollNo;
    private static String name;
    private Student myStudent;
    
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration = configuration.configure();
        SessionFactory sessionfactory = configuration.buildSessionFactory();
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student();
        StudentInfo.name = student.getName();
        StudentInfo.rollNo = student.getRollNo();
        session.save(student);
        transaction = session.getTransaction();
        transaction.commit();
        session.close();
        sessionfactory.close();
    }
}
