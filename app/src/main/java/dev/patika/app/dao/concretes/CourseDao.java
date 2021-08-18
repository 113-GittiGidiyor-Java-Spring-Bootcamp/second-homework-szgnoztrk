package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CourseDao implements BaseDao<Course> {
    private EntityManager em;
    @Autowired
    public CourseDao(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    @Transactional
    public List<Course> getAll() {
        return this.em.createQuery("SELECT c FROM Course c").getResultList();
    }

    @Override
    @Transactional
    public Course getById(int id) {
        return this.em.find(Course.class, id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return this.em.merge(course);
    }

    @Override
    @Transactional
    public Course update(Course course) {
        return this.em.merge(course);
    }

    @Override
    @Transactional
    public String delete(int id) {
        Course course = this.em.find(Course.class, id);
        if(course != null){
            this.em.remove(course);
            return "ok";
        } else
            return "error";
    }
}
