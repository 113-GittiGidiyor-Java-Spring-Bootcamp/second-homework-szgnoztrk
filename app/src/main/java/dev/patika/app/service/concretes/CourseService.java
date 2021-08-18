package dev.patika.app.service.concretes;

import dev.patika.app.dao.concretes.CourseDao;
import dev.patika.app.model.Course;
import dev.patika.app.service.abstracts.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course> {
    private CourseDao courseDao;
    @Autowired
    public CourseService(CourseDao courseDao){ this.courseDao = courseDao; };

    @Override
    public List<Course> getAll() {
        return this.courseDao.getAll();
    }

    @Override
    public Course getById(int id) {
        return this.courseDao.getById(id);
    }

    @Override
    public void save(Course course) {
        this.courseDao.save(course);
    }

    @Override
    public void update(Course course) {
        this.courseDao.update(course);
    }

    @Override
    public void delete(int id) {
        this.courseDao.delete(id);
    }
}
