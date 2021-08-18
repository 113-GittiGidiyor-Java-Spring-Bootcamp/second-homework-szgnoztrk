package dev.patika.app.controller;

import dev.patika.app.model.Course;
import dev.patika.app.service.concretes.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {
    private CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAll(){
        return this.courseService.getAll();
    }

    @GetMapping("/courses/{id}")
    public Course getById(@PathVariable int id){
        return this.courseService.getById(id);
    }

    @PostMapping("/courses")
    public String save(@RequestBody Course course){
        this.courseService.save(course);
        return "ok";
    }

    @PutMapping("/courses")
    public String update(@RequestBody Course course) {
        this.courseService.update(course);
        return "ok";
    }

    @DeleteMapping("/courses/{id}")
    public String delete(@PathVariable int id){
        this.courseService.delete(id);
        return "ok";
    }
}
