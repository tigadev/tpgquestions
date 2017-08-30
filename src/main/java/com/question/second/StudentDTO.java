package com.question.second;

//created by adzam on 31/8/2017
public class StudentDTO {

    private int id;
    private double gpa;
    private String name;

    public StudentDTO(int id, String name, double gpa ) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }
}
