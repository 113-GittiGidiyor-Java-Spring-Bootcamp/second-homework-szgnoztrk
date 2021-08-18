package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Instructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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
    public void delete(int id) {

    }
}
