package com.template.persistance;

import com.google.inject.Singleton;

import com.template.model.User;

/**
 * @author vusenko on 12/18/15.
 */

@Singleton
public class UserDao implements BasicDao<User> {


    public int create(User user) {
        return 0;
    }

    public User read(int id) {
        return null;
    }

    public User update(User user) {
        return null;
    }

    public void delete(int id) {

    }
}
