package Lecture_from_10_31;

public class Rate {
    int math;
    int english;
    int geography;

    Rate(int math, int english, int geography){
        this.math = math;
        this.english = english;
        this.geography = geography;
    }
    @Override
    public String toString(){
        return math +" "+ english +" "+ geography;
    }
}
