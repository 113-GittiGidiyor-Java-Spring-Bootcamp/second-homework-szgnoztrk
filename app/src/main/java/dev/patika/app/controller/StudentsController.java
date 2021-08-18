package dev.patika.app.controller;

import dev.patika.app.model.Student;
import dev.patika.app.service.concretes.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsController {
    private StudentService studentService;
    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return this.studentService.getAll();
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable int id){
        return this.studentService.getById(id);
    }

    @PostMapping("/students")
    public String save(@RequestBody Student student){
        this.studentService.save(student);
        return "ok";
    }

    @PutMapping("/students")
    public String update(@RequestBody Student student) {
        this.studentService.update(student);
        return "ok";
    }

    @DeleteMapping("/students/{id}")
    public String delete(@PathVariable int id){
        this.studentService.delete(id);
        return "ok";
    }


}
