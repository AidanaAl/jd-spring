import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {

        //Using polymorpism and interfaces we can easily implement loosly couple; by creating the Object

        //FullTimeMentor fullTime = new FullTimeMentor();
        //MentorAccount mentor = new MentorAccount(fullTime);

        PartTimeMentor partTime= new PartTimeMentor();
        MentorAccount mentor = new MentorAccount(partTime);

        mentor.manageAccount();






    }
}
