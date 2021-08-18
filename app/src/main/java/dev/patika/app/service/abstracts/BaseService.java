package dev.patika.app.service.abstracts;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll();
    T getById(int id);
    void save(T t);
    void update(T t);
    void delete(int id);
}
