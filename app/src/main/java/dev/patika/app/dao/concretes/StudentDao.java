package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Student;
import dev.patika.app.service.abstracts.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDao implements BaseDao<Student> {
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }
}
