package com.template.persistance.connector.database;

import com.google.inject.Singleton;

import java.sql.Connection;

import com.template.persistance.connector.BaseConnector;

/**
 * @author vusenko on 12/18/15.
 */

@Singleton
public class JdbcConnector<T> implements BaseConnector<T> {



    public int createData(T t) {
        return 0;
    }

    public T readData(Class <T> aClass, int id) {
        return null;
    }

    public int updateData(Object o) {
        return 0;
    }

    public int deleteData(Class <T> aClass, int id) {
        return 0;
    }


    private Connection getConnection(){
        return null;
    }
}
