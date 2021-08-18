package dev.patika.app.controller;

import dev.patika.app.model.Instructor;
import dev.patika.app.service.concretes.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorController {
    private InstructorService instructorService;
    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/instructors")
    public List<Instructor> getAll(){
        return this.instructorService.getAll();
    }

    @GetMapping("/instructors/{id}")
    public Instructor getById(@PathVariable int id){
        return this.instructorService.getById(id);
    }

    @PostMapping("/instructors")
    public String save(@RequestBody Instructor instructor){
        this.instructorService.save(instructor);
        return "ok";
    }

    @PutMapping("/instructors")
    public String update(@RequestBody Instructor instructor) {
        this.instructorService.update(instructor);
        return "ok";
    }

    @DeleteMapping("/instructors/{id}")
    public String delete(@PathVariable int id){
        this.instructorService.delete(id);
        return "ok";
    }
}
