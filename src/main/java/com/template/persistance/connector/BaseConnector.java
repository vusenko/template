package com.template.persistance.connector;

/**
 * @author vusenko on 12/18/15.
 */
public interface BaseConnector <T> {

    int createData(T t);

    T readData(Class<T> tClass,int id);

    int updateData(T t);

    int deleteData(Class<T> tClass,int id);
}
