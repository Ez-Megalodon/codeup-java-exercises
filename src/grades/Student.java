package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private double grade;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student () {
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades){
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades (){
        return this.grades;
    }


    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int arraySize = grades.size();
        double total = 0;
        for (int i = 0; i < arraySize; i++){
            total += grades.get(i);
        }
        return total / arraySize;
    }
}
