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
    public Student save(@RequestBody Student student){
        return this.studentService.save(student);
    }

    @PutMapping("/students")
    public Student update(@RequestBody Student student) {
        return this.studentService.update(student);
    }

    @DeleteMapping("/students/{id}")
    public String delete(@PathVariable int id){
        return this.studentService.delete(id);
    }


}
