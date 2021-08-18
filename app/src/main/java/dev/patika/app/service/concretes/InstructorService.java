package dev.patika.app.service.concretes;

import dev.patika.app.dao.concretes.InstructorDao;
import dev.patika.app.model.Course;
import dev.patika.app.model.Instructor;
import dev.patika.app.service.abstracts.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor> {
    private InstructorDao instructorDao;
    @Autowired
    public InstructorService(InstructorDao instructorDao){ this.instructorDao = instructorDao; };

    @Override
    public List<Instructor> getAll() {
        return this.instructorDao.getAll();
    }

    @Override
    public Instructor getById(int id) {
        return this.instructorDao.getById(id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        return this.instructorDao.save(instructor);
    }

    @Override
    public Instructor update(Instructor instructor) {
        return this.instructorDao.update(instructor);
    }

    @Override
    public String delete(int id) {
        return this.instructorDao.delete(id);
    }
}
