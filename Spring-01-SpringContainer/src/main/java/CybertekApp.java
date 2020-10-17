import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        //since we are using xml file we use ClassPathXmlApplicationContext and give the path

        //Spring Bean
        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //Spring ApplicationContext
       ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

       //don't need to cast, returning mentor type
       Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);
       mentor.createAccount();

       //need to be casted
       Mentor mentor1 = (Mentor) container.getBean("partTimeMentor");
       mentor1.createAccount();





    }
}
