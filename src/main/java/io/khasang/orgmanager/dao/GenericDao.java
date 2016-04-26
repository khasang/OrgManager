package io.khasang.orgmanager.dao;

import java.util.List;

public interface GenericDao<T> {
    T get(Long id);
    List<T> getAll();
    void save(T object);
    void delete(T object);
}
