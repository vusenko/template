package com.template.persistance;

/**
 * @author vusenko on 12/18/15.
 */
public interface BasicDao<T> {

    int create(T t);

    T read(int id);

    T update (T t);

    void delete (int id);

}
