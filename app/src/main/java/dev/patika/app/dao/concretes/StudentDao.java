package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentDao implements BaseDao<Student> {
    private EntityManager em;
    @Autowired
    public StudentDao(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    @Transactional
    public List<Student> getAll() {
        return this.em.createQuery("SELECT s FROM Student s").getResultList();
    }

    @Override
    @Transactional
    public Student getById(int id) {
        return this.em.find(Student.class, id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return this.em.merge(student);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return this.em.merge(student);
    }

    @Override
    @Transactional
    public String delete(int id) {
        Student student = this.em.find(Student.class, id);
        if(student != null){
            this.em.remove(student);
            return "ok";
        } else
            return "error";
    }
}
