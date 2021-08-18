package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Instructor;
import dev.patika.app.service.abstracts.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDao implements BaseDao<Instructor> {
    @Override
    public List<Instructor> getAll() {
        return null;
    }

    @Override
    public Instructor getById(int id) {
        return null;
    }

    @Override
    public void save(Instructor instructor) {

    }

    @Override
    public void update(Instructor instructor) {

    }

    @Override
    public void delete(Instructor instructor) {

    }
}
