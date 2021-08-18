package dev.patika.app.dao.concretes;

import dev.patika.app.dao.abstracts.BaseDao;
import dev.patika.app.model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class InstructorDao implements BaseDao<Instructor> {
    private EntityManager em;
    @Autowired
    public InstructorDao(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    @Transactional
    public List<Instructor> getAll() {
        return this.em.createQuery("SELECT i FROM Instructor i").getResultList();
    }

    @Override
    @Transactional
    public Instructor getById(int id) {
        return this.em.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return this.em.merge(instructor);
    }

    @Override
    @Transactional
    public Instructor update(Instructor instructor) {
        return this.em.merge(instructor);
    }

    @Override
    @Transactional
    public String delete(int id) {
        Instructor instructor = this.em.find(Instructor.class, id);
        if(instructor != null){
            this.em.remove(instructor);
            return "ok";
        } else
            return "error";
    }
}
