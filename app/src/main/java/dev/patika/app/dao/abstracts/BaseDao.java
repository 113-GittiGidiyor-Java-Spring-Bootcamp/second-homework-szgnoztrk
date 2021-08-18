package dev.patika.app.dao.abstracts;

import java.util.List;

public interface BaseDao<T> {
    List<T> getAll();
    T getById(int id);
    void save(T t);
    void update(T t);
    void delete(int id);
}
