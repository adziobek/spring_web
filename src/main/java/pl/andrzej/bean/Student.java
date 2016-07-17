package pl.andrzej.bean;

/**
 * Created by Andrzej on 17.07.2016.
 */
public class Student {

    private int age;
    private String name;
    private String lastName;

    public Student() {
    }

    public Student(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
