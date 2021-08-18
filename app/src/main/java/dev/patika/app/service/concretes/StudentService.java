package dev.patika.app.service.concretes;

import dev.patika.app.dao.concretes.StudentDao;
import dev.patika.app.model.Student;
import dev.patika.app.service.abstracts.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student> {
    private StudentDao studentDao;
    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAll() {
        return this.studentDao.getAll();
    }

    @Override
    public Student getById(int id) {
        return this.studentDao.getById(id);
    }

    @Override
    public Student save(Student student) { return this.studentDao.save(student); }

    @Override
    public Student update(Student student) {
        return this.studentDao.update(student);
    }

    @Override
    public String delete(int id) {
        return this.studentDao.delete(id);
    }
}
