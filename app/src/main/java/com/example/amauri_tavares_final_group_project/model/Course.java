package com.example.amauri_tavares_final_group_project.model;

public class Course {

    private  int id_Course;
    private String Course_name;
    private String Course_code;
    private String description;
    private float fees;


    public Course(String Course_name, String Course_code, String description, float fees) {
        this.Course_name = Course_name;
        this.Course_code = Course_code;
        this.description = description;
        this.fees = fees;
    }
    public Course() {

    }
    public int getId_Course() {  return id_Course; }

    public void setId_Course(int id_Course) {  this.id_Course = id_Course;  }
    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String Course_name) {
        this.Course_name = Course_name;
    }

    public String getCourse_code() {
        return Course_code;
    }

    public void setCourse_code(String Course_code) {
        this.Course_code = Course_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }


}
