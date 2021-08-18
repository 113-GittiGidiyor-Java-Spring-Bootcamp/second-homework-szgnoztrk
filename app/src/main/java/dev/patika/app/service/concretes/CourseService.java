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
    public Course save(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public Course update(Course course) {
        return this.courseDao.update(course);
    }

    @Override
    public String delete(int id) {
        return this.courseDao.delete(id);
    }
}
