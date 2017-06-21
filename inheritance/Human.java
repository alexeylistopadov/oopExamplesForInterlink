package inheritance;

public class Human {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private boolean sleeping;

    public Human(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setMaleGender() {
        this.gender = "male";
    }

    public void setFemaleGender() {
        this.gender = "female";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0) return;
        this.age = age;
    }

    public void goSleep(){
        sleeping = true;
        System.out.println(name + " is sleeping...");
    }

    public void wakeUp(){
        if (sleeping){
            sleeping = false;
            System.out.println(name + " woke up");
        }
        else {
            System.out.println(name + " is not sleeping");
        }
    }

    public void eat(){
        if (sleeping){
            System.out.println(name + " can't eat while he sleeps!");
        }
        else {
            System.out.println(name + " is eating...");
        }
    }

}
