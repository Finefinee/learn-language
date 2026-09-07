package amiddle.exclass;

public class Person2 {

    private String name;
    private int age;
    private Job2 job;

    public Person2(String name, int age, String title, String company) {
        this.name = name;
        this.age = age;
        this.job = new Job2(title, company);
    }

    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
        if (job != null) {
            System.out.println("직업: " + job.getTitle() + ", " + job.getCompany());
        }
    }
}

class Job2 {
    private String title;
    private String company;

    public Job2(String title, String company) {
        this.title = title;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }
}