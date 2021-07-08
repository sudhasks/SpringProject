package com.javatpoint.entity;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @Column
    private int course_id;

    @Column
    private String course_name;

    @Column
    private int course_credit;

    @Column
    private String teacher_name;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//   @JoinColumn(name = "st_id")
//    @Column
//    private Student id;



    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_credit() {
        return course_credit;
    }

    public void setCourse_credit(int course_credit) {
        this.course_credit = course_credit;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

//    public Student getId() {
//        return id;
//    }
//
//    public void setId(Student id) {
//        this.id = id;
//    }
}
