package Lecture_from_10_31;

public class Student {
    String name;
    int age;
    int height;
    boolean sex;

    Student(String name, int age, int height, boolean sex){
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }
    Student(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    public String toString(){
        return name + " " + age + " " + height + " " + sex;
    }


}
