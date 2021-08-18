package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Course;
import dev.patika.app.service.abstracts.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDao implements BaseDao<Course> {
    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public Course getById(int id) {
        return null;
    }

    @Override
    public void save(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(int id) {

    }
}
