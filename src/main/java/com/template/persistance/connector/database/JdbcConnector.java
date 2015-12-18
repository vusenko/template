package com.template.persistance.connector.database;

import java.util.Properties;

import com.google.inject.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.template.persistance.connector.BaseConnector;
import com.template.persistance.connector.PersistenceType;
import com.template.util.PropertiesRetriever;

/**
 * @author vusenko on 12/18/15.
 */

@Singleton
public class JdbcConnector implements BaseConnector {

    private static final String DRIVER = "driver";
    private static final String URL = "url";

    private Connection connection;

    public void getConnection(){
        if(connection != null){
            return;
        }

        Properties properties = PropertiesRetriever.getProperties(PersistenceType.MYSQL);
        try {
            Class.forName(properties.getProperty(DRIVER));
            connection = DriverManager.getConnection(properties.getProperty(URL));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
