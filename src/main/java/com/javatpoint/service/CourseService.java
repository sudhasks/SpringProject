package com.javatpoint.service;

import com.javatpoint.entity.Course;
import com.javatpoint.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    //getting all course records
    public List<Course> getAllCourse()
    {
        List<Course> courses = new ArrayList<Course>();
        courseRepository.findAll().forEach(course -> courses.add(course));
        return courses;
    }
    //getting a specific record
    public Course getCourseById(int id)
    {
        return courseRepository.findById(id).get();
    }
    public void saveOrUpdate(Course course)
    {
        courseRepository.save(course);
    }
    //deleting a specific record
    public void delete(int id)
    {
        courseRepository.deleteById(id);
    }
}
