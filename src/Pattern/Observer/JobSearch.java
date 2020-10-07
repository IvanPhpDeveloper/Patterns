package Pattern.Observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite=new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber=new Subscriber("Ivan Taranenko");
        Observer secodSubscriber=new Subscriber("JOHN Malcovich");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secodSubscriber);

        jobSite.addVacancy("Third Java position");
    }
}
