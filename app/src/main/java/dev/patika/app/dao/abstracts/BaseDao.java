package dev.patika.app.dao.abstracts;

import java.util.List;

public interface BaseDao<T> {
    List<T> getAll();
    T getById(int id);
    T save(T t);
    T update(T t);
    String delete(int id);
}
