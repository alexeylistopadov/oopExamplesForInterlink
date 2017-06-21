package inheritance;

public class Student extends Human {

    private static int MAX_COURSE = 5;

    private String institution;
    private String faculty;
    private int year;
    private String group;

    public Student(String name, String surname, int age, String institution, String faculty, int year, String group) {
        super(name, surname, age);
        this.institution = institution;
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }


    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void toNextCourse() {
        if (year <= MAX_COURSE) {
            this.year += 1;
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


}
