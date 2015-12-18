package com.template.util;

import java.util.Properties;

import com.template.persistance.connector.PersistenceType;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author vusenko on 12/18/15.
 */

public class PropertiesRetriever {

    private static final String DB_PROPS = "db.properties";
    private static final String COUCHBASE_PROPS = "couchbase.properties";
    private static InputStream inputStream;

    public static Properties getProperties(PersistenceType persistenceType){
        if(PersistenceType.MYSQL == persistenceType){
            return getProperties(DB_PROPS);
        }
        return getProperties(COUCHBASE_PROPS);
    }

    private static Properties getProperties(String props){
        Properties properties = new Properties();
        try {
            inputStream = new FileInputStream(props);
            properties.load(inputStream);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            closeStream();
        }
        return properties;
    }

    private static void closeStream(){
        if(inputStream != null){
            try {
                inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
